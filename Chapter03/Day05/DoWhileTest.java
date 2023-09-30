/*
 * 작성날짜 : 2023.09.30
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 164p 실습문제 - for, while , do while 반복문 작성 연습
 * 
 * 문제 : ﻿다음 프로그램에 대해 물음에 답하라?
 * (4) do-while 문을 이용하여 동일하게 실행되는 DowhileTest 클래스를 작성하라.
 */
public class DoWhileTest {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		
		do {					// do-while 반복문을 통해 해당 코드 작성
			sum = sum + i;
			i += 2;
		} while (i < 100);
		
		System.out.println(sum);
	}
}