/*
 * �ۼ���¥ : 2023.09.29
 * �ۼ��� : �簻��
 * �ۼ����� : ī�� ��ȣ ���߱� ����(up&down����) - ��ǰ �ڹ� ���α׷��� 159P Open Challenge
 */
import java.util.Scanner;	// Scanner Ŭ����
import java.util.Random;	// Random Ŭ����

public class OpenChallenge_159p {
	public static void main(String[] args) {
		
		while(true) {
			
			Random r = new Random();
			int k = r.nextInt(100); 	// 0-99���� ������ ���� ����
			
			Scanner scan = new Scanner(System.in);		
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");	
			
			int max = 99;	// �ִ밪 99�� �ʱ�ȭ
			int min = 0;	// �ּڰ� 0���� �ʱ�ȭ
			System.out.println(min + "-" + max);
			
			int i = 1;		// ���� Ƚ�� ī��Ʈ
			
			while(true) {
				System.out.print(i + ">>");
				int num = scan.nextInt();	// ����� �� �Է¹ޱ�
				i++;	// �ݺ��� �� ���� i�� 1�� ����
				
				if (num < k) {	// ����ڰ� �Է��� ���� ī���� ������ ���� ���
					System.out.println("�� ����");
					System.out.println(num + "-" + max);
					min = num;
					continue;
				}
				else if (num > k) {	// ����ڰ� �Է��� ���� ī���� ������ ���� ���
					System.out.println("�� ����");
					System.out.println(min + "-" + num);
					max = num;
					continue;
				}
				else {	// ī���� ���� ������ ���
					System.out.println("�¾ҽ��ϴ�.");
					break;	// ���� �ݺ��� ����
				}
			}
			
			System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>"); // ���� ����� ����
			String text = scan.next();
			if (text.equals("n")) {	// ����ڰ� "n"�� �Է����� ���
				scan.close();
				break;				// ���� �ݺ��� ����
			}
			else if (text.equals("y")) {	// ����ڰ� "y"�� �Է����� ���
				continue;					// ���� �����
			}
			else {	// ����ڰ� n,y�� �Է����� �ʰ� �� �� �Է����� ���
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
				System.out.println("������ �ٽ� �����ϼ���.");
				break;	// ���� �ݺ��� ����
			}
		}
		System.out.println("������ ����Ǿ����ϴ�.");	// ���� ����
	}
}