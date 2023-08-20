package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q123 {

	public static final String FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\단일검색.dat";
	
	public static void main(String[] args) {
		/*
		● 요구사항
		이름을 입력받아 회원 정보를 검색 후 출력하시오.
		
		● 리소스
		파일 > 단일검색.dat
		
		● 입력
		이름: 홍길동 
		
		● 출력
		[홍길동]
		번호: 33 
		주소: 서울시 강남구 역삼동 
		전화: 010-2345-6789 
		*/
		
		try {
			Scanner scanner = new Scanner(System.in);
			BufferedReader reader = new BufferedReader(new FileReader(FILE));

			System.out.print("이름: ");
			String name = scanner.nextLine();

			String line;

			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				String memberName = data[1].trim(); // 비교할 이름 추출

				if (memberName.equals(name)) {
					printMemberInfo(data); // 회원 정보 출력 메소드 호출
					break; // 검색된 경우 반복문 종료
				}
			}

			reader.close();
			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 회원 정보 출력 메소드
	private static void printMemberInfo(String[] data) {
		String name = data[1];
		String number = data[0];
		String address = data[2];
		String phoneNumber = data[3].trim(); // 공백 제거
		
		System.out.printf("[%s]\n", name);
		System.out.printf("번호: %s\n", number);
		System.out.printf("주소: %s\n", address);
		System.out.printf("전화: %s\n", phoneNumber);
	}
}