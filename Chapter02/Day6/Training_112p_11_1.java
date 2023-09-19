/*
 * 작성날짜 : 2023.09.19
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 112p 실습문제 - Scanner, if-else, switch
 * 
 * 문제 : ﻿﻿﻿숫자를 입력받아 3~5는 "봄", 6~8은 "여름", 9~11은 "가을", 12,1,2의 경우 "겨울"을,
 * 그 외 숫자를 입력한 경우 "잘못입력"을 출력하는 프로그램을 작성하라.
 * 
 * 조건 : (2) switch 문을 이용하여 프로그램을 작성하라.
 */
import java.util.Scanner;
public class Training_112p_11_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		
		int month = scan.nextInt();
		
		switch(month) {
			case 3 :
			case 4 :
			case 5 : {
				System.out.println("봄");	// 3~5월일 경우, 봄 출력
				break;
			}
			
			case 6 :
			case 7 :
			case 8 : {
				System.out.println("여름");	// 6~8월일 경우, 여름 출력
				break;
			}
			
			case 9 :
			case 10 :
			case 11 : {
				System.out.println("가을");	// 9~11월일 경우, 가을 출력
				break;
			}
			
			case 12 :
			case 1 :
			case 2 : {
				System.out.println("겨울");	// 12~2월일 경우, 겨울 출력
				break;
			}
			
			default : {
				System.out.println("잘못입력"); 	// 잘 못 입력했을 경우
				break;
			}
		}
		scan.close();
	}
}