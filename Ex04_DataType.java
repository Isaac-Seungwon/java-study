package com.test.java;

public class Ex04_DataType {

	public static void main(String[] args) {
		
		//Ex04_DataType.java
		
		// 변수 생성 방법, 주의할 점
		
		byte kor;
		kor = 100;
		System.out.println(kor);
		
		
		byte eng;
		eng = 90; // 255가지의 경우의 수 중에서 90이라는 수를 가리킨 것이다. (그만큼 찼다는 뜻이 아님)
		System.out.println(eng);
		
		//Duplicate local variable kor
		// byte kor;
		// kor = 70;
		
		// 변수명을 만들 때 규칙 ***
		// 1. 영문자 + 숫자 + '_'만 사용한다. (관습적)
		// 2. 숫자로 시작할 수 없다.
		// 3. 예약어(키워드)를 사용할 수 없다.
		// 4. 의미있게 해야 한다. *** 절대 생략하지 않고 전체 풀네임을 적도록 한다.
		// 5. 대소문자를 구분한다.
		
		// $를 변수명에 쓰는 것은 자바에서는 일반적이지 않다. (파이썬 같은 언어)
		
		// *** 폴더 명에 한글을 사용하는 것을 지양해야 한다.
		
		byte kor1;
		byte kor_1;
		byte 국어;
		byte kor_score;
		
		// byte kor1();
		// byte kor+;
		
		byte b1;
		b1 = 100;
		System.out.println(b1);
		
		// 수정, 치환
		b1 = 50; //기존 값 100을 가지고 있는 변수 b1에 새롭게 50을 도입
		System.out.println(b1);
		
		
		// 변수 (변하는 데이터)와 상수 (변하지 않는 데이터)
		
		// 변수 표현
		byte score;
		score = 100;
		System.out.println(score);
		
		score = 80;
		System.out.println(score);
		
		// 상수 표현
		System.out.println(100);
		
		// 표현은 동일하지만, 상수와 달리 변수는 치환이 가능하다.
		// 상수를 안 쓰는 건 아닌데, 바로 쓰는 건 흔하지 않다.
		
		// 국어 점수(100)
		kor = 100;
		System.out.println(kor); // 가독성 높음 (변수명 = 의미)		
		System.out.println(100); // 가독성 낮음 (상수는 그 의미를 추측하기 힘듬)
		
		
		// 프로그래밍 발전 방향 > 코드 재사용
		
		// 변수 선언 + 초기화
		byte b2 = 100;
		
		// byte b4;
		// byte b5;
		byte b4, b5;
		
		byte b6 = 10, b7 = 20, b8;
		
		
		// 지도 좌표(x, y)
		byte x1; //현재 x좌표
		byte y1; //현재 y좌표
		
		byte x2, y2; //마트 x좌표, 마트 y좌표

		byte x3, //마트 x좌표
			 y3; //마트 y좌표

		// 변수 선언 방식은 개인 취향이다.
		
		
	 	// 변수 명명법 패턴
		// 이름을 이렇게 지었더니 좀 더 관리하기 쉽더라~ 했던 것들이 공식화 되었다.
		// 더 나아가 큰 환경의 개발 환경에서는 이 규칙을 따르지 않으면 혜택을 누리기 힘든 경우도 있다.
		// 관습적이긴 하지만 지키지 않으면 안 되는 것 중 하나이다.
		
		// 1. 헝가리언 표기법
		// 식별자를 만들 때 식별자의 접두어로 자료형을 표시하는 방법
		// 변수를 사용할 때 위로 찾아가지 않아도, 변수 이름을 보는 것만으로도 어떤 타입인지를 알게 하는 것이 목표이다.
		// 요즘에는 잘 사용하지 않는다. 툴이 발전하면서 마우스를 올려보면 자료형이 나오게 되었기 때문이다.
		// F3을 누르면 변수 선언부로 이동한다.
		
		byte weight;
		
		byte byte_weight;
		byte byteWeight;
		byte bweight;
		byte bWeight;
		byte b_weight;
		
		// 2. 파스칼 표기법
		// 식별자 단어의 첫문자를 대문자로 표기하고, 나머지 문자는 소문자로 표기하는 방법.
		// 2개 이상의 단어를 합쳐서 만든 이름일 떄 장점이 생긴다.
		// 모든 단어를 붙이고 각 단어의 첫 문자를 대문자로 표기한다.
		// 사용) 클래스명
		
		byte height;
		byte Height;
	
		byte englishscore;
		byte EnglishScore;
		
		// 3. 캐멀 표기법
		// 식별자 단어의 첫문자를 소문자로 표기하고, 다음 단어의 첫문자부터 대문자로 표기하는 방법.
		// 2개 이상의 단어를 합쳐서 만든 이름일 떄 장점이 생긴다.
		// 모든 단어를 붙이고 각 단어의 첫 문자를 대문자로 표기한다.
		// 파스칼 표기법과 캐멀 표기법은 사용할 떄 있어서 첫 글자의 대문자만 다르다.
		// 이 방법을 사용한 책 표지에 쌍봉낙타가 있었어서 
		// 사용) 변수명, 메소드명
		// 팀작업을 위해서라도 이러한 규칙을 반드시 지켜야만 한다.
		// 코드 컨벤션: 읽고 관리하기 쉬운 코드를 작성하기 위한 일종의 코딩 스타일 규약(하나의 작성 표준)
		// 자바에서는 파스칼 표기법과 캐멀 표기법을 주로 사용한다.
		
		byte mathscore;
		byte MathScore; // 파스칼 표기법
		byte mathScore; // 캐멀 표기법
		
		byte MapPositionLatitude; // 파스칼 표기법
		byte mapPositionLatitude; // 캐멀 표기법
		
		// 4. 스네이크 표기법
		// 전부 소문자 표기를 한다.
		// 단, 합성어일 때 각 단어를 '_'로 연결한다.
		// 오래전부터 여기저기서 사용되어온 표기법 중 하나인데, 이건 취향 차이이다.
		// 표기법을 섞는 것은 팀작업에서 좋지 않다.
		
		byte english_score;
		
		// 5. 케밥 표기법
		// 전부 소문자 표기를 한다.
		// 단, 합성어일 때 각 단어를 '-'로 연결한다.
		// 자바는 케밥 표기법을 지원하지 않는다.
		// '-'를 뺴기 연산자로 인식하는 탓이다.
		// 사용) HTML, CSS에서 많이 사용한다.
		// 생긴 게 케밥처럼 생겼다.
		
		// byte english-score;
		
	}
	
}
