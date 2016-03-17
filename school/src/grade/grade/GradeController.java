package grade.grade;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class GradeController {
	private static  ArrayList<GradeBean> tempList;

	public static void main(String[] args, int hak) {
		
		Scanner s = new Scanner(System.in);
		GradeServiceImpl service = new GradeServiceImpl();
		
		
		
		while (true) {
			System.out.println("[메뉴]1.등록2.수정3.삭제4.조회(전체)5.조회(이름)6.조회(학번)7.회원수0.종료");
			
			
			switch (s.nextInt()) {
			
			case 1: 
				System.out.println("이름,학번,자바,spl,jsp,스프링 점수를 입력");
				GradeBean grade = new GradeBean(s.next(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt());
				service.input(grade);
				break;
			case 2: 
				System.out.println("수정하려는 성적표의 학번 자바 SQL JSP 스프링 점수 입력");
				String name = service.getGradeByHak(hak).getName();
				System.out.println(service.update(
									new GradeBean(name,hak,s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt())));
					
				
				int hak1 = s.nextInt();
				service.update(new GradeBean(name,hak1,s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()));
				break;
			case 3: 
				System.out.println("삭제하는 학번을 입력하시오");
				System.out.println(service.delete(s.nextInt()));
				break;
			case 4: 
				System.out.println(service.getList());
				break;
			case 5: 
				System.out.println("조회 하려는 이름입력");
				System.out.println(service.getGradeByName(s.next()));
				System.out.println((tempList.size() == 0) ? "조회하는 이름이 없습니다" : tempList());
				break;
			case 6: 
				System.out.println("조회하는 학번을 입력하시오");
				GradeBean temp = service.getGradeByHak(s.nextInt());
				System.out.println((temp.getName() == null) ? "조회학번이 없습니다" : temp.toString()); 
				break;
				
				
			case 7: 
				System.out.println(service.getCount());
				break;
			case 0: 
				return;
			default: System.out.println("잘못된값 ");return;
			}
			
		}
	}

	private static String tempList() {
		// TODO Auto-generated method stub
		return null;
	}
}
