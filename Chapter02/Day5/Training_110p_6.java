/*
 * 작성날짜 : 2023.09.15
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 111p 실습문제 - 연산자와 if 조건문 연습
 * 
 * 문제 : ﻿369 게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고 정수에 3, 6, 9 중 하나가 있는 경우는
 * "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라. 예를 들면, 키보드로
 * 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다.
 */
import java.util.Scanner;
public class Training_110p_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");		// 정수 입력받기
		int num = scan.nextInt();
		
		if (num % 10 <= 0) {	// 나머지 값이 0보다 작거나 같으면
			if (num % 3 == 0 || num % 6 == 0 || num % 9 == 0 ) {
				System.out.println("박수짝");		// 박수짝 출력
			}
		}
		else {	// 나머지 값이 0보다 크다면
			if (num % 3 == 0 || num % 6 == 0 || num % 9 == 0 ) {
				System.out.println("박수짝짝");	// 박수짝짝 출력
			}	
		}
		scan.close();
	}
}