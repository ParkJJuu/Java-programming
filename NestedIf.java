import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100) : ");
		int score = scan.nextInt();
		
		System.out.print("�г��� �Է��ϼ���(1~4) : ");
		int year = scan.nextInt();
		
		if (score >= 60) {
			if (year != 4) {
				System.out.println("�հ�");
			}
			else if(score >= 70) {
				System.out.println("�հ�");
			}
			else
				System.out.println("���հ�");
		}
		else
			System.out.println("���հ�");
		
		scan.close();
	}
}