/*
 * 작성날짜 : 2023.09.07
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 110p 실습문제 - Scanner 클래스로 키 입력
 * 
 * 문제 : Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라.
 * $1=1100원으로 가정하고 계산하라.
 */

import java.util.Scanner;
public class Training_110p_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int money = scan.nextInt();
		double dollar = money / 1100;
		System.out.println(money + "원은 $" + dollar + "입니다.");
		
		scan.close();
	}
}