/*
 * 작성날짜 : 2023.09.30
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 164p 실습문제 - for, while , do while 반복문 작성 연습
 * 
 * 문제 : ﻿다음 프로그램에 대해 물음에 답하라?
 * (2) 위의 코드를 main() 메소드로 만들고 WhileTest 클래스로 완성하라. 
 */
public class WhileTest {	// WhileTest 클래스
	public static void main(String[] args) {	// main() 메소드 내부에 해당 코드 작성
		int sum = 0, i = 0;
		while (i < 100) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
	}
}