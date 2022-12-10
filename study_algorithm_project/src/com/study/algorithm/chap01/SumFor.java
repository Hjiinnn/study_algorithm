package com.study.algorithm.chap01;

import java.util.Scanner;

//실습1-5. 1부터 n까지의 정수의 합을 for문으로 구하기 
public class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 n입력 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) 
			sum += i;
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
	}

}
