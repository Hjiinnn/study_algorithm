package com.study.algorithm.chap01_basicAlgorithm;

import java.util.Scanner;

public class A_whatIsAnAlgorithm {
	
	/*
	 * 	알고리즘이란?
	 * 	문제를 해결하기 위한 것으로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합
	 */
	
	// 실습 1-1. 3개의 정숫값을 입력하여 최댓값 구하기
	/*
	 *	1. max에 a값을 담는다.
	 *	2. b값이 max보다 크면 max에 b값을 넣는다.
	 *	3. c값이 max보다 크면 max에 c값을 넣는다.
	 *	--> 이렇게 여러 문장 (프로세스)이 순차적으로 실행되는 구조를 순차적(concatenation)구조라고 한다. 
	 *		2번과 3번 과정과 같이 평가 결과에 따라 프로그램의 실행 흐름을 변경하는 if문을 선택(selection)구조라고 한다.
	 */
	public void getMaxiumValue() {
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
	
	// 실습 1-2. 3개의 정숫값 가운데 최댓값을 구하여 출력하기
	/*
	 * 	알고리즘이 올바른지 확인하기 위해 여러 개의 값을 입력하여 프로그램의 결과값을 확인한다.
	 */
	static int getMaxiumValue3(int a, int b, int c) {
		int max = a;

		if(b > max)
			max = b;
		if(c > max)
			max = c;
		
		return max;
	}
	public void outputValueMax3() {
		System.out.println("getMaxiumValue3(3, 2, 1) = " + getMaxiumValue3(3, 2, 1));	// [A] a > b > c
		System.out.println("getMaxiumValue3(3, 2, 2) = " + getMaxiumValue3(3, 2, 3));	// [B] a > b = c
		System.out.println("getMaxiumValue3(3, 1, 2) = " + getMaxiumValue3(3, 1, 2));	// [C] a > c > b
		System.out.println("getMaxiumValue3(3, 2, 3) = " + getMaxiumValue3(3, 2, 3));	// [D] a = c > b
		System.out.println("getMaxiumValue3(2, 1, 3) = " + getMaxiumValue3(2, 1, 3));	// [E] c > a > b
		System.out.println("getMaxiumValue3(3, 3, 2) = " + getMaxiumValue3(3, 3, 2));	// [F] a = b > c
		System.out.println("getMaxiumValue3(3, 3, 3) = " + getMaxiumValue3(3, 3, 3));	// [G] a = b = c
		System.out.println("getMaxiumValue3(2, 2, 3) = " + getMaxiumValue3(2, 2, 3));	// [H] c > a = b
		System.out.println("getMaxiumValue3(2, 3, 1) = " + getMaxiumValue3(2, 3, 1));	// [I] b > a > c
		System.out.println("getMaxiumValue3(2, 3, 2) = " + getMaxiumValue3(2, 3, 2));	// [J] b > a = c
		System.out.println("getMaxiumValue3(1, 3, 2) = " + getMaxiumValue3(1, 3, 2));	// [K] b > c > a
		System.out.println("getMaxiumValue3(2, 3, 3) = " + getMaxiumValue3(2, 3, 3));	// [L] b = c > a
		System.out.println("getMaxiumValue3(1, 2, 3) = " + getMaxiumValue3(1, 2, 3));	// [M] c > b > a
	}
	
	// 연습문제 1. 네 개의 최댓값을 구하는 max4 메서드를 작성하세요.
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		if(d > max)
			max = d;
		
		return max;
	}
	public void outputValueMax4() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a : "); int a = stdIn.nextInt();
		System.out.print("b : "); int b = stdIn.nextInt();
		System.out.print("c : "); int c = stdIn.nextInt();
		System.out.print("d : "); int d = stdIn.nextInt();
		
		System.out.println("네 값의 최댓값을 구해봅시다!");
		System.out.println(max4(a, b, c, d));
		
	}
	
	// 연습문제2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		
		return min;
	}
	public void outputValueMin3() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a : "); int a = stdIn.nextInt();
		System.out.print("b : "); int b = stdIn.nextInt();
		System.out.print("c : "); int c = stdIn.nextInt();
		
		System.out.println("세 값의 최솟값을 구해봅시다!");
		System.out.println(min3(a, b, c));
	}
	
	// 연습문제3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		if(min > d)
			min = d;
		
		return min;
	}
	public void outputValueMin4() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a : "); int a = stdIn.nextInt();
		System.out.print("b : "); int b = stdIn.nextInt();
		System.out.print("c : "); int c = stdIn.nextInt();
		System.out.print("d : "); int d = stdIn.nextInt();
		
		System.out.println("세 값의 최솟값을 구해봅시다!");
		System.out.println(min4(a, b, c, d));
	}
	
	// 실습 1C-1. 세 값의 중앙값 구하기
	static int med3(int a, int b, int c) {
		if(a >= b) 
			if(b >= c)  
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}
	public void outputValueMed3() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구해봅시다!");
		System.out.print("a의 값 : "); 
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.print("c의 값 : ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은 " + med3(a, b, c));
	}
	
	// 연습문제4. 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.
	public void outputValuesMed3() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구해봅시다!");
		System.out.println("med3(3, 2, 1) = " + med3(3, 2, 1));	// [A] a > b > c
		System.out.println("med3(3, 2, 2) = " + med3(3, 2, 2)); // [B] a > b = c
		System.out.println("med3(3, 1, 2) = " + med3(3, 1, 2)); // [C] a > c > b
		System.out.println("med3(3, 2, 3) = " + med3(3, 2, 3)); // [D] a = c > b
		System.out.println("med3(2, 1, 3) = " + med3(2, 1, 3)); // [E] c > a > b
		System.out.println("med3(3, 3, 2) = " + med3(3, 3, 2)); // [F] a = b > c
		System.out.println("med3(3, 3, 3) = " + med3(3, 3, 3)); // [G] a = b = c
		System.out.println("med3(2, 2, 3) = " + med3(2, 2, 3)); // [H] c > a = b
		System.out.println("med3(2, 3, 1) = " + med3(2, 3, 1)); // [I] b > a > c
		System.out.println("med3(2, 3, 2) = " + med3(2, 3, 1)); // [J] b > a = c
		System.out.println("med3(1, 3, 2) = " + med3(1, 3, 2)); // [K] b > c > a
		System.out.println("med3(2, 3, 3) = " + med3(2, 3, 3)); // [L] b = c > a
		System.out.println("med3(1, 2, 3) = " + med3(1, 2, 3)); // [M] c > b > a
	}
	
	// 연습문제5. 중앙값을 구하는 메서드는 아래와 같이 작성할 수도 있다. 그러나 위의 med3메서드에 비해 효율이 떨어지는데 그 이유를 설명하시오.
	/*
	 * 가장 처음의 if문에서 했던 검사를 else if문에서도 실행하고있다.
	 * 즉, 검사가 중복되므로 효율이 떨어진다고 할 수 있다.
	 */
	static int anothorMed3(int a, int b, int c) {
		if((b >= a && c <= a) || (b <=a && c >=a))
			return a;
		else if((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
	
	// 실습 1-3. 조건 판단과 분기
	/*
	 * 조건문 중 한 가지는 반드시 실행되며, 두 가지가 동시에 실행되거나 하나도 실행되지 않는 경우는 없다.
	 * 이는 프로그램의 흐름이 세 가지로 분기하기 때문이다.
	 */
	public void judgeSign() {
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
	
	/**
	 * 리스트 1, 2. 마지막 else문을 생략하면 세 가지로 분기하는 것 처럼 보이지만 실제로는 네 가지로 분기하는 것이라고 할 수 있다.
	 */
	public void judgeSign2() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int n = stdIn.nextInt();
		
		if(n == 1)
			System.out.println("1입니다.");
		else if (n == 2)
			System.out.println("2입니다.");
		else if (n == 3)
			System.out.println("3입니다.");
		else
			;	//  공백문(실제로 아무것도 하지 않는 문장)
	}
	
}
