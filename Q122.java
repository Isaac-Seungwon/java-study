package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q122 {
	
	public static final String FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\성적.dat";
	
	public static void main(String[] args) {
		/*
		● 요구사항
		성적을 확인 후 합격자/불합격자 명단을 출력하시오.
		
		● 조건
		- 합격 조건: 3과목 평균 60점 이상
		- 과락 조건: 1과목 40점 미만
		
		● 리소스
		파일 > 성적.dat
		
		● 데이터
		//이름,국어,영어,수학
		홍길동,50,60,70
		아무개,100,80,50
		하하하,98,48,56
		
		● 출력
		[합격자]
		홍길동 
		하하하 
		아무개 
		
		[불합격자]
		호호호 
		후후후 
		*/

		try {
			Scanner scan = new Scanner(System.in);
			BufferedReader reader = new BufferedReader(new FileReader(FILE));

			String line = null;
			
			LinkedList<String> passList = new LinkedList<String>(); // 합격자 명단을 저장할 리스트
			LinkedList<String> failList = new LinkedList<String>(); // 불합격자 명단을 저장할 리스트

			while ((line = reader.readLine()) != null) {
				String[] data = line.split(","); // 한 줄을 ',' 기준으로 나누어 배열로 저장
				
				String name = data[0]; // 이름 추출
				int koreanScore = Integer.parseInt(data[1]); // 국어 점수 추출
				int englishScore = Integer.parseInt(data[2]); // 영어 점수 추출
				int mathScore = Integer.parseInt(data[3]); // 수학 점수 추출
				int average = (koreanScore + englishScore + mathScore) / 3; // 평균 계산
				
				if (average >= 60) {
					passList.add(name); // 평균이 60 이상이면 합격자 명단에 추가
				} else {
					failList.add(name); // 평균이 60 미만이면 불합격자 명단에 추가
				}
			}

			System.out.println("[합격자]");
			for (String name : passList) {
				System.out.println(name); // 합격자 명단 출력
			}
			
			System.out.println("\n[불합격자]");
			for (String name : failList) {
				System.out.println(name); // 불합격자 명단 출력
			}
			
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
