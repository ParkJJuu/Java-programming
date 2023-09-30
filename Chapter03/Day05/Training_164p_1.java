/*
 * 작성날짜 : 2023.09.30
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 164p 실습문제 - for, while , do while 반복문 작성 연습
 * 
 * 문제 : ﻿다음 프로그램에 대해 물음에 답하라?
 * (1) 무엇을 계산하는 코드이며 실행 결과 출력되는 내용은?
 */
public class Training_164p_1 {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		while (i < 100) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
	}
}