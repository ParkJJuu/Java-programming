/*
 * 작성날짜 : 2023.10.04
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 167p 실습문제 - main()의 배개변수 처리와 NumberFormatException
 * 
 * 문제 : ﻿다음과 같이 작동하는 Add.java를 작성하라. 명령행 인자 중에서 정수 만을 골라 합을 구하라. 
 * 다음 화면은 Add.class 파일을 c:\Temp 디렉터리에 복사한 뒤 실행한 경우이다. 
 * 원본 Add.class 파일은 이클립스 프로젝트 폴더 밑에 bin 폴더에 있다.
 */
public class Add {
	public static void main(String[] args) {
		
	int sum = 0; 	// 정수를 저장한 변수 선언 및 0으로 초기화
	
	for (int i = 0; i < args.length; i++) {
		try {
			sum += Integer.parseInt(args[i]);	// 입력된 인자들을 정수로 변환하여 sum 변수에 저장
		}
		catch (NumberFormatException e) {
			continue;							// 정수로 변환할 수 없는 경우, 반복 조건문 검사
		}
	}
	
	System.out.println(sum);					// 정수들만의 합 출력
	}
}