/*
 * 작성날짜 : 2023.09.29
 * 작성자 : 양갱갬
 * 작성목적 : 카드 번호 맞추기 게임(up&down게임) - 명품 자바 프로그래밍 159P Open Challenge
 */
import java.util.Scanner;	// Scanner 클래스
import java.util.Random;	// Random 클래스

public class OpenChallenge_159p {
	public static void main(String[] args) {
		
		while(true) {
			
			Random r = new Random();
			int k = r.nextInt(100); 	// 0-99까지 임의의 정수 생성
			
			Scanner scan = new Scanner(System.in);		
			System.out.println("수를 결정하였습니다. 맞추어 보세요");	
			
			int max = 99;	// 최대값 99로 초기화
			int min = 0;	// 최솟값 0으로 초기화
			System.out.println(min + "-" + max);
			
			int i = 1;		// 게임 횟수 카운트
			
			while(true) {
				System.out.print(i + ">>");
				int num = scan.nextInt();	// 사용자 수 입력받기
				i++;	// 반복될 때 마다 i값 1씩 증가
				
				if (num < k) {	// 사용자가 입력한 수가 카드의 수보다 낮을 경우
					System.out.println("더 높게");
					System.out.println(num + "-" + max);
					min = num;
					continue;
				}
				else if (num > k) {	// 사용자가 입력한 수가 카드의 수보다 높을 경우
					System.out.println("더 낮게");
					System.out.println(min + "-" + num);
					max = num;
					continue;
				}
				else {	// 카드의 수를 맞췄을 경우
					System.out.println("맞았습니다.");
					break;	// 무한 반복문 종료
				}
			}
			
			System.out.print("다시하시겠습니까(y/n)>>"); // 게임 재시작 질의
			String text = scan.next();
			if (text.equals("n")) {	// 사용자가 "n"을 입력했을 경우
				scan.close();
				break;				// 무한 반복문 종료
			}
			else if (text.equals("y")) {	// 사용자가 "y"를 입력했을 경우
				continue;					// 게임 재시작
			}
			else {	// 사용자가 n,y을 입력하지 않고 잘 못 입력했을 경우
				System.out.println("잘 못 입력하셨습니다.");
				System.out.println("게임을 다시 시작하세요.");
				scan.close();
				break;	// 무한 반복문 종료
			}
		}
		System.out.println("게임이 종료되었습니다.");	// 게임 종료
	}
}
