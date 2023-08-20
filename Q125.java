package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Q125 {
	
	public static final String FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\괄호.java";
	
	public static void main(String[] args) {
		/*
		● 요구사항
		모든 괄호가 서로 짝이 맞는지 검사하시오.
		
		● 조건
		- 대상 괄호: (), {}
		- Stack 사용
		
		● 리소스
		파일 > 괄호.dat
		
		● 출력
		올바른 소스입니다.
		
		● 출력
		올바르지 않은 소스입니다.
		*/
		
		try {
			String code = readCodeFromFile(FILE);
			
			// 괄호 짝이 맞는지 검사하여 결과 출력
			if (isBracketMatching(code)) {
				System.out.println("올바른 소스입니다.");
			} else {
				System.out.println("올바르지 않은 소스입니다.");
			}
			
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
	// 파일에서 코드를 읽어오는 메소드
	/*
		1. 지정된 파일 경로로부터 코드를 읽어와서 StringBuilder에 저장
		2. 파일을 열고 읽은 뒤에는 자동으로 리소스 닫음
		3. 읽어온 코드를 문자열로 반환
	*/
	private static String readCodeFromFile(String filePath) throws IOException {
		StringBuilder codeBuilder = new StringBuilder();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				codeBuilder.append(line).append("\r\n"); // 각 줄의 코드를 더함
			}
		}
		
		return codeBuilder.toString(); // // 읽어온 코드를 문자열로 반환
	}
	
	// 괄호 짝이 맞는지 검사하는 메소드
	/*
		1. 스택(Stack)을 사용하여 괄호 짝을 확인
		2. for 루프를 통해 코드의 문자를 하나씩 검사하면서, 괄호 여는 기호((, {)를 스택에 추가하고, 괄호 닫는 기호(), })를 만나면 스택에서 꺼냄
		3. 이때 스택에서 꺼낸 괄호와 현재 검사 중인 괄호의 짝이 맞는지 또한 확인
		4. 위의 과정을 반복하여 여는 괄호를 찾을 때마다 스택에 push하고, 닫는 괄호를 찾을 때 스택에서 pop하여 짝을 맞춤
		5. 만약 스택이 비어있을 때 닫는 괄호가 나오면 괄호가 올바르지 않으므로 검사를 중단하고 false를 반환
		6. 모든 문자를 검사한 뒤에도 스택이 비어있지 않으면 여는 괄호가 더 많거나 닫는 괄호가 더 많은 경우이므로 검사를 중단하고 false를 반환
		7. 모든 검사를 통과하여 스택이 비어있으면(isEmpty) 괄호 짝이 올바르게 맞아 떨어지는 것으로 판단하여 true를 반환
	*/
	private static boolean isBracketMatching(String code) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < code.length(); i++) {
			char c = code.charAt(i);
			
			// 여는 괄호일 경우 스택에 push
			if (c == '(' || c == '{') {
				stack.push(c);
			}
			
			// 닫는 괄호일 경우 짝이 맞는지 검사
			if (c == ')' || c == '}') {
				if (stack.isEmpty()) {
					return false; // 닫는 괄호가 더 많은 경우
				}
				
				char openBracket = stack.pop(); // 스택에서 맨 위의 괄호를 꺼냄
				
				// 괄호 짝이 맞지 않는 경우
				if ((c == ')' && openBracket != '(') || (c == '}' && openBracket != '{')) {
					return false;
				}
			}
		}
		
		return stack.isEmpty(); // 모든 괄호가 제대로 닫혔는지 검사
	}
}

/*
try {
	BufferedReader reader = new BufferedReader(new FileReader(FILE));

	Stack<Character> stack = new Stack<Character>();
	
	String line = null;
	String text = "";
	
	while ((line = reader.readLine()) != null) {

		text += line + "\r\n";
		// System.out.println(line);
	}

	reader.close();
	
	for (int i=0; i<text.length(); i++) {
		
		char c = text.charAt(i);
		
		if (c == '(' || c == '{') {
			stack.push(c);
		}
		
		if (c == ')' || c == '}') {
			stack.pop();
		}
	}
	
	if (stack.size() == 0) {
		System.out.println("올바른 소스입니다.");
	} else {
		System.out.println("올바르지 않은 소스입니다.");
	}
	
} catch (IOException e) {
	System.out.println("Error");
	e.printStackTrace();
}
*/
