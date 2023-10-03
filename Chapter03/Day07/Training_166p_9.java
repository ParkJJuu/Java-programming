/*
 * 작성날짜 : 2023.10.02
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 166p 실습문제 - 2차원 배열과 반복문 연습
 * 
 * 문제 : 4x4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여
 * 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라.
 */
public class Training_166p_9 {
	public static void main(String[] args) {
		
		int intArray[][] = new int [4][4];			// 4x4 2차원 배열 생성
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				int r = (int)(Math.random()*10 + 1);	// 1~10까지 범위의 정수 랜덤 생성
				intArray[i][j] = r;						// 배열에 정수 저장
				System.out.print(intArray[i][j] + "\t");// 2차원 배열 화면에 출력
			}
			System.out.println();
		}
	}
}