/*
 * �ۼ���¥ : 2023.10.02
 * �ۼ��� : ���ֿ�
 * �ۼ����� : ��ǰ �ڹ� ���α׷��� 166p �ǽ����� - 2���� �迭�� �ݺ���, ��ٷο� ���� ����
 * 
 * ���� : 4x4�� 2���� �迭�� ����� �̰��� 1���� 10���� ������ ������ 10���� �����ϰ� �����Ͽ�
 * ������ ��ġ�� �����϶�. ������ ������ �־ �������. ������ 6���� ���ڴ� ��� 0�̴�.
 * ������� 2���� �迭�� ȭ�鿡 ����϶�.
 */
public class Training_166p_10 {
	public static void main(String[] args) {
		
		int intArray [][] = new int[4][4]; 		// 4x4 2���� �迭 ����
		int count = 6; 							// ���ڸ� 0���� �ٲ� count ���� 6���� �ʱ�ȭ
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				int r = (int)(Math.random()*10 + 1); 	// 1~10���� ������ ���� ���� ����
				intArray[i][j] = r;						// �迭�� ���� ���� ����
			}
		}
	
		while(count > 0) {
			int x = (int)(Math.random()*3);				// 0~3������ �迭�� x��ġ intArray[x][] 
			int y = (int)(Math.random()*3);				// 0~3������ �迭�� y��ġ intArray[][y] 
			
			if (intArray[x][y] != 0) {					// �迭�� ���� 0�� �ƴ϶��
				intArray[x][y] = 0;						// �迭�� 0����
				count--;
			}
			else 										// �迭 �� ���� ���� 0�̶��
				continue;								// ��ݺ�
		}
		
		for(int k = 0; k < intArray.length; k++) {
			for(int p = 0; p < intArray[k].length; p++) {
				System.out.print(intArray[k][p] + "\t");	// �迭 ���
			}
			System.out.println();
		}
	}
}