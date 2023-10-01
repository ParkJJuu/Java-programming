/*
 * 작성날짜 : 2023.10.01
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 165p 실습문제 - 배열과 반복문 연습
 * 
 * 문제 : 양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는
 * 프로그램을 작성하라.
 */
import java.util.Scanner;
public class Training_165p_5 {
	public static void main(String[] args) {
		
		int intArray[] = new int [10];	// 정수형 배열 10개 선언
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");	// 양의 정수 10개 입력받기
		
		for (int i = 0; i < 10; i++) {
			intArray[i] = scan.nextInt();	// 사용자가 입력한 숫자 입력 읽기
		}
		
		System.out.print("3의 배수는 ");
		
		for (int i = 0; i < 10; i++) {
			if (intArray[i] % 3 == 0 ) {
				System.out.print(intArray[i] + " ");	// 3의 배수 출력
			}
		}
		
		scan.close();
	}
}