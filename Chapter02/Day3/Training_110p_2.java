/*
 * 작성날짜 : 2023.09.07
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 110p 실습문제 - Scanner /와 %연산자
 * 
 * 문제 : ﻿Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 십의 자리와
 * 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.
 */
import java.util.Scanner;
public class Training_110p_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = scan.nextInt();
		
		int ten_num = num / 10;
		int one_num = num % 10;
		
		if (ten_num == one_num) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}
		scan.close();
	}
}