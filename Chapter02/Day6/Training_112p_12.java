/*
 * 작성날짜 : 2023.09.19
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 112p 실습문제 - Scanner로 문자열 입력, if-else, switch
 * 
 * 문제 : ﻿﻿﻿사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 +, -, *, /의 네 가지로 하고
 * 피연산자는 모두 실수로 한다. 피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다. 0으로
 * 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
 * 
 * 조건 : (1) 연산 식을 구분할 때 if-else 문을 이용하여 프로그램을 작성하라.
 */
import java.util.Scanner;
public class Training_112p_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("연산>>");	//	 연산 입력받기
		
		int a = scan.nextInt();			// 피연산자 입력받기
		String ari = scan.next();		// 연산자 입력받기
		int b = scan.nextInt();			// 피연산자 입력받기
		
		if (ari.equals("+")) {		// '+' 연산
			System.out.println(a + ari + b + "의 계산결과는 " + (a + b));
		}
		else if (ari.equals("-")) {	// '-' 연산
			System.out.println(a + ari + b + "의 계산결과는 " + (a - b));
		}
		else if (ari.equals("*")) {	// '*' 연산
			System.out.println(a + ari + b + "의 계산결과는 " + (a * b));
		}
		else if (ari.equals("/")) {	// '/' 연산
			if ((a == 0) || (b == 0)) {		// 피연산자 값이 0일 경우,
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				System.out.println(a + ari + b + "의 계산결과는 " + (a / b));
			}
		}
		scan.close();
	}
}