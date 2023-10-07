/*
 * 작성날짜 : 2023.10.07
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 167p 실습문제 - 반복문과 조건문 연습
 * 
 * 문제 : 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 화면에 출력해보자.
 * 1부터 시작하며 99까지만 한다. 실행 사례는 다음과 같다.
 */
public class Training_167p_13 {
	public static void main(String[] args) {
		
		int i = 1;							// i값은 1부터 시작
		
		while(i < 100) {					// i값이 99가 될 때 까지 반복
			// i값이 1~9일 경우 (한 자리 수)
			if (i < 10) {				
				if (i % 3 == 0) {		
					System.out.println(i + "박수 짝");
				}
				i++;
			}
			
			// i값이 10~99일 경우 (두 자리 수)
			else {							
				if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
					if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {	// i >= 30
						System.out.println(i + "박수 짝짝");
					}
					else {
						System.out.println(i + "박수 짝");
					}
				}
				i++;
			}
		}
	}
}
