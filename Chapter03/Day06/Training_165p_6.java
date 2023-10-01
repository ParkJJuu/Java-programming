/*
 * 작성날짜 : 2023.10.01
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 165p 실습문제 - 배열과 반복문 연습
 * 
 * 문제 : 배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로 된 돈의 액수를 입력받아 오만 원권,
 * 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전이 각 몇 개로
 * 변환되는지 예시와 같이 출력하라. 이때 반드시 다음 배열을 이용하고 반복문으로 작성하라.
 * 
 * 조건 : int [] unit = {50000, 10000, 1000, 5000, 100, 50, 10, 1}; + 반복문 // 환산할 돈의 종류
 */
import java.util.Scanner;
public class Training_165p_6 {
	public static void main(String[] args) {
		
		int [] unit = {50000, 10000, 1000, 5000, 100, 50, 10, 1};	// 환산할 돈의 종류
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");	// 금액 입력받기
		int money = scan.nextInt(); 			// 사용자가 입력한 금액 읽기
		
		for (int i = 0; i < unit.length; i++) {
			if (money / unit[i] >= 1 ) {
				System.out.println(unit[i] + "원 짜리 : " + money / unit[i] + "개");
				money %= unit[i];
			}
		}
		
		scan.close();
	}
}