/*
 * �ۼ���¥ : 2023.10.01
 * �ۼ��� : ���ֿ�
 * �ۼ����� : ��ǰ �ڹ� ���α׷��� 165p �ǽ����� - �迭�� �ݺ��� ����
 * 
 * ���� : ���� ������ 10�� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ�
 * ���α׷��� �ۼ��϶�.
 */
import java.util.Scanner;
public class Training_165p_5 {
	public static void main(String[] args) {
		
		int intArray[] = new int [10];	// ������ �迭 10�� ����
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");	// ���� ���� 10�� �Է¹ޱ�
		
		for (int i = 0; i < 10; i++) {
			intArray[i] = scan.nextInt();	// ����ڰ� �Է��� ���� �Է� �б�
		}
		
		System.out.print("3�� ����� ");
		
		for (int i = 0; i < 10; i++) {
			if (intArray[i] % 3 == 0 ) {
				System.out.print(intArray[i] + " ");	// 3�� ��� ���
			}
		}
		
		scan.close();
	}
}