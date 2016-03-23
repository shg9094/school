package member;

import java.util.HashMap;

public class MemberServiceImpl implements MemberService{
		private static MemberService instance = new MemberServiceImpl();
		HashMap<String, MemberBean> map;
		MemberDAO dao = MemberDAOImpl.getInstance();
		public static MemberService getInstance() {
			return instance;
		}

			
		public MemberServiceImpl(){
			map = new HashMap<String,MemberBean>();
		}

		@Override
		public int join(MemberBean member) {
			// 회원 가입
			
			return dao.insert(member);

		}

		

		@Override
		public MemberBean login(String id, String password) {
			MemberBean member = new MemberBean();
			member = dao.selectById(id,password);
			if (member != null) {
				System.out.println("서비스 : 멤버가 널이 아님");
				return member;
			} else {
				System.out.println("서비스 : 멤버가 널");
				return null;
			}
					
		}

		@Override
		public MemberBean detail(String id) {
			// TODO Auto-generated method stub
			return dao.selectMember(id);
		}

		@Override
		public int update(MemberBean member) {
			
			return dao.update(member);
		}

		@Override
		public int remove(String id) {
			
			return dao.delete(id);
		}

		@Override
		public boolean isMember(String id) {
			boolean member = false;
			member = dao.isMember(id);
			
			if(member == true) {
			
				return member;
				
			} else {
				
				return false;
			}
			
		}
}