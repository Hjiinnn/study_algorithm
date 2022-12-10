package com.study.algorithm.chap01;

import java.util.Scanner;

//실습1-6. 1..n의 합을 구한다(양수만)
/*
 * 양수만 받을 수 있도록 0 이하인 값이 입력되면 n의 값을 다시 입력할 수 있도록 do while문을 이용했다.
 */
public class SumForPos {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
		} while (n <= 0); // 반복문의 종료 조건은 n > 0이 된다.
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니댜.");
	}

}
