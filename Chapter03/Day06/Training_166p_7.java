/*
 * �ۼ���¥ : 2023.10.01
 * �ۼ��� : ���ֿ�
 * �ۼ����� : ��ǰ �ڹ� ���α׷��� 166p �ǽ����� - �迭�� �ݺ��� ����
 * 
 * ���� : ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�.
 * �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
 * 
 * ���� : 1���� 10���� ������ ������ �����ϰ� ������ ���� ���� �ڵ带 �̿��϶�.
 * int i = (int)(Math.random()*10 + 1);
 */
public class Training_166p_7 {
	public static void main(String[] args) {
		
		int intArray [] = new int[10];	// ������ 10�� �����ϴ� �迭 ����
		//int intArray [] = {10, 5, 2, 9, 1, 4, 1, 5, 1, 5};	// ���� �� random ����
		double sum = 0;
		
		for (int j = 0; j < intArray.length; j++) {
			int i = (int)(Math.random()*10 + 1); // ���� ���� �߻� ��Ű��
			intArray[j] = i;					 // �������� �߻��� ���� intArray �迭�� ���� 
			sum += intArray[j];					 // intArray �迭 �� ��� ���ϱ�
		}
		
		System.out.print("������ ������ : ");
		
		for (int k = 0; k < intArray.length; k++) {
			System.out.print(intArray[k] + " ");	// intArray �迭 �� ���� ���
		}
		
		System.out.println("\n����� " + (sum / intArray.length));	// intArray �迭 ��� ���
	}
}