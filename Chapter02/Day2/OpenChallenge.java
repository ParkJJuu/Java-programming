/*
 * �ۼ���¥ : 2023.09.05
 * �ۼ��� : ���ֿ�
 * �ۼ����� : JAVA�� �̿��� ���������� ���� - ��ǰ �ڹ� ���α׷��� 106P Open Challenge
 */
import java.util.Scanner;

public class OpenChallenge {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String var1 = scan.next();
		System.out.print("���� >> ");
		String var2 = scan.next();
		String win = "";
		
		if (var1.equals("����")) {
			if (var2.equals("����")) {
				// ���� - ���� ����� ���
				System.out.println("�����ϴ�. ������ �ٽ� �����ϼ���."); 
			}
			else if (var2.equals("����")) {
				win = "����";
			}
			else if (var2.equals("��")) {
				win = "ö��";
			}
			else 
				System.out.println("���� �� �� �½��ϴ�.");	// ���� �� �� ���� ��� (��Ÿ)
		}
		else if (var1.equals("����")) {
			if (var2.equals("����")) {
				// ���� - ���� ����� ���
				System.out.println("�����ϴ�. ������ �ٽ� �����ϼ���.");	
			}
			else if (var2.equals("����")) {
				win = "ö��";
			}
			else if (var2.equals("��")) {
				win = "����";
			}
			else
				System.out.println("���� �� �� �½��ϴ�."); // ���� �� �� ���� ��� (��Ÿ)
		}
		else if (var1.equals("��")) {
			if (var2.equals("��")) {
				// �� - �� ����� ���
				System.out.println("�����ϴ�. ������ �ٽ� �����ϼ���.");
			}
			else if (var2.equals("����")) {
				win = "ö��";
			}
			else if (var2.equals("����")) {
				win = "����";
			}
			else
				System.out.println("���� �� �� �½��ϴ�."); // ���� �� �� ���� ��� (��Ÿ)
		}
		else
			System.out.println("ö���� �� �� �½��ϴ�.");	// ö���� �� �� ���� ��� (��Ÿ) 
		
		if (win != "") {
			System.out.println(win + "�� �̰���ϴ�.");
		}
	}
}