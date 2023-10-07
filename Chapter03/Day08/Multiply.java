/*
 * 작성날짜 : 2023.10.07
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 169p 실습문제 - InputMismatchException 예외처리
 * 
 * 문제 : 다음은 2개의 정수를 입력 받아 곱을 구하는 Multiply 클래스이다.
 * 다음과 같이 실행할 때 프로그램은 10과 5를 곱해 50을 잘 출력한다.
 * 하지만, 다음과 같이 실수를 입력하였을 때, 예외가 발생한다.
 * 다음과 같이 실수가 입력되면 정수를 다시 입력하도록 하여 예외 없이 정상적으로 처리되도록 예외
 * 처리 코드를 삽입하여 Multiply 클래스를 수정하라.
 * 
 * 조건 : InputMismatchException 예외를 처리할 때 try-catch 코드를 작성하고, catch 블록에서
 * Scanner에 이미 입력된 키를 모두 제거하기 위해 Scanner의 nextLine()을 호출하라.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				int n = scan.nextInt();
				int m = scan.nextInt();
				System.out.println(n + "x" + m + "=" + n*m);
				break;
			
			} catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안 됩니다.");
				scan.nextLine();
			}
		}
		
		scan.close();
	}
}