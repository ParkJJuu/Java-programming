/*
 * �ۼ���¥ : 2023.10.07
 * �ۼ��� : ���ֿ�
 * �ۼ����� : ��ǰ �ڹ� ���α׷��� 169p �ǽ����� - InputMismatchException ����ó��
 * 
 * ���� : ������ 2���� ������ �Է� �޾� ���� ���ϴ� Multiply Ŭ�����̴�.
 * ������ ���� ������ �� ���α׷��� 10�� 5�� ���� 50�� �� ����Ѵ�.
 * ������, ������ ���� �Ǽ��� �Է��Ͽ��� ��, ���ܰ� �߻��Ѵ�.
 * ������ ���� �Ǽ��� �ԷµǸ� ������ �ٽ� �Է��ϵ��� �Ͽ� ���� ���� ���������� ó���ǵ��� ����
 * ó�� �ڵ带 �����Ͽ� Multiply Ŭ������ �����϶�.
 * 
 * ���� : InputMismatchException ���ܸ� ó���� �� try-catch �ڵ带 �ۼ��ϰ�, catch ��Ͽ���
 * Scanner�� �̹� �Էµ� Ű�� ��� �����ϱ� ���� Scanner�� nextLine()�� ȣ���϶�.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try {
				int n = scan.nextInt();
				int m = scan.nextInt();
				System.out.println(n + "x" + m + "=" + n*m);
				break;
			
			} catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �� �˴ϴ�.");
				scan.nextLine();
			}
		}
		
		scan.close();
	}
}