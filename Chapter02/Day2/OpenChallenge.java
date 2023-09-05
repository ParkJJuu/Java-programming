/*
 * 작성날짜 : 2023.09.05
 * 작성자 : 박주연
 * 작성목적 : JAVA를 이용한 가위바위보 게임 - 명품 자바 프로그래밍 106P Open Challenge
 */
import java.util.Scanner;

public class OpenChallenge {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String var1 = scan.next();
		System.out.print("영희 >> ");
		String var2 = scan.next();
		String win = "";
		
		if (var1.equals("가위")) {
			if (var2.equals("가위")) {
				// 가위 - 가위 비겼을 경우
				System.out.println("비겼습니다. 게임을 다시 시작하세요."); 
			}
			else if (var2.equals("바위")) {
				win = "영희";
			}
			else if (var2.equals("보")) {
				win = "철수";
			}
			else 
				System.out.println("영희가 잘 못 냈습니다.");	// 영희가 잘 못 냈을 경우 (오타)
		}
		else if (var1.equals("바위")) {
			if (var2.equals("바위")) {
				// 바위 - 바위 비겼을 경우
				System.out.println("비겼습니다. 게임을 다시 시작하세요.");	
			}
			else if (var2.equals("가위")) {
				win = "철수";
			}
			else if (var2.equals("보")) {
				win = "영희";
			}
			else
				System.out.println("영희가 잘 못 냈습니다."); // 영희가 잘 못 냈을 경우 (오타)
		}
		else if (var1.equals("보")) {
			if (var2.equals("보")) {
				// 보 - 보 비겼을 경우
				System.out.println("비겼습니다. 게임을 다시 시작하세요.");
			}
			else if (var2.equals("가위")) {
				win = "철수";
			}
			else if (var2.equals("바위")) {
				win = "영희";
			}
			else
				System.out.println("영희가 잘 못 냈습니다."); // 영희가 잘 못 냈을 경우 (오타)
		}
		else
			System.out.println("철수가 잘 못 냈습니다.");	// 철수가 잘 못 냈을 경우 (오타) 
		
		if (win != "") {
			System.out.println(win + "가 이겼습니다.");
		}
	}
}