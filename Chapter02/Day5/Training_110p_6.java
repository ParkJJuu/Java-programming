import java.util.Scanner;

public class Training_110p_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>"); // 정수 입력받기
		int num = scan.nextInt();

		if (num < 10) {
			if (num % 3 == 0) 
				System.out.println(num + "박수짝");
		}

		else {
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9)
					System.out.println(num + "박수짝짝");
				else 
					System.out.println(num + "박수짝");
			}
		}
		
		scan.close();
	}
}
