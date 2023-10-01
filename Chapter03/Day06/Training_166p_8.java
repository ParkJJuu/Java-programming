/*
 * 작성날짜 : 2023.10.01
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 166p 실습문제 - 배열과 반복문 연습, 까다로운 조건 연습
 * 
 * 문제 : 정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수) 정수 배열을 생성하고,
 * 이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라. 배열에는 같은 수가 없도록 하고 배열을 출력하라.
 */
import java.util.Scanner;
public class Training_166p_8 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇개?");				// 사용자로부터 정수 입력받기
		int count = scan.nextInt(); 				// 정수 읽기
		
		int intArray[] = new int[count]; 			// 입력한 개수만큼 정수 배열 생성
		for (int i = 0; i < intArray.length; i++) {
			int r = (int)(Math.random()*100 + 1);	// 1~100까지 범위의 정수 랜덤 발생
			intArray[i] = r;						// 정수 저장
			
			for (int j = 0; j < i; j++) {			
				if (intArray[i] == intArray[j]) {	// 중복 정수 비교
					i--;							// 중복 정수 값이 발견되었을 경우,
					break;							// 새로운 랜덤 정수 값 받아오기
				}
			}
		}
		
		for (int k = 0; k < intArray.length; k++) {
			if ((k % 10 == 0) && (k != 0)) {		// 배열 10개씩 출력
				System.out.println();
			}
			System.out.print(intArray[k] + " ");	// 배열 랜덤 정수 값 출력
		}
		scan.close();
	}
}