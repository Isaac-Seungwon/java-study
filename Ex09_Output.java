package com.test.java;

public class Ex09_Output {

	public static void main(String args[]) {
		
		// Ex09_Output
		
		/*
			CLI > Command Line Interface > 텍스트 기반 명령 입출력 환경
			GUI > Graphic User Interface > 화면 기반 입출력 환경
			
		 	콘솔 입출력, Console Input Output
		 	- 기본 입력 장치: 키보드
		 	- 기본 출력 장치: 모니터
		 	
		 	콘솔 출력
		 	- 클래스.필드.메소드(인자);
		 	
		 	1. System.out.println(값);
		 		- println 메소드
		 		- print line
		 	
		 	2. System.out.print(값);
		 		- print 메소드
		 	
		 	3. System.out.printf(값);
		 		- printf 메소드
		 		- print format 메소드
		 		- 형식 문자를 제공
		 		- 편리, 가독성
		 	
		*/
		
		// 성적표 출력하기
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;

		String name2 = "아무개";
		int kor2 = 100;
		int eng2 = 90;
		int math2 = 80;
		
		
		// 요구사항) "안녕하세요. Isaac님" 문장을 출력하시오.
		
		String name = "Isaac";
		
		System.out.println("안녕하세요. " + name + "님");
		
		System.out.printf("안녕하세요. %s님", name); // $s: 형식 문자
		
		// printf는 출력하는 모습을 한 번에 미리 볼 수 있다는 장점이 있다.
		
		
		// 요구사항) "안녕하세요. Isaac님. 안녕히 가세요. Isaac님."
		System.out.printf("안녕하세요. %s님. 안녕히 가세요. %s님.", name, name);
		
	}
}
