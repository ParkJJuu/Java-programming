/*
 * 작성날짜 : 2023.10.07
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 168p 실습문제 - 배열과 반복문 응용
 * 
 * 문제 : 다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라. 그리고 다음 예시와 같이
 * 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. "그만"을 입력받으면 종료한다. 
 * 
 * 조건 : 문자열을 비교하기 위해서는 String 클래스의 equals() 메소드를 이용해야 한다.
 */
import java.util.Scanner;

public class Training_168p_14 {
	public static void main(String[] args) {
		
		// 과목과 점수가 짝을 이루는 2개의 배열 생성
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			int count = 0;					// 출력 횟수 저장
			System.out.print("과목 이름>>");	// 과목 입력받기
			String name = scan.nextLine();	// 과목 문자열 읽기
			
			if (name.equals("그만")) {		// 그만을 입력했을 경우, 프로그램 종료
				break;
			}
			
			for (int i = 0; i < course.length; i++) {
				// 사용자가 입력한 과목이 배열에 있을 경우,
				if (course[i].equals(name)) {
					System.out.println(name + "의 점수는 " + score[i]);	// 점수 출력
					count++;	
					break;
				}
			}
			// 사용자가 입력한 과목이 배열에 없을 경우,
			if (count == 0) {
				System.out.println("없는 과목입니다.");
			}
		}
		scan.close();
	}
}