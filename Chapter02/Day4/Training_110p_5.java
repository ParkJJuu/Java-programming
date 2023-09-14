/*
 * 작성날짜 : 2023.09.12
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 110p 실습문제 - Scanner와 if문 연습
 * 
 * 문제 : ﻿Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지
 * 판별하라. 삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
 */
import java.util.Scanner;
public class Training_110p_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		// a, b변을 더했거나 a, c변을 더했을 때 나머지 변 값보다 클 경우
		if (((a + b) > c) || ((a + c) > b)) {	
			System.out.println("삼각형이 됩니다.");		// 삼각형 가능
		}
		// b, c변을 더했을 때 나머지 변 값(a변)보다 클 경우
		else if ((b + c) > a) {
			System.out.println("삼각형이 됩니다.");		// 삼각형 가능
		}
		// 두 변의 합이 다른 한 변의 값 보다 크지 않을 경우
		else {
			System.out.println("삼각형이 안 됩니다.");	// 삼각형 불가능
		}
	}
}