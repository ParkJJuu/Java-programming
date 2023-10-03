/*
 * 작성날짜 : 2023.10.02
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 167p 실습문제 - main() 매개변수 처리와 Integer.parseInt()
 * 
 * 문제 : 다음과 같이 작동하는 Average.java를 작성하라. 명령행 인자는 모두 정수만 사용되며 정수들의 평균을
 * 출력한다. 다음 화면은 컴파일된 Average.class 파일을 c:\Temp 디렉터리에 복사한 뒤 실행한 경우이다. 원본
 * Average.class 파일은 이클립스의 프로젝트 폴더 밑에 bin 폴더에 있다.
 */
public class Average {
	public static void main(String[] args) {
		int sum = 0;	// 정수들의 평균을 저장할 변수 선언 및 초기화
		
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		
		System.out.println(sum / args.length);
	}
}