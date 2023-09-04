import java.util.Scanner;
public class Checktime80 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2개의 정수를 입력하세요 : ");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("입력한 2개의 정수의 합은 : " + (a+b));
		
	}
}