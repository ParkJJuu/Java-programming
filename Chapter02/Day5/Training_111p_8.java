/*
 * 작성날짜 : 2023.09.15
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 111p 실습문제 - if 조건과 논리 연습
 * 
 * 문제 : ﻿2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다. 키보드로부터 직사각형을 구성하는
 * 두 점(x1, y1), (x2, y2)를 입력받아 (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과
 * 충돌하는지 판별하는 프로그램을 작성하라. 
 * 
 * 조건 : 다음은 점(x,y)가 (rectx1, recty1), (rectx2, recty2)의 사각형 안에 있으면 true를
 * 리턴하는 메소드이다. 이 메소드를 활용하라. 
 */
import java.util.Scanner;
public class Training_111p_8 {
	
	// main() 함수 밑에 작성하면 오류가 발생하므로, 반드시 main() 위에 메소드 정의해줄 것.
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점 (x1,y1), (x2, y2)의 좌표를 입력하시오>>");	// 좌표 입력하기
		
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();	// (x1, y1) 좌표 입력
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();	// (x2, y2) 좌표 입력
		
		if (inRect(x1, y1, 100, 100, 200, 200) && inRect(x2, y2, 100, 100, 200, 200)) {
			System.out.println("직사각형이 충돌하지 않습니다.");
		}
		else {
			System.out.println("직사각형이 충돌합니다. 좌표를 다시 입력해주세요.");
		}
		scan.close();
	}
}