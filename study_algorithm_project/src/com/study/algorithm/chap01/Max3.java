package com.study.algorithm.chap01;

import java.util.Scanner;

// 실습 1-1. 3개의 정숫값을 입력하여 최댓값 구하기
/*
 *	1. max에 a값을 담는다.
 *	2. b값이 max보다 크면 max에 b값을 넣는다.
 *	3. c값이 max보다 크면 max에 c값을 넣는다.
 *	--> 이렇게 여러 문장 (프로세스)이 순차적으로 실행되는 구조를 순차적(concatenation)구조라고 한다. 
 *		2번과 3번 과정과 같이 평가 결과에 따라 프로그램의 실행 흐름을 변경하는 if문을 선택(selection)구조라고 한다.
 */
class Max3 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		System.out.print("c의 값 : "); int c = stdIn.nextInt();
		
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값은 " + max + "입니다.");
	}
	
}
