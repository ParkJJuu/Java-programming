
/*
 * �ۼ���¥ : 2023.10.07
 * �ۼ��� : ���ֿ�
 * �ۼ����� : ��ǰ �ڹ� ���α׷��� 170p �ǽ����� - �迭, ���ǹ�, �ݺ���, ���ڿ� ���� ���� ����
 * 
 * ���� : ��ǻ�Ϳ� ���� ������ ���� ���� �� ������ ������. ���ô� ���� �׸��� ����. ���ں��� ���� �����Ѵ�.
 * ���ڰ� ���� ���� �� �� �ϳ��� �Է��ϰ� <Enter>Ű�� ġ��, ���α׷��� ���� ���� �� �߿��� �����ϰ� �ϳ��� �����ϰ�
 * ��ǻ�Ͱ� �� ������ �Ѵ�. ���ڰ� �Է��� ���� �����ϰ� ������ ���� ���Ͽ� ���� �̰���� �Ǵ��Ѵ�. ���ڰ� ����
 * ���� �� ��� "�׸�"�� �Է��ϸ� ������ ������.
 * 
 * ���� : ������ ���� ���ڿ� �迭�� �����. etc..
 */
import java.util.Scanner;

public class Training_170p_16 {
	public static void main(String[] args) {

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�."); // ���� ���� ��¹�

		String str[] = { "����", "����", "��" }; // ����, ����, ���� ��� ���ڿ� �迭 ����
		Scanner scan = new Scanner(System.in);

		while (true) {

			int n = (int) (Math.random() * 3); // n�� 0, 1, 2 �߿��� �����ϰ� ����
			System.out.print("���� ���� ��!>>"); // ����� �Է¹ޱ�
			String user = scan.nextLine(); // ���ڿ� �б�
			String ai = str[n]; // ��ǻ�� ���� �� ���� (��ǻ�Ͱ� ���� ��)

			if (user.equals("�׸�")) { // ����ڰ� �׸��� �Է����� ���
				System.out.println("������ �����մϴ�..."); // ���� ����
				break;
			}

			// ��ǻ�Ͱ� ������ ���� ���,
			if (str[n].equals("����")) {
				System.out.print("����� = " + user + ", ��ǻ�� = " + str[n]);
				if (user.equals("����")) // ����ڰ� ������ ���� ���
					System.out.println(", ����ڰ� �̰���ϴ�."); // ����� ��
				else if (user.equals("��"))
					System.out.println(", ��ǻ�Ͱ� �̰���ϴ�."); // ��ǻ�� ��
				else if (user.equals("����"))
					System.out.println(", �����ϴ�."); // ���º�
				else
					System.out.println(", ����ڰ� �� �� �½��ϴ�. �ٽ� ������!"); // �� �� ���� ���
			}

			// ��ǻ�Ͱ� ������ ���� ���,
			else if (str[n].equals("����")) {
				System.out.print("����� = " + user + ", ��ǻ�� = " + str[n]);
				if (user.equals("��")) // ����ڰ� ���� ���� ���
					System.out.println(", ����ڰ� �̰���ϴ�."); // ����� ��
				else if (user.equals("����"))
					System.out.println(", ��ǻ�Ͱ� �̰���ϴ�."); // ��ǻ�� ��
				else if (user.equals("����"))
					System.out.println(", �����ϴ�."); // ���º�
				else
					System.out.println("����ڰ� �� �� �½��ϴ�. �ٽ� ������!"); // �� �� ���� ���
			}

			// ��ǻ�Ͱ� ���� ���� ���,
			else {
				System.out.print("����� = " + user + ", ��ǻ�� = " + str[n]);
				if (user.equals("����")) // ����ڰ� ������ ���� ���
					System.out.println(", ����ڰ� �̰���ϴ�."); // ����� ��
				else if (user.equals("����"))
					System.out.println(", ��ǻ�Ͱ� �̰���ϴ�."); // ��ǻ�� ��
				else if (user.equals("��"))
					System.out.println(", �����ϴ�."); // ���º�
				else
					System.out.println("����ڰ� �� �� �½��ϴ�. �ٽ� ������!"); // �� �� ���� ���
			}
		}
		
		scan.close();
	}
}