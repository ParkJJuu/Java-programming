/*
 * �ۼ���¥ : 2023.10.02
 * �ۼ��� : ���ֿ�
 * �ۼ����� : ��ǰ �ڹ� ���α׷��� 166p �ǽ����� - 2���� �迭�� �ݺ��� ����
 * 
 * ���� : 4x4�� 2���� �迭�� ����� �̰��� 1���� 10���� ������ ������ �����ϰ� �����Ͽ�
 * ���� 16���� �迭�� �����ϰ�, 2���� �迭�� ȭ�鿡 ����϶�.
 */
public class Training_166p_9 {
	public static void main(String[] args) {
		
		int intArray[][] = new int [4][4];			// 4x4 2���� �迭 ����
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				int r = (int)(Math.random()*10 + 1);	// 1~10���� ������ ���� ���� ����
				intArray[i][j] = r;						// �迭�� ���� ����
				System.out.print(intArray[i][j] + "\t");// 2���� �迭 ȭ�鿡 ���
			}
			System.out.println();
		}
	}
}