package com.study.algorithm.chap01;

//실습 1-2. 3개의 정숫값 가운데 최댓값을 구하여 출력하기
/*
 * 	알고리즘이 올바른지 확인하기 위해 여러 개의 값을 입력하여 프로그램의 결과값을 확인한다.
 */
public class Max3m {
	
	static int max3(int a, int b, int c) {
		int max = a;

		if(b > max)
			max = b;
		if(c > max)
			max = c;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("getMaxiumValue3(3, 2, 1) = " + max3(3, 2, 1));	// [A] a > b > c
		System.out.println("getMaxiumValue3(3, 2, 2) = " + max3(3, 2, 3));	// [B] a > b = c
		System.out.println("getMaxiumValue3(3, 1, 2) = " + max3(3, 1, 2));	// [C] a > c > b
		System.out.println("getMaxiumValue3(3, 2, 3) = " + max3(3, 2, 3));	// [D] a = c > b
		System.out.println("getMaxiumValue3(2, 1, 3) = " + max3(2, 1, 3));	// [E] c > a > b
		System.out.println("getMaxiumValue3(3, 3, 2) = " + max3(3, 3, 2));	// [F] a = b > c
		System.out.println("getMaxiumValue3(3, 3, 3) = " + max3(3, 3, 3));	// [G] a = b = c
		System.out.println("getMaxiumValue3(2, 2, 3) = " + max3(2, 2, 3));	// [H] c > a = b
		System.out.println("getMaxiumValue3(2, 3, 1) = " + max3(2, 3, 1));	// [I] b > a > c
		System.out.println("getMaxiumValue3(2, 3, 2) = " + max3(2, 3, 2));	// [J] b > a = c
		System.out.println("getMaxiumValue3(1, 3, 2) = " + max3(1, 3, 2));	// [K] b > c > a
		System.out.println("getMaxiumValue3(2, 3, 3) = " + max3(2, 3, 3));	// [L] b = c > a
		System.out.println("getMaxiumValue3(1, 2, 3) = " + max3(1, 2, 3));	// [M] c > b > a
	}
}
