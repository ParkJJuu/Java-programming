/*
 * 작성날짜 : 2023.10.02
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 166p 실습문제 - 2차원 배열과 반복문, 까다로운 조건 연습
 * 
 * 문제 : 4x4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤하게 생성하여
 * 임의의 위치에 삽입하라. 동일한 정수가 있어도 상관없다. 나머지 6개의 숫자는 모두 0이다.
 * 만들어진 2차원 배열을 화면에 출력하라.
 */
public class Training_166p_10 {
	public static void main(String[] args) {
		
		int intArray [][] = new int[4][4]; 		// 4x4 2차원 배열 생성
		int count = 6; 							// 숫자를 0으로 바꿀 count 변수 6으로 초기화
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				int r = (int)(Math.random()*10 + 1); 	// 1~10까지 범위의 랜덤 정수 생성
				intArray[i][j] = r;						// 배열에 랜덤 정수 저장
			}
		}
	
		while(count > 0) {
			int x = (int)(Math.random()*3);				// 0~3까지의 배열의 x위치 intArray[x][] 
			int y = (int)(Math.random()*3);				// 0~3까지의 배열의 y위치 intArray[][y] 
			
			if (intArray[x][y] != 0) {					// 배열의 값이 0이 아니라면
				intArray[x][y] = 0;						// 배열에 0저장
				count--;
			}
			else 										// 배열 속 정수 값이 0이라면
				continue;								// 재반복
		}
		
		for(int k = 0; k < intArray.length; k++) {
			for(int p = 0; p < intArray[k].length; p++) {
				System.out.print(intArray[k][p] + "\t");	// 배열 출력
			}
			System.out.println();
		}
	}
}