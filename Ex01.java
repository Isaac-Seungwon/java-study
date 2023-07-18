// 패키지 선언
// 현재 자바 파일이 어떤 패키지 내에 위치하는지를 표현한다
package com.test.java;

// 클래스 Class
// - 코드의 집합
// - public class Ex01: 클래스 선언부(Header)
// - {}: 클래스 몸통(Body), 구현부
public class Ex01 {

	// 메소드 Method
	// - 코드의 집합
	public static void main(String[] args) {

		// 명령어 > 문장 단위 구성
		// 자바의 문장 종결자: ;
		// - Systme: 클래스
		// - .: 멤버 접근 연산자 (부모.자식)
		// out: 필드(field)
		// println(): 메소드 호출
		// - 안녕하세요: 문자 리터럴
		
		System.out.println("안녕하세요.");
	}
	
	/*
		# 특수문자(영문 표현)
		~ , !, @, #, $, %, ^ (caret, xor)
		&, *, -, _, +, =, 
		;, :, ", ', ?, /, \ (back slash)
		` (역따옴표, back quote, back tick)
		| (pipe, vertical bar, or)
		( ), { }, [ ], < >
		
		# 코드 자동 완성
		이클립스 > 코드 자동 완성 > Ctrl + Space
		- 현재 상태에서 사용 가능한 문법만 보여준다는 점에서 중요하다.
		
		System.out.println();
		
		Ctrl + Alt + 방향키 (위/아래)
		Alt + 방향키 (위/아래)
		Ctrl + D
		단축키 모음: Ctrl + Shift + L
		Ctrl + F6
		
		프로그램 = 데이터 + 행동 -> 흐름
		
		자바의 자료형, Data Type
		- 데이터(자료)의 형태
		- 데이터의 길이(범위)와 생김새를 미리 정의하고, 그 정의에 따라 분류해놓은 규칙
		- 형태 + 길이
		
		*** 면접 때 명확하게 답변할 수 있어야 한다.
		1. 원시형 (Primitive Type)
			a. 숫자형
				1. 정수형
				
				2. 실수형
				
			b. 문자형
			
			c. 논리형
		2. 참조형 (Reference Type)
		
	*/
}
