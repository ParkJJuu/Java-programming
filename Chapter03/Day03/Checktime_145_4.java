public class Checktime_145_4 {
	public static void main(String[] args) {
		
		int Array[][] = new int [4][];	// �� ���� ���۷��� �迭 ����
		Array[0] = new int[4]; 	// 0���� ���� 4���� �迭 ����
		Array[1] = new int[1];	// 1���� ���� 1���� �迭 ����
		Array[2] = new int[1];	// 2���� ���� 1���� �迭 ����
		Array[3] = new int[4];	// 3���� ���� 4���� �迭 ����
		
		int a = 0;
		
		for (int i = 0; i < Array.length; i++) {	// �迭�� ���� �� �ֱ�
			for (int j = 0; j < Array[i].length; j++) {	
				Array[i][j] = a;
				a++;
			}
		}
		
		for (int i = 0; i < Array.length; i++) {	// �迭 ����ϱ�
			for (int j = 0; j < Array[i].length; j++) {	
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
	}
}