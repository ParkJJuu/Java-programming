
/*
 * 작성날짜 : 2023.10.07
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 170p 실습문제 - 배열, 조건문, 반복문, 문자열 등의 조합 응용
 * 
 * 문제 : 컴퓨터와 독자 사이의 가위 바위 보 게임을 만들어보자. 예시는 다음 그림과 같다. 독자부터 먼저 시작한다.
 * 독자가 가위 바위 보 중 하나를 입력하고 <Enter>키를 치면, 프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고
 * 컴퓨터가 낸 것으로 한다. 독자가 입력한 값과 랜덤하게 선택한 값을 비교하여 누가 이겼는지 판단한다. 독자가 가위
 * 바위 보 대신 "그만"을 입력하면 게임이 끝난다.
 * 
 * 조건 : 다음과 같은 문자열 배열을 만든다. etc..
 */
import java.util.Scanner;

public class Training_170p_16 {
	public static void main(String[] args) {

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다."); // 게임 시작 출력문

		String str[] = { "가위", "바위", "보" }; // 가위, 바위, 보가 담긴 문자열 배열 생성
		Scanner scan = new Scanner(System.in);

		while (true) {

			int n = (int) (Math.random() * 3); // n은 0, 1, 2 중에서 랜덤하게 결정
			System.out.print("가위 바위 보!>>"); // 사용자 입력받기
			String user = scan.nextLine(); // 문자열 읽기
			String ai = str[n]; // 컴퓨터 랜덤 값 지정 (컴퓨터가 내는 수)

			if (user.equals("그만")) { // 사용자가 그만을 입력했을 경우
				System.out.println("게임을 종료합니다..."); // 게임 종료
				break;
			}

			// 컴퓨터가 가위를 냈을 경우,
			if (str[n].equals("가위")) {
				System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[n]);
				if (user.equals("바위")) // 사용자가 바위를 냈을 경우
					System.out.println(", 사용자가 이겼습니다."); // 사용자 승
				else if (user.equals("보"))
					System.out.println(", 컴퓨터가 이겼습니다."); // 컴퓨터 승
				else if (user.equals("가위"))
					System.out.println(", 비겼습니다."); // 무승부
				else
					System.out.println(", 사용자가 잘 못 냈습니다. 다시 내세요!"); // 잘 못 냈을 경우
			}

			// 컴퓨터가 바위를 냈을 경우,
			else if (str[n].equals("바위")) {
				System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[n]);
				if (user.equals("보")) // 사용자가 보를 냈을 경우
					System.out.println(", 사용자가 이겼습니다."); // 사용자 승
				else if (user.equals("가위"))
					System.out.println(", 컴퓨터가 이겼습니다."); // 컴퓨터 승
				else if (user.equals("바위"))
					System.out.println(", 비겼습니다."); // 무승부
				else
					System.out.println("사용자가 잘 못 냈습니다. 다시 내세요!"); // 잘 못 냈을 경우
			}

			// 컴퓨터가 보를 냈을 경우,
			else {
				System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[n]);
				if (user.equals("가위")) // 사용자가 가위를 냈을 경우
					System.out.println(", 사용자가 이겼습니다."); // 사용자 승
				else if (user.equals("바위"))
					System.out.println(", 컴퓨터가 이겼습니다."); // 컴퓨터 승
				else if (user.equals("보"))
					System.out.println(", 비겼습니다."); // 무승부
				else
					System.out.println("사용자가 잘 못 냈습니다. 다시 내세요!"); // 잘 못 냈을 경우
			}
		}
		
		scan.close();
	}
}