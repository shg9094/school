package grade;

import java.util.ArrayList;

/**
 * CRUD 
 * C : create 생성
 * R : read 조회
 * U : update 수정
 * D : delete 삭제
 * 
 * */

public class GradeServiceImpl implements GradeService{
	// 멤버 필드
	ArrayList<GradeBean> gradeList;
	GradeDAO dao = new GradeDAOImpl(); 
	private static GradeService instance = new GradeServiceImpl();
	
	public static GradeService getInstance() {
		return instance;
	}
	
	public GradeServiceImpl() {
		gradeList = new ArrayList<GradeBean>(); // 초기화
	}
	// 멤버 메소드 에어리어
	@Override
	public void input(GradeBean grade) {
		// 성적표 등록 
		gradeList.add(new GradeBean(2,"김구",100,100,100,100));
		gradeList.add(new GradeBean(3,"강감찬",90,90,90,90));
		gradeList.add(new GradeBean(4,"유관순",80,80,80,80));
		gradeList.add(new GradeBean(5,"김구",70,70,70,70));
		gradeList.add(grade);
	}

	@Override
	public ArrayList<GradeBean> getList() {
		// 성적표 리스트 출력
		return gradeList;
	}

	@Override
	public GradeMemberBean getGradeByHak(int hak) {
		// 성적표 조회(학번)
	
		return dao.selectGradeByHak(hak);
	}

	public ArrayList<GradeMemberBean> getGradesByName(String name) {
		// 성적표 조회(이름)
		return dao.selecctGradesByName(name);
		
	}

	@Override
	public String update(GradeBean grade) {
		// 성적표 수정
		String result = "수정하려는 학번이 존재하지 않음";
		
		return result;
	}

	@Override
	public String delete(int hak) {
		// 성적표 삭제
		return (gradeList.remove(getGradeByHak(hak))) ? "삭제 성공" : "삭제 실패";
	}

	@Override
	public int getCount() {
		// 카운트 조회
		return gradeList.size();
	}

	@Override
	public ArrayList<GradeBean> getCountByName() {
		return gradeList;
		// 이름조회시 카운트 조회
		
	}
	@Override
	public GradeMemberBean[] getGradeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}