/*
 * 작성날짜 : 2023.09.15
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 111p 실습문제 - if 조건과 논리 연습
 * 
 * 문제 : ﻿2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현한다.
 * (100, 100)과 (200, 200)의 두 점으로 이루어진 사각형이 있을 때, Scanner를 이용하여 정수 x와
 * y값을 입력받고 (x, y)가 이 직사각형 안에 있는지를 판별하는 프로그램을 작성하라.
 */
import java.util.Scanner;
public class Training_111p_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");	// 좌표 입력받기
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		// x값이 100이상이고 200이하이며, y값이 100이상이고 200이하일 경우,
		if ((100 <= x && x <= 200) && (100 <= y && y <= 200)) {	
			System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");	// 직사각형 안에 존재함
		}
		else {
			System.out.println("(" + x + "," + y + ")는 사각형 안에 없습니다.");
			System.out.println("좌표를 다시 입력해주세요.");
		}
		scan.close();
	}
}