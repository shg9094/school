package com.movie.web.member;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴]1회원가입2로그인3내정보보기4내정보수정5종료");
			switch (s.nextInt()) {
			case 1: 
				System.out.println("아이디 비번 이름  주소 생년월일 입력");
				System.out.println("Main 회원가입결과 :"+
				service.join(new MemberBean(s.next(),s.next(),s.next(),s.next(),s.nextInt(),s.next(),s.next())));
				break;
			case 2: 
				System.out.println("아이디와 비밀번호를 입력해주세요");
				System.out.println(service.login(s.next(), s.next()));
				break;
			case 3:
				System.out.println("아이디 입력");
				System.out.println(service.detail(s.next()).toString());
				break;
			case 4: break;
			case 5: break;
			case 0: System.out.println("시스템 종료");return;
			
			default:
				return;
			}
		}
	}
}