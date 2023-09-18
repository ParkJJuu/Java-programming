/*
 * 작성날짜 : 2023.09.15
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 111p 실습문제 - Scanner, if 조건, 산술식
 * 
 * 문제 : ﻿﻿원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라.
 * 그리고 실수 값으로 다른 점 (x, y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
 * 
 * 조건 : 중심에서 점(x,y) 사이의 거리가 반지름보다 작거나 같으면 원의 내부에 있다. 변수 x에 대한
 * 제곱근의 값은 Math.sqrt(x)를 이용하면 된다. Math는 6장에서 설명한다.
 */
import java.util.Scanner;
public class Training_111p_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		
		double centerx = scan.nextDouble();	// 원의 중심 x
		double centery = scan.nextDouble();	// 원의 중심 y => (x, y)
		double radius = scan.nextDouble();	// 반지름
		
		System.out.print("점 입력>>");
		double x = scan.nextDouble();	// 다른 점 x
		double y = scan.nextDouble();	// 다른 점 y => (x, y)
		
		// Math.sqrt 함수 - 제곱근을 리턴하는 함수
		double result = Math.sqrt((x - centerx) * (x - centerx) + (y - centery) * (y- centery));
		if (result < radius) {
			System.out.println("(" + x + ", " + y + ")는 원 안에 있다.");
		}
		else {
			System.out.println("(" + x + ", " + y + ")는 원 안에 없다.");
			System.out.println("다시 시도하세요.");
		}
		scan.close();
	}
}