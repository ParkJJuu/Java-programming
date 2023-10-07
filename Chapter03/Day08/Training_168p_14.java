/*
 * �ۼ���¥ : 2023.10.07
 * �ۼ��� : ���ֿ�
 * �ۼ����� : ��ǰ �ڹ� ���α׷��� 168p �ǽ����� - �迭�� �ݺ��� ����
 * 
 * ���� : ���� �ڵ�� ���� ����� ������ ¦�� �̷絵�� 2���� �迭�� �ۼ��϶�. �׸��� ���� ���ÿ� ����
 * ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ��϶�. "�׸�"�� �Է¹����� �����Ѵ�. 
 * 
 * ���� : ���ڿ��� ���ϱ� ���ؼ��� String Ŭ������ equals() �޼ҵ带 �̿��ؾ� �Ѵ�.
 */
import java.util.Scanner;

public class Training_168p_14 {
	public static void main(String[] args) {
		
		// ����� ������ ¦�� �̷�� 2���� �迭 ����
		String course [] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			int count = 0;					// ��� Ƚ�� ����
			System.out.print("���� �̸�>>");	// ���� �Է¹ޱ�
			String name = scan.nextLine();	// ���� ���ڿ� �б�
			
			if (name.equals("�׸�")) {		// �׸��� �Է����� ���, ���α׷� ����
				break;
			}
			
			for (int i = 0; i < course.length; i++) {
				// ����ڰ� �Է��� ������ �迭�� ���� ���,
				if (course[i].equals(name)) {
					System.out.println(name + "�� ������ " + score[i]);	// ���� ���
					count++;	
					break;
				}
			}
			// ����ڰ� �Է��� ������ �迭�� ���� ���,
			if (count == 0) {
				System.out.println("���� �����Դϴ�.");
			}
		}
		scan.close();
	}
}