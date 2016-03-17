package member;

import java.util.HashMap;



public class MemberServiceImpl implements MemberService{
	HashMap<String,MemberBean> map;
	MemberDAO dao = new MemberDAO() {
		
		@Override
		public void update(MemberBean member) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public MemberBean selectMember(String id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void selectById(String id, String password) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void insert(MemberBean member) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(String id) {
			// TODO Auto-generated method stub
			
		}
	};
		// TODO Auto-generated constructor stub
	
	public MemberServiceImpl(){
			map = new HashMap<String,MemberBean>();
	}
	
	
	@Override
	public String join(MemberBean member) {
		// 회원가입
		map.put(member.getId(), member);
		return null ;
			
	}

	@Override
	public String login(String id, String password) {
		// 로그인
		//로그인 아이디가 존재 하지않아 실패에 따라서 메세지 전달
		
		return password ;
	}

	@Override
	public void update(MemberBean member) {
		// 수정
		map.put(member.getId(),member);
		
	}

	@Override
	public void remove(String id) {
		// 삭제
		
	}

	@Override
	public MemberBean detail(String id) {
		// TODO Auto-generated method stub
		return dao.selectMember(id);
		
	}
}
