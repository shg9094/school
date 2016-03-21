package grade.grade;

import java.util.ArrayList;

public interface GradeDAO {

	// c 성젃표 등록
	public void input(GradeBean grade); //추상 메소드 기능 은 추상화 속성은 추상화x
	// r 성적표 리스트 출력
	public GradeMemberBean[] getList();

	//r  성적표 조회 (학번)
	public GradeMemberBean getGradeByHak(int hak);

	//r  성적표 조회 (이름)
	public GradeMemberBean[] getGradeByName(String name);

	//r 카운트 조회
	public int getCount();

	//r 이름조회시 카운트 조회
	public int  getCountByName(String name);

	//u 성적표 수정
	public  String update(GradeBean grade);

	//d  성적표 삭제
	public  String delete(int hak);




}
