package com.study.algorithm.chap01;

import java.util.Scanner;

//실습 1C-2. 논리 연산과 드모르간 법칙
//          입력한 값을 '2자리의 양수'로 제한하기
/*
 * 드모르간 법칙
 * 각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고, 다시 전체를 부정하면 원래의 조건과 같다.
 * no < 10 || no > 99 -----> !(no >= 10 && no <= 99)
 */
public class Digits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.print("입력 : ");
			no = sc.nextInt();
		} while(no < 10 || no > 99);
		
		System.out.print("변수 no의 값은 " + no + "가(이) 되었습니다.");
	}
}
