/*
 * 작성날짜 : 2023.09.30
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 164p 실습문제 - 2중 중첩 반복문 연습
 * 
 * 문제 : ﻿Scanner를 이용하여 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라.
 * 다음은 5를 입력받았을 경우이다.
 */
import java.util.Scanner;
public class Training_164p_3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");	// 사용자 수 입력받기
		int num = scan.nextInt();				// 입력한 정수 읽기
		
		for (int i = 0; i < num; i++) {			
			for (int j = num; j > i; j--) {
				System.out.print("*");			// 별찍기
			}
			System.out.println();				// \n 출력
		}
	}
}