/*
 * 작성날짜 : 2023.09.19
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 112p 실습문제 - Scanner, if-else, switch
 * 
 * 문제 : ﻿﻿﻿숫자를 입력받아 3~5는 "봄", 6~8은 "여름", 9~11은 "가을", 12,1,2의 경우 "겨울"을,
 * 그 외 숫자를 입력한 경우 "잘못입력"을 출력하는 프로그램을 작성하라.
 * 
 * 조건 : (1) if-else 문을 이용하여 프로그램을 작성하라.
 */
import java.util.Scanner;
public class Training_112p_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");	// 숫자 입력받기
		
		int month = scan.nextInt();
		
		if ((month >= 3) && (month <= 5)) { 		// 입력한 숫자가 3~5일 경우
			System.out.println("봄");				// 봄 출력
		}
		else if ((month >= 6) && (month <= 8)) { 	// 입력한 숫자가 6~8일 경우
			System.out.println("여름");			 	// 여름 출력
		}
		else if ((month >= 9) && (month <= 11)) {	// 입력한 숫자가 9~11일 경우
			System.out.println("가을");				// 가을 출력
		}
		else if ((month >= 12) && (month <= 2))	{	// 입력한 숫자가 12~2일 경우
			System.out.println("겨울");				// 겨울 출력
		}
		else {
			System.out.println("잘못입력");
		}
		scan.close();
	}
}