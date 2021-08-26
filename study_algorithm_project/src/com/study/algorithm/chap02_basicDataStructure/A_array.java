package com.study.algorithm.chap02_basicDataStructure;

import java.util.Random;
import java.util.Scanner;

public class A_array {

	// 02-1 (1)자료구조
	/*
	 * 자료구조(data structure)란?
	 * 데이터 단위와 데이터 자체 사이의 물리적 또는 논리적인 관계
	 * 
	 * 데이터 단위 : 데이터를 구성하는 한 덩어리
	 * 자료구조 : 자료를 효율적으로 이용할 수 있도록 컴퓨터에 저장하는 방법
	 */
	
	// 02-1 (2)배열
	// 실습 2-1. 구성 요소의 자료형이 int형인 배열
	public void intArray() {
		int[] a = new int [5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		for(int i=0; i<a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
	
	// 실습 2-2. 배열의 요솟값을 초기화하며 배열 선언하기
	public void intArrayInit() {
		int[] a= {1, 2, 3, 4, 5};
		
		for(int i=0; i<a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
	
	// 실습 2-3. 배열의 복제(클론)
	public void cloneArray() {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();
		
		b[3] = 0;
		
		System.out.print("a = ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
		
		System.out.print("\nb = ");
		for(int i=0; i<b.length; i++)
			System.out.print(b[i]);
	}
	
	// 실습 2-4. 배열 요소의 최댓값을 구하는 메서드
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	public void outputMaxOf() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("height[" + i + "] : ");
			height[i] = sc.nextInt();
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
	
	// 실습 2-5. 난수 사용해서 배열의 요솟값 설정하기
	/*
	 * Random 클래스
	 * nextInt : 난수 생성 메서드
	 * nextInt(n) : 0부터 n-1 까지의 난수
	 * 
	 * --> 이 프로그램에선느 생성한 난수를 90으로 나눈 나머지(0 ~ 89)에 100을 더하므로 height[i]에 대입하는 키의 값은 100 ~ 189 이다.
	 */
	public void outputMaxOfArrayRand() {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i=0; i<num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
	
	// 연습문제1. 사람 수와 키를 난수로 생성하도록 실습2-5를 참고하여 프로그램 작성
	public void practice1() {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		int num = 1 + ran.nextInt(10);
		System.out.println("사람 수 : " + num);
		
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			height[i] = 100 + ran.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
			
	}
	
	// 실습 2-6. 두 값의 교환
	/*
	 * 교환 횟수 = 요소 개수/2
	 * 1. x-> t
	 * 2. y -> x
	 * 3. t -> y
	 */
	static void swap(int[] a, int idx1, int idx2) {
		// a[idx1]와 a[idx2]의 값을 교환
		int t = a[idx1]; 
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void reverse(int[] a) {
		// 배열 a의 요소를 역순으로 정렬
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	public void outputSwap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
	
	// 연습문제2. 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램 작성
	static void practiceSwap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; // x -> t
		a[idx1] = a[idx2]; // y -> x
		a[idx2] = t; // t -> y
	}
	static void practiceReserve(int[] a) {
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}	
		System.out.println();
		
		for(int j=0; j<a.length/2; j++) {
			System.out.println("a[" + j + "]과(와) a[" + (a.length - j - 1) + "]를 교환합니다.");
			practiceSwap(a, j, a.length - j - 1);
			
			for(int i=0; i<a.length; i++) {
				System.out.print(a[i] + " ");
			}	
			System.out.println();
		}
		
		System.out.println("역순 정렬을 마쳤습니다.");
		
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		practiceReserve(x);
	}
	
	// 연습문제3. 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드 작성
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 개수 : ");
		int num = sc.nextInt();
		
		int[] a = new int[num];
		for(int i=0; i<a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		int result = sumOf(a);
		
		System.out.println("배열 a 요소의 합계는 " + result + "입니다.");
		
	}
	
	// 실습 2-7. 두 배열의 비교
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		
		for(int i=0; i<a.length; i++)
			if(a[i] != b[i])
				return false;
		
		return true;
	}
	public void arrayEquals() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = sc.nextInt();
		
		int[] a = new int[na];
		
		for(int i=0; i< na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = sc.nextInt();
		
		int[] b = new int[nb];
		
		for(int i=0; i<nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다." : "같지 않습니다."));
	}
	
	// 연습문제 4. 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy작성
	static void copy(int[] a, int[] b) {
		a = b.clone();
		
		System.out.println("배열 a");
		for(int i=0; i<b.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("배열 b");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 요솟수 : ");
		int num = sc.nextInt();
		
		int[] b = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		int[] a = null;
		copy(a, b);
		
	}
	
	// 연습문제 5. 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 작성
	static void rcopy (int[] a, int[] b) {
		
		System.out.println("배열 b");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		// 교환하기
		int t = 0;
		for(int i=0; i<b.length/2; i++) {
			t = b[i]; // x -> t
			b[i] = b[b.length - i - 1]; // y -> x
			b[b.length - i - 1] = t; // t -> y
		}
		
		a = b.clone();
		
		System.out.println("배열 a");
		for(int i=0; i<b.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 요솟수 : ");
		int num = sc.nextInt();
		
		int[] b = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		int[] a = null;
		rcopy(a, b);
		
	}
	
} 
