package com.test.java.collection;

public class Ex66_Anonymous {

	public static void main(String[] args) {
		
		// Ex66_Anonymous.java
		
		/*

			익명 객체, Anonymous Object
			- 익명 클래스, Anonymous Class
			- 이름 없는 클래스
		
		*/
		
		// 요구사항) 인터페이스를 구현한 클래스 선언 > 객체 생성
		
		// 1. 본인 타입으로 참조 변수 만들기
		BBB b1 = new BBB();
		b1.aaa();
		System.out.println();
		
		
		// 2. 부모 타입(인터페이스)으로 참조 변수 만들기
		AAA b2 = new BBB();
		b2.aaa();
		System.out.println();
		
		
		// 3. 구현부가 없는 메소드이므로 불가능하다고 했었지만..?
		// AAA b3 = new AAA();
		// b3.aaa();
		
		
		// AAA b3 = new AAA() {};
		// 중괄호를 넣었다. 여전히 에러가 발생한다.

		// The type new AAA(){} must implement the inherited abstract method AAA.aaa()
		// 인터페이스를 상속받는 일반 클래스가 인터페이스가 반드시 만들라고 하는 추상 메소드를 구현하지 않았을 때 발생하는 에러가 발생했다.
		
		// new AAA()는 없다고 생각한다. <- 임시 머리통 역할
		// 머리통이 없는 클래스 선언이라고 생각하면 된다. (몸통만 있는 클래스)
		// 클래스에서 머리통의 역할은 이름을 붙이는 것 뿐이다.
		// 이게 바로 '익명 클래스'이다.
		
		// 강제로 자식 클래스가 된다.
		AAA b3 = new AAA() {
			@Override
			public void aaa() {
				System.out.println("aaa");
			}
		};
		
		
		
		
	}// main
}

interface AAA {
	void aaa();
}

// The type BBB must implement the inherited abstract method AAA.aaa()
class BBB implements AAA {
	@Override
	public void aaa() {
		System.out.println("aaa");
	}
}

