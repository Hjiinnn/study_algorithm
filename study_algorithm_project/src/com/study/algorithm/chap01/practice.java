package com.study.algorithm.chap01;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		outputValueMax4();	// 연습문제1. 네 개의 최댓값을 구하는 max4 메서드를 작성하세요.
		outputValueMin3();	// 연습문제2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
		outputValueMin4();	// 연습문제3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
		outputValuesMed3();	// 연습문제4. 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.
		anothorMed3(1,2,3);	// 연습문제5. 중앙값을 구하는 메서드는 아래와 같이 작성할 수도 있다. 그러나 위의 med3메서드에 비해 효율이 떨어지는데 그 이유를 설명하시오.
		practice6();		// 연습문제6. 실습1-4에서 while문이 종료될 때 변수 i 값이 n + 1이 됨을 확인하기 (변수 i값을 출력하도록 프로그래밍)
		practice7();		// 연습문제7. 실습1-5 프로그램을 참고하여 n이 7이면 '1+2+3+4+5+6+7=28'로 출력하는 프로그램 작성
		practice8();		// 연습문제8. 1부터 10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있다. 
		practice9();		// 연습문제9. 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성 (대소관계 상관 없이)
		practice10();		// 연습문제10. 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램 작성 (변수 b에 입력한 값이 a 이하면, 변수 b의 값을 다시 입력)
		practice11();		// 연습문제11. 양의 정수를 입력하고 자릿수를 출력하는 프로그램
		practice12();		// 연습문제12. 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램 작성
		practice13();		// 연습문제13. 덧셈을 출력하는 프로그램
		practice14();		// 연습문제14. 입력한 수를 한 변으로 하는 정사각형을 *기호로 출력하는 프로그램 작성
		practice15();		// 연습문제15. 직각 이등변 삼각형을 출력하는 부분을 해당 형식의 메서드로 작성
		practice16();		// 연습문제16. n단의 피라미드를 출력하는 메서드 작성
		practice17();		// 연습문제17. 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드 작성
		
	}
	
	/**
	 *  연습문제1. 네 개의 최댓값을 구하는 max4 메서드를 작성하세요.
	 */
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
	public static void outputValueMax4() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a : "); int a = stdIn.nextInt();
		System.out.print("b : "); int b = stdIn.nextInt();
		System.out.print("c : "); int c = stdIn.nextInt();
		System.out.print("d : "); int d = stdIn.nextInt();
		
		System.out.println("네 값의 최댓값을 구해봅시다!");
		System.out.println(max4(a, b, c, d));
		
	}
	
	/**
	 *  연습문제2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
	 */
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		
		return min;
	}
	public static void outputValueMin3() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a : "); int a = stdIn.nextInt();
		System.out.print("b : "); int b = stdIn.nextInt();
		System.out.print("c : "); int c = stdIn.nextInt();
		
		System.out.println("세 값의 최솟값을 구해봅시다!");
		System.out.println(min3(a, b, c));
	}
	
	/**
	 *  연습문제3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
	 */
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
	public static void outputValueMin4() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a : "); int a = stdIn.nextInt();
		System.out.print("b : "); int b = stdIn.nextInt();
		System.out.print("c : "); int c = stdIn.nextInt();
		System.out.print("d : "); int d = stdIn.nextInt();
		
		System.out.println("세 값의 최솟값을 구해봅시다!");
		System.out.println(min4(a, b, c, d));
	}
	
	/**
	 *  연습문제4. 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.
	 */
	public static void outputValuesMed3() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구해봅시다!");
		System.out.println("med3(3, 2, 1) = " + Median.med3(3, 2, 1)); // [A] a > b > c
		System.out.println("med3(3, 2, 2) = " + Median.med3(3, 2, 2)); // [B] a > b = c
		System.out.println("med3(3, 1, 2) = " + Median.med3(3, 1, 2)); // [C] a > c > b
		System.out.println("med3(3, 2, 3) = " + Median.med3(3, 2, 3)); // [D] a = c > b
		System.out.println("med3(2, 1, 3) = " + Median.med3(2, 1, 3)); // [E] c > a > b
		System.out.println("med3(3, 3, 2) = " + Median.med3(3, 3, 2)); // [F] a = b > c
		System.out.println("med3(3, 3, 3) = " + Median.med3(3, 3, 3)); // [G] a = b = c
		System.out.println("med3(2, 2, 3) = " + Median.med3(2, 2, 3)); // [H] c > a = b
		System.out.println("med3(2, 3, 1) = " + Median.med3(2, 3, 1)); // [I] b > a > c
		System.out.println("med3(2, 3, 2) = " + Median.med3(2, 3, 1)); // [J] b > a = c
		System.out.println("med3(1, 3, 2) = " + Median.med3(1, 3, 2)); // [K] b > c > a
		System.out.println("med3(2, 3, 3) = " + Median.med3(2, 3, 3)); // [L] b = c > a
		System.out.println("med3(1, 2, 3) = " + Median.med3(1, 2, 3)); // [M] c > b > a
	}
	

	/**
	 *  연습문제5. 중앙값을 구하는 메서드는 아래와 같이 작성할 수도 있다. 그러나 위의 med3메서드에 비해 효율이 떨어지는데 그 이유를 설명하시오.
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
	
	/**
	 *  연습문제6. 실습1-4에서 while문이 종료될 때 변수 i 값이 n + 1이 됨을 확인하기 (변수 i값을 출력하도록 프로그래밍)
	 */
	static void practice6() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 n입력 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i ++;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println("i의 값은 " + i + "가(이) 되었습니다.");
	}
	
	/**
	 *  연습문제7. 실습1-5 프로그램을 참고하여 n이 7이면 '1+2+3+4+5+6+7=28'로 출력하는 프로그램 작성
	 */
	static void practice7() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 n입력 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		/* 내가 짠 로직
		for(int i=1; i<=n; i++) {
			sum += i;
			
			String result = "";
			if(i != n)
				result = i + " + ";				
			else
				result = i + " = " + sum;
			
			System.out.print(result);
		}
		*/
		
		/* 해답 로직 */
		for(int i=1; i<=n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else 
				System.out.print(i);
			sum += i;
		}
		System.out.println(" = " + sum);
	}
	
	// 연습문제8. 1부터 10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있다. 
	//         가우스 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램 작성
	static void practice8() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 n입력 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		/* 내가 짠 로직
		if (n % 2 == 0)
			sum = (1 + n) * (n / 2);
		else { // (1+3)*1 + 2 / (1+5)*2 + 3 / (1+7)*3 + 4;
			int i = 0;
			while(i*2<=n)
				i++;
			
			sum = (1 + n) * (i - 1) + i;  	
		}
		*/
		
		/* 해답 로직 */
		sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); 
		
		System.out.println("1부터 " + n +"까지의 합은 " + sum + "입니다.");
	}

	// 연습문제9. 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성 (대소관계 상관 없이)
	static int sumof(int a, int b) {
		
		int min = 0;
		int max = 0;
		
		if(a > b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		int sum = 0;
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		
		return sum;
	}
	static void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();
	
		System.out.print("b : ");
		int b = sc.nextInt();
		
		int sum = sumof(a, b);
		
		System.out.println(a + "와  " + b + "사이의 합은 " + sum + "입니다.");
	}
		
	/**
	 *  연습문제10. 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램 작성 (변수 b에 입력한 값이 a 이하면, 변수 b의 값을 다시 입력)
	 */
	static void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();
		
		/* 내가 짠 로직
		System.out.print("b : ");
		int b = sc.nextInt();
		
		if(a >= b) {
			do {
				System.out.println("a 보다 큰 값을 입력하세요!");
				System.out.print("b : ");
				b = sc.nextInt();
			}while(a >= b);
		}
		*/
		
		/* 해답 로직 */
		int b=0;
		while(true) {
			System.out.print("b의 값 : ");
			b = sc.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		
		int result = b - a;
		
		System.out.println( b + " - " + a + " = " + result);
	}
	
	/**
	 *  연습문제11. 양의 정수를 입력하고 자릿수를 출력하는 프로그램
	 *  135를 입력하면 '그 수는 3자리입니다.'라고 출력하고, 1314를 입력하면 '그 수는 4자리입니다.'라고 출력
	 */
	static void practice11() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		if(n < 0) {
			System.out.println("양수를 입력해주세요!");
			do {
				System.out.print("정수 입력 : ");
				n = sc.nextInt();
			}while(n <= 0);
		}
		
		/* 내 로직
		String strN = Integer.toString(n);
		int result = strN.length();
		*/
		
		/* 해설 로직 */
		int result = 0;
		while(n > 0) {
			n /= 10;
			result ++;
		}
		
		System.out.println("그 수는 " + result + "자리입니다.");
		
	}
	
	/**
	 *  연습문제12. 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램 작성
	 *  단, 구분선은 수직선기호(|), 마이너스 기호(-), 플러스 기호(+) 사용
	 */
	static void practice12() {
		
		for(int i=1; i<10; i++) {
			// 위쪽 형식 만들어주기
			if(i == 1) {
				System.out.print("   |  ");
				for(int k=1; k<10; k++) {
					System.out.print(k + "  ");
				}
				System.out.println();
				System.out.print("---+");
				for(int l=1; l<28; l++) {
					System.out.print("-");
				}
			}
			
			System.out.println();
			
			// 왼쪽 형식 만들어주기
			System.out.print(i + "  |");
			
			// 곱셈 출력
			for(int j=1; j<10; j++) {
				System.out.printf("%3d", i * j);
			}
		}
	}
	
	/**
	 *  연습문제13. 덧셈을 출력하는 프로그램
	 *  연습문제12와 같은 형식으로 출력
	 */
	static void practice13() {
		
		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i + j);
			System.out.println();
		}
	}
	
	/**
	 *  연습문제14. 입력한 수를 한 변으로 하는 정사각형을 *기호로 출력하는 프로그램 작성
	 */
	static void practice14() {
		Scanner sc = new Scanner(System.in);
		int n;
		
		//1. 양수인지 검사하기
		do {
			System.out.println("단 수 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		//2. 출력
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	/**
	 *  연습문제15. 직각 이등변 삼각형을 출력하는 부분을 해당 형식의 메서드로 작성
	 */
	static void practice15() {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		triangleLB(n);
	}
	
	// 직각 이등변 삼각형 메서드
	static void triangleLB(int n) {
		
		// 왼쪽 아래가 직각인 이등변삼각형
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 왼쪽 위가 직각인 이등변삼각형
		for(int i=1; i<-n; i++) {
			for(int j=1; j<=(n-i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 오른쪽 위가 직각인 이등변삼각형
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(i-1); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 오른쪽 아래가 직각인 이등변삼각형
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-1); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 *  연습문제16. n단의 피라미드를 출력하는 메서드 작성
	 */
	static void practice16() {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("몇 단 피라미드입니까? : ");
			n = sc.nextInt();
		} while(n <= 0);
	
		spira(n);
	}
	
	// n단의 피라미드를 출력하는 메서드
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			
			/* 내 로직
			for(int k=n-i; k>0; k--) {
				System.out.print(" ");
				
			}
			
			// 1  1 1+0 
			// 2  3 2+1
			// 3  5 3+2
			// 4  7 4+3
			for(int j=1; j<=i+(i-1); j++) {
				System.out.print("*");
			}
			*/
			
			/* 해설 로직 */
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			
			System.out.println();
		}
	}
	
	
	
	/**
	 *  연습문제17. 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드 작성
	 *  i행에 출력하는 숫자는 i % 10 으로 구하기
	 */
	static void practice17() {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("몇 단 피라미드입니까? : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		npira(n);
	}
	
	// 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드
	static void npira(int n) {
		for(int i=1; i<=n; i++) {
			
			for(int k=n-i; k>0; k--) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i+(i-1); j++) {
				System.out.print(i % 10); 
			}
			
			System.out.println();
		}
	}
	
		
}
