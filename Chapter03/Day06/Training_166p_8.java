/*
 * �ۼ���¥ : 2023.10.01
 * �ۼ��� : ���ֿ�
 * �ۼ����� : ��ǰ �ڹ� ���α׷��� 166p �ǽ����� - �迭�� �ݺ��� ����, ��ٷο� ���� ����
 * 
 * ���� : ������ �� �� �������� Ű����κ��� ������ �Է¹޾�(100���� ���� ����) ���� �迭�� �����ϰ�,
 * �̰��� 1���� 100���� ������ ������ �����ϰ� �����϶�. �迭���� ���� ���� ������ �ϰ� �迭�� ����϶�.
 */
import java.util.Scanner;
public class Training_166p_8 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �?");				// ����ڷκ��� ���� �Է¹ޱ�
		int count = scan.nextInt(); 				// ���� �б�
		
		int intArray[] = new int[count]; 			// �Է��� ������ŭ ���� �迭 ����
		for (int i = 0; i < intArray.length; i++) {
			int r = (int)(Math.random()*100 + 1);	// 1~100���� ������ ���� ���� �߻�
			intArray[i] = r;						// ���� ����
			
			for (int j = 0; j < i; j++) {			
				if (intArray[i] == intArray[j]) {	// �ߺ� ���� ��
					i--;							// �ߺ� ���� ���� �߰ߵǾ��� ���,
					break;							// ���ο� ���� ���� �� �޾ƿ���
				}
			}
		}
		
		for (int k = 0; k < intArray.length; k++) {
			if ((k % 10 == 0) && (k != 0)) {		// �迭 10���� ���
				System.out.println();
			}
			System.out.print(intArray[k] + " ");	// �迭 ���� ���� �� ���
		}
		scan.close();
	}
}