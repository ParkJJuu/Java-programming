/*
 * 작성날짜 : 2023.10.01
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 166p 실습문제 - 배열과 반복문 연습
 * 
 * 문제 : 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
 * 그리고 배열에 든 숫자들과 평균을 출력하라.
 * 
 * 조건 : 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라.
 * int i = (int)(Math.random()*10 + 1);
 */
public class Training_166p_7 {
	public static void main(String[] args) {
		
		int intArray [] = new int[10];	// 정수를 10개 저장하는 배열 생성
		//int intArray [] = {10, 5, 2, 9, 1, 4, 1, 5, 1, 5};	// 예제 속 random 정수
		double sum = 0;
		
		for (int j = 0; j < intArray.length; j++) {
			int i = (int)(Math.random()*10 + 1); // 정수 랜덤 발생 시키기
			intArray[j] = i;					 // 랜덤으로 발생한 정수 intArray 배열에 저장 
			sum += intArray[j];					 // intArray 배열 값 모두 더하기
		}
		
		System.out.print("랜덤한 정수들 : ");
		
		for (int k = 0; k < intArray.length; k++) {
			System.out.print(intArray[k] + " ");	// intArray 배열 속 정수 출력
		}
		
		System.out.println("\n평균은 " + (sum / intArray.length));	// intArray 배열 평균 출력
	}
}