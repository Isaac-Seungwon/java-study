package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q126 {
	
	public static final String FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\출결.dat";
	
	public static void main(String[] args) {
		try {
			ArrayList<Employee> employeeList = readEmployeeData(FILE); // 직원 데이터 읽어오기
			
			printAttendanceResults(employeeList); // 출결 결과 출력
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 직원 데이터를 읽어오는 메소드
	/*
		1. 주어진 파일 경로로부터 출결 데이터를 읽고, 각 라인을 쉼표로 분리하여 직원의 이름, 출근 시간, 퇴근 시간을 추출
		3. findEmployee 메소드를 호출하여 이미 등록된 직원인지 확인하고, 해당 직원을 찾거나 새로 생성하여 ArrayList<Employee>에 추가
		4. 출근 시간이 9시보다 늦으면 isLate 메소드를 호출하여 지각 여부를 판단하고, 조퇴 시간이 18시보다 이르면 isEarlyOut 메소드를 호출하여 조퇴 여부를 판단
		5. 해당 직원의 지각과 조퇴 횟수만큼 증가
	*/
	private static ArrayList<Employee> readEmployeeData(String filePath) throws IOException {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				String name = temp[1];
				String inTime = temp[2];
				String outTime = temp[3];
				
				Employee employee = findEmployee(list, name);
				
				if (employee == null) {
					employee = new Employee(name, 0, 0);
					list.add(employee);
				}
				
				if (isLate(inTime)) {
					employee.incrementLateCount();
				}
				
				if (isEarlyOut(outTime)) {
					employee.incrementEarlyOutCount();
				}
			}
		}
		
		return list;
	}
	
	// 출결 결과를 출력하는 메소드
	// ArrayList<Employee> 객체에 저장된 직원 정보를 반복하여 이름, 지각 횟수, 조퇴 횟수를 출력
	private static void printAttendanceResults(ArrayList<Employee> employeeList) {
		System.out.println("[이름]\t[지각]\t[조퇴]");
		
		for (Employee employee : employeeList) {
			System.out.printf("%s\t%4d회\t%4d회\n", employee.getName(), employee.getLateCount(), employee.getEarlyOutCount());
		}
	}
	
	// 직원을 찾는 메소드
	// 주어진 이름과 일치하는 직원을 ArrayList<Employee>에서 찾아 반환
	private static Employee findEmployee(ArrayList<Employee> employeeList, String name) {
		for (Employee employee : employeeList) {
			if (employee.getName().equals(name)) {
				return employee; // 찾은 직원 객체 반환
			}
		}
		return null; // 해당 이름의 직원을 찾지 못한 경우 null 반환
	}
	
	// 지각 여부를 확인하는 메소드
	// 주어진 시간(출근 시간)이 9시보다 늦으면 지각으로 판단하여 true를 반환
	private static boolean isLate(String time) {
		return time.compareTo("9:00") > 0; // 9시보다 늦으면 지각으로 판단
	}
	
	// 조퇴 여부 확인하는 메소드
	// 주어진 시간(퇴근 시간)이 18시보다 이르면 조퇴로 판단하여 true를 반환
	private static boolean isEarlyOut(String time) {
		return time.compareTo("18:00") < 0; // 18시보다 이르면 조퇴로 판단
	}
}

// 직원의 이름, 지각 횟수, 조퇴 횟수를 저장하는 클래스
// 생성자를 통해 초기화하고, 지각과 조퇴 횟수를 증가시키는 메소드 구현
class Employee {
	
	private String name; // 직원 이름
	private int lateCount; // 지각 횟수
	private int earlyOutCount; // 조퇴 횟수
	
	public Employee(String name, int lateCount, int earlyOutCount) {
		this.name = name;
		this.lateCount = lateCount;
		this.earlyOutCount = earlyOutCount;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLateCount() {
		return lateCount;
	}
	
	public int getEarlyOutCount() {
		return earlyOutCount;
	}
	
	// 지각 횟수 증가 메소드
	public void incrementLateCount() {
		lateCount++;
	}
	
	// 조퇴 횟수 증가 메소드
	public void incrementEarlyOutCount() {
		earlyOutCount++;
	}
}


/*
package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q126 {
	
	public static final String FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\출결.dat";
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILE));
			
			ArrayList<Employee> list = new ArrayList<Employee>();

			String line = null;

			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				Employee e = getEmployee(list, temp[1]);
				
				if (e == null) {
					e = new Employee(temp[1], 0, 0);
					list.add(e);
				}
				
				if (temp[2].compareTo("9:00") > 0) {
					e.in++;
				}
				
				if (temp[3].compareTo("18:00") < 0) {
					e.out++;
				}
			}
			
			System.out.println("[이름]\t[지각]\t[조퇴]");

			for (Employee e : list) {
				System.out.printf("%s\t%4d회\t%4d회\n", e.name, e.in, e.out);
			}
			
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static Employee getEmployee(ArrayList<Employee> list, String name) {
		
		for (Employee e : list) {
			if (e.name.equals(name)) {
				return e;
			}
		}
		
		return null;
	}
}

class Employee {
	
	public String name;
	public int in;
	public int out;
	
	public Employee(String name, int in, int out) {
		this.name = name;
		this.in = in;
		this.out = out;
	}
	
	@Override
	public String toString() {
		return "{name=" + name + ", in=" + in + ", out=" + out + "}";
	}
}
*/