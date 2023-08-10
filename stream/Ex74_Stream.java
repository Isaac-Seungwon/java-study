package com.test.java.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.util.MyFile;

public class Ex74_Stream {

	public static void main(String[] args) {
		
		// Ex74_Stream
		
		/*
			자바 스트림
			1. 입출력 스트림
				- 파일 입출력, 콘솔 입출력, 네트워크 입출력..
			2. 스트림
				- Java 8(JDK 1.8)
				- 람다식 + 함수형 인터페이스
				- 배열(컬렉션)의 탐색(조작)을 지원한다.
				- 파일 입출력을 지원한다.
				- 디렉토리 탐색을 지원한다.
			
			배열, 컬렉션 탐색
			1. for문(루프변수)
			2. 향상된 for문
			3. Iterator
			4. Stream
		
		
			함수형 인터페이스
			1. Consumer
				- (매개변수) -> {구현부}
			
			2. Supplier
				- () -> {return 값}
			
			3. Function
				- (매개변수) -> {return 값}
				
			4. Operator
				- (매개변수) -> {return 값}
				- 매개변수와 반환값의 자료형이 동일하다.
				
			5. Predicate
				- (매개변수) -> {return 값}
				- 반환값이 boolean이다.
		*/
		
		
		String path = "test.java";
		
		// 배포
		// - 개발자 자바 소스 > (전달) > 다른 개발자
		// 1. 소스 자체 전달 > MyFile.java
		// 2. 컴파일한 실행 파일을 전달 > MyFile.class > 압축(1개 파일) > *.jar
		
		// import > 같은 프로젝트 내에서만 가능하다.
		MyFile mf = new MyFile();
		
		System.out.println(mf.getFileNameWithoutExtension(path)); // test
		System.out.println(mf.getExtension(path)); // java
		
		// m1();
		// m2();
		m3();
	}

	private static void m3() {
		
		// 함수형 프로그래밍 == 의식의 흐름대로
		Data.getIntList().stream().forEach(num -> System.out.printf("%4d", num));
		System.out.println();
	
		Data.getIntList().stream().forEach(num -> System.out.printf("%4d", num));
		System.out.println();

	}

	private static void m2() {

		// 배열(컬렉션) 탐색
		List<String> list = Data.getStringList(10); // 애플아케이드 국내 서비스 열흘 기존 모바일게임 경험 다른 새로운 경험
		
		// 1. for문
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// 2. 향상된 for문
		for (String word : list) {
			System.out.print(word + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// 3. Iterator
		Iterator<String> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// 4. Stream
		Stream<String> stream = list.stream();
		
		Consumer<String> c1 = str -> System.out.print(str + " ");
		
		// forEach 메소드
		// 1. stream으로부터 얻어낸 데이터를 1개씩 가져온다. (향상된 for문처럼)
		// 2. 가져온 데이터를 Consumer.accept() 메소드의 인자로 전달하고 메소드를 호출한다.
		// 3. 요소만큼 반복한다.
		stream.forEach(c1);
		
		stream = list.stream();
		stream.forEach(c1); // 스트림을 뽑아내면 다시 쓸 수 없다. (1회용이다.)	
		
		
		// 메소드 체이닝 > 함수형 프로그래밍 방식
		list.stream().forEach(str -> System.out.println(str));
	}

	private static void m1() {

		int[] nums1 = Data.getIntArray();
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums1.length);
		
		int[] nums2 = Data.getIntArray(5);
		System.out.println(Arrays.toString(nums2));
		
		// List<Integer>
		// 업캐스팅
		List<Integer> nums3 = Data.getIntList();
		System.out.println(nums3.size());
		
		List<Integer> nums4 = Data.getIntList(5);
		System.out.println(nums4);
		
		String[] txt = Data.getStringArray();
		System.out.println(Arrays.toString(txt));
		
		Item[] item = Data.getItemArray();
		System.out.println(Arrays.toString(item));
		
		User[] list = Data.getUserArray();
		System.out.println(Arrays.toString(list));
	}
}
