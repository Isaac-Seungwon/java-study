package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q124 {

	public static final String GUEST_FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\검색_회원.dat";
	public static final String ORDER_FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\검색_주문.dat";

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			String name = getNameFromUser(scanner); // 사용자로부터 이름을 입력받음
			String[] guestData = findGuestData(name); // 입력한 이름으로 회원 정보 검색

			if (guestData != null) {
				System.out.println("==== 구매내역 ====");
				System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
				findAndPrintOrderData(name, guestData[0], guestData[2]); // 주문 정보 검색 및 출력
			}

			scanner.close();

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	// 이름 입력 메소드
	private static String getNameFromUser(Scanner scanner) {
		System.out.print("이름: ");
		return scanner.nextLine();
	}

	// 주문 정보 출력 메소드
	private static void printOrderInfo(String name, String[] orderData, String address) {
		System.out.printf("%s\t%s\t%s\t\t%s\t%s\r\n", orderData[0], name, orderData[1], orderData[2], address);
	}
	
	// 회원 정보 검색 메소드
	private static String[] findGuestData(String name) throws IOException {
		try (BufferedReader guestReader = new BufferedReader(new FileReader(GUEST_FILE))) {
			String line;
			
			while ((line = guestReader.readLine()) != null) {
				String[] guestData = line.split(",");
				
				if (guestData[1].equals(name)) {
					return guestData; // 검색된 회원 정보 반환
				}
			}
		}
		return null; // 검색된 회원 정보 없을 시 null 반환
	}

	// 주문 정보 검색 및 출력 메소드
	private static void findAndPrintOrderData(String name, String guestNumber, String address) throws IOException {
		try (BufferedReader orderReader = new BufferedReader(new FileReader(ORDER_FILE))) {
			String line;
			
			while ((line = orderReader.readLine()) != null) {
				String[] orderData = line.split(",");
				if (orderData[3].equals(guestNumber)) {
					printOrderInfo(name, orderData, address); // 주문 정보 출력
				}
			}
		}
	}
}

/*
try {
	Scanner scan = new Scanner(System.in);
	BufferedReader guestReader = new BufferedReader(new FileReader(GUEST_FILE));
	BufferedReader orderReader = new BufferedReader(new FileReader(ORDER_FILE));

	System.out.print("이름: "); // 정재재, 황길돈, 길형수...
	String name = scan.nextLine();

	String line = null;
	String num = "";
	String address = "";

	while ((line = guestReader.readLine()) != null) {

		String[] temp = line.split(",");
		
		if (temp[1].equals(name)) {
			num = temp[0];
			address = temp[2];
			break;
		}
	}

	if (!num.equals("")) {

		System.out.println("==== 구매내역 ====");
		System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");

		while ((line = orderReader.readLine()) != null) {

			String[] temp = line.split(",");

			if (temp[3].equals(num)) {
				System.out.printf("%s\t%s\t%s\t\t%s\t%s\r\n", temp[0], name, temp[1], temp[2], address);
			}
		}

	}

	scan.close();
	guestReader.close();
	orderReader.close();
	
} catch (IOException e) {
	System.out.println("Error");
	e.printStackTrace();
}
}*/
