package grade.grade;

import java.util.ArrayList;
import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	
	//멤버 필드  속성 모아둔곳
	ArrayList<GradeBean> gradeList;
	
	public GradeServiceImpl() {
		// TODO Auto-generated constructor stub초기화는 메서드가 한다 (생성자)
		gradeList = new ArrayList<GradeBean>();// 초기화
	}
	//멤버 메서드 에어리어 메서드 모아둔곳
	
	@Override
	public void input(GradeBean grade) {
		//  성적표 등록
		gradeList.add(new GradeBean("김구",2,100,100,100,100));
		gradeList.add(new GradeBean("강감찬",3,90,90,90,90));
		gradeList.add(new GradeBean("유관순",4,80,80,80,80));
		gradeList.add(new GradeBean("김구",5,70,70,70,70));
		gradeList.add(grade);
	}

	@Override
	public ArrayList<GradeBean> getList() {
		//  성적표 리스트
		return gradeList;
	}

	@Override
	public GradeBean getGradeByHak(int hak) {
		// 성적표 조회 (학번)
		
		GradeBean tempGrade = new GradeBean();
		for (int i = 0; i < gradeList.size(); i++) {
			//배열 arr[i] =  벡터 gradeList.get(i)
			int searchHak = gradeList.get(i).getHak();
			if (hak == searchHak) {
				
				tempGrade = gradeList.get(i);
				 break;
				 
			}
		}
		
		return tempGrade;
	}

	@Override
	public  ArrayList<GradeBean> getGradeByName(String name) {
		// 성적표 조회 (이름)
		ArrayList<GradeBean> tempList = new ArrayList<GradeBean>();
		for (int i = 0; i < gradeList.size(); i++) {
			if (name.equals(gradeList.get(i).getName())) {
				tempList.add(gradeList.get(i));
				
			}
		}
		return tempList;
	}

	@Override
	public int getCount() {
		
		return gradeList.size();
		//  카운트 조회
		
	}

	@Override
	public void getCountByName() {
		// 이름조회시 카운트 조회
		
	}

	@Override
	public String update(GradeBean grade) {
		// 성적표 수정
			
			String result = "수정하려는 학번이 존재하지 않음";
			
			GradeBean searchedGrade = getGradeByHak(grade.getHak());
			searchedGrade.setJava(grade.getJava());
			searchedGrade.setSql(grade.getSql());
			searchedGrade.setJsp(grade.getJsp());
			searchedGrade.setSpring(grade.getSpring());	
			
		
	/*	
		this.delete(grade.getHak());
		this.input(grade);
	*/
		return "수정성공";
	}

	@Override
	public String delete(int hak) {
		// 성적표 삭제
		String temp = "";
		return temp;
	}

	
	
	
}
