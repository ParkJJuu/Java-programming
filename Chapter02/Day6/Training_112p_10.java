/*
 * 작성날짜 : 2023.09.19
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 112p 실습문제 - Scanner, if 조건, 산술식
 * 
 * 문제 : ﻿﻿﻿원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다.
 * 두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.
 */
import java.util.Scanner;
public class Training_112p_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");	// 입력받기
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		double radius1 = scan.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");	// 입력받기
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		double radius2 = scan.nextDouble();
		
		// Math.sqrt 함수를 이용해, 두 점 사이의 거리 구하기
		double result = Math.sqrt((x1-y1)*(x1-y1)+(x2-y2)*(x2-y2));	
		
		// 다른 원의 외부일 경우
		if (radius1 + radius2 < result) {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
		// 그렇지 않을 경우
		else {
			System.out.println("두 원은 서로 겹친다.");
		}
		scan.close();
	}
}