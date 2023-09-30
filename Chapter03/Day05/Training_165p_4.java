/*
 * 작성날짜 : 2023.09.30
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 165p 실습문제 - 2중 중첩 반복문 연습
 * 
 * 문제 : Scanner를 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을 작성하라.
 * 다음은 e를 입력받았을 경우이다.
 * 
 * 조건 : Scanner는 문자를 입력받는 기능이 없다. 그러므로 문자열을 입력받아야 한다. 다음 코드를 참고하라.
 */
import java.util.Scanner;
public class Training_165p_4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");	 // 사용자 소문자 알파벳 입력받기
		String s = scan.next();		// 알파벳 읽기
		char c = s.charAt(0);		// 문자열의 첫 번째 문자 c변수에 저장

		for (int i = 0; i <= c - 'a'; i++) {		// 별 찍기
			for (int j = c - 'a'; j >= i; j--) {
				System.out.print((char)(c - j));
			}
			System.out.println();					// \n 출력
		}
		
	}
}