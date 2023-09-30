/*
 * 작성날짜 : 2023.09.30
 * 작성자 : 박주연
 * 작성목적 : 명품 자바 프로그래밍 164p 실습문제 - 2차원 배열 다루기
 * 
 * 문제 : ﻿다음 2차원 배열 n을 출력하는 프로그램을 작성하라.
 */
public class Training_164p_2 {
	public static void main(String[] args) {
		int n [][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};	// 비정방형 2차원 배열 n 선언 및 초기화
		
		for (int i = 0; i < n.length; i++) {	// 2차원 배열 n의 행까지 반복
			for (int j = 0; j < n[i].length; j++) { // 2차원 배열 n의 행의 n열까지 반복
				System.out.print(n[i][j] + " ");	// 2차원 배열 n 출력
			}
			System.out.println();
		}
	}
}