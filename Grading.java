import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char grade;
		
		System.out.print("������ �Է��ϼ���(1~100) : ");
		int score = scan.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'E';
		}
		
		System.out.println("����� ������ " + grade + "�Դϴ�.");
	}
}