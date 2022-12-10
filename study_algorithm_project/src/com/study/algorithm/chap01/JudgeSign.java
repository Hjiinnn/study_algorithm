package com.study.algorithm.chap01;

import java.util.Scanner;

//실습 1-3. 입력한 정숫값이 양수인지 음수인지 판단한다.
/*
 * 조건문 중 한 가지는 반드시 실행되며, 두 가지가 동시에 실행되거나 하나도 실행되지 않는 경우는 없다.
 * 이는 프로그램의 흐름이 세 가지로 분기하기 때문이다.
 */
class JudgeSign {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("양수입니다.");
		else if (n < 0)
			System.out.println("음수입니다.");
		else 
			System.out.println("0입니다.");
	}

}
