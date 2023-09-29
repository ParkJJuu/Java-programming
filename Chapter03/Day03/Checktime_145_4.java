public class Checktime_145_4 {
	public static void main(String[] args) {
		
		int Array[][] = new int [4][];	// 각 행의 레퍼런수 배열 생성
		Array[0] = new int[4]; 	// 0행의 정수 4개의 배열 생성
		Array[1] = new int[1];	// 1행의 정수 1개의 배열 생성
		Array[2] = new int[1];	// 2행의 정수 1개의 배열 생성
		Array[3] = new int[4];	// 3행의 정수 4개의 배열 생성
		
		int a = 0;
		
		for (int i = 0; i < Array.length; i++) {	// 배열에 원소 값 넣기
			for (int j = 0; j < Array[i].length; j++) {	
				Array[i][j] = a;
				a++;
			}
		}
		
		for (int i = 0; i < Array.length; i++) {	// 배열 출력하기
			for (int j = 0; j < Array[i].length; j++) {	
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
	}
}