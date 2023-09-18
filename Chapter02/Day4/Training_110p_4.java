/*
 * 작성날짜 : 2023.09.12
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 110p 실습문제 - Scanner와 if문 연습
 * 
 * 문제 : Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
 * 평균값을 구하는 것이 아님에 주의하라.
 */
import java.util.Scanner;
public class Training_110p_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// Scanner 클래스 사용
		
		System.out.print("정수 3개 입력>>");		// 3개의 정수 입력받기 20 100 33
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if ((a > b && b > c) || (c > b && b > a)) { 
			System.out.println("중간값은 " + b); // 중간값 b
		}
		else if ((a > c && c > b) || (b > c && c > a)) {
			System.out.println("중간값은 " + c); // 중간값 c
		}
		else {	// 나머지 중간값 전부 a
			System.out.println("중간값은 " + a); 
		scan.close();
		}
	}
}