package member;

import java.util.HashMap;

public class MemberServiceImpl implements MemberService{

	
	
	HashMap<String, MemberBean> map;
	MemberDAO dao = new MemberDAOImpl();
		
		public MemberServiceImpl(){
			map = new HashMap<String,MemberBean>();
		}

		@Override
		public void join(MemberBean member) {
			// 회원 가입
			
			map.put(member.getId(),member);
			
		}

		

		@Override
		public String login(String id, String password) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MemberBean detail(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void update(MemberBean member) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void remove(String id) {
			// TODO Auto-generated method stub
			
		}
}