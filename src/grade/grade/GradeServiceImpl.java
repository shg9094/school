package grade.grade;

import java.util.ArrayList;

/**
 * CRUD 
 * C : create 생성
 * R : read 조회
 * U : update 수정
 * D : delete 삭제
 * 
 * */

public class GradeServiceImpl implements GradeService {
	
	//멤버 필드  속성 모아둔곳
	GradeDAO dao;
	
	public GradeServiceImpl() {
		// TODO Auto-generated constructor stub초기화는 메서드가 한다 (생성자)
		dao = new GradeDAOImpl();
		
	}
	//멤버 메서드 에어리어 메서드 모아둔곳
	
	@Override
	public void input(GradeBean grade) {
		//  성적표 등록
		
	}

	@Override
	public GradeMemberBean[] getList() {
		//  성적표 리스트
				
		return dao.getList();
	}


	@Override
	public  GradeMemberBean[] getGradeByName(String name) {
		return dao.getGradeByName(name);
		// 성적표 조회 (이름)
		
	}

	@Override
	public int getCount() {
		
		return dao.getCount();
		//  카운트 조회
		
	}


	@Override
	public String update(GradeBean grade) {
		// 성적표 수정
		
		String result =  "수정하려는 학번이 존재 하지 않음";
		
		return result;
	}

	@Override
	public String delete(int hak) {
		// 성적표 삭제
		
		return true ? "삭제 성공" : "삭제 실패";
	}

	@Override
	public GradeMemberBean getGradeByHak(int hak) {
		
		return dao.getGradeByHak(hak);
	}

	@Override
	public ArrayList<GradeBean> getCountByName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
