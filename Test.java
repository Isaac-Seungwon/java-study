package com.test.java;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		/*
		//회원가입, 로그인, 계정찾기, 프로그램 종료
		System.out.println("┌───────────────────┐");
		System.out.println("│     초기화면      │");
		System.out.println("└───────────────────┘");
		System.out.println("┌───────────────────┐");
		System.out.println("│   1. 로그인       │");
		System.out.println("│   2. 로그아웃     │");
		System.out.println("│   3. 회원가입     │");
		System.out.println("└───────────────────┘");
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("[관리자로 로그인하셨습니다.]\n");
		
		System.out.printf("┌───────────────────전체 회원 목록 조회───────────────────┐\n");
		System.out.printf("│ 번호   이름     나이    성별     아이디            비밀번호            전화번호            주소\n");
		System.out.printf("│  %3d    %3s     %3d      %s     %s    \n", 100, "이승원", 24, "남", "jaojfojsog");
//		System.out.print("│   1   이승원    24      남         fjojaop          dm113131v123$      010-1351-2135");
	}
}
