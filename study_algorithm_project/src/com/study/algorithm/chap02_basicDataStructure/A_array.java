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
	
	// [기수 변환]
	/*
	 * 10진수 정수를 n징수 정수로 변환하려면 
	 * 정수를 n으로 나눈 나머지를 구하는 동시에 그 몫에 대해 나눗셈을 몫이 0이될 때까지 반복해야 한다.
	 * 이를 거꾸로 늘어 놓은 숫자가 기수로 변환한 숫자이다.
	 */
	// 실습 2-8[A] 10진수를 2진수 ~ 36진수로 기수 변환하기
	static int cardConvR(int x, int r, char[] d) {
		//정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수 반환
		int digits = 0; // 변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;
		} while(x != 0);
		
		return digits;
	}
	public void carconvRev() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 x : ");
		int x = sc.nextInt();
		
		System.out.print("몇 진수로 변환할까요? : ");
		int r = sc.nextInt();
		
		char[] d = new char[r];
		int result = cardConvR(x, r, d);
		
		System.out.println("변환 후 자릿수 : " + result);
	}
	
	// 실습 2-8[B]
	public void cardConvRev() {
		Scanner stdIn = new Scanner(System.in);
		
		int no; // 변환할 정수
		int cd; // 기수
		int dno; // 변환 후의 자릿 수
		int retry; // 다시 한 번?
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환할 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			} while(no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2 ~ 36) : ");
				cd = stdIn.nextInt();
			} while(cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "진수로는 ");
			for(int i=dno-1; i>=0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1. 예 / 0. 아니오) : ");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
	
	// 연습문제 6. 배열의 앞쪽에 아랫자리가 아닌 윗자리를 넣어두는 메서드 작성
	static int cardConv(int x, int r, char[] d) {
		
		int digits = 0; // 변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);
		
		for(int i=0; i< digits / 2; i++) {
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		
		return digits;
	}
	
	// 연습문제 7. 기수 변환 과정을 자세히 나타내는 프로그램 작성
	static int convPractice7(int x, int r, char[] d) {
		
		int n = ((Integer)x).toString().length(); // 변환 전의 자릿수
		int digits = 0; // 변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
		do {
			
			System.out.printf("  +");
			
			for(int i=0; i<n+2; i++)
				System.out.print("-");
			System.out.println();
			
			if(x / r !=0)
				System.out.printf(String.format("%%2d | %%%dd    ...%%d\n", n), r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    ...%%d\n", n), x / r, x % r);
			
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);

		for(int i=0; i<digits/2; i++) {
			char temp = d[i];
			d[i] = d[digits-1-i];
			d[digits - i - 1] = temp;
		}
		
		return digits;
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		int x; // 변환할 정수
		int r; // 변환할 진수
		char[] d = new char [36];
		
		System.out.println("10진수를 기수 변환합니다.");
		
		do {
			System.out.print("변환할 음이 아닌 정수 : ");
			x = sc.nextInt();
		} while(x < 0);
		
		do {
			System.out.print("어떤 진수로 변환할까요?(2~36) : ");
			r = sc.nextInt();
		} while(r < 2 || r > 36);
		
		int result = convPractice7(x, r, d);
		System.out.println( r + "진수로 ");
		for(int i=0; i<result; i++) {
			System.out.print(d[i]);
		}
		System.out.println("입니다.");
	}
	
	// [소수의 나열]
	// 실습 2-9. 1,000 이하의 소수를 열거하기
	/*
	 * 만약 n이 2 또는 3으로 나누어 떨어지지 않으면, 2X2인 4 또는 2X3인 6으로도 나누어 떨어지지 않는다.
	 * 이 프로그램은 반복문을 이용하여 차례차례 모두 나누고 있으므로, 불필요한 나눗셈을 하고 있는 것이다.
	 * 즉, 정수 n이 소수인지 여부를 먼저 조사해야 한다.
	 * 예를 들면, 7이 소수인지는 7보다 작은 소수 2, 3, 5로 나눗셈을 하면 충분하다.
	 */
	public void primeNumber1() {
		int counter = 0; // 나눗셈의 횟수
		
		for(int n = 2; n <= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				counter ++;
				if(n % i == 0)	// 나누어 떨어지면 소수가 아님!!
					break;		// -> 반복 불필요함
			}
			if(n == i)	// n이 i와 같다면 == 마지막까지 나누어 떨어지지 않음
				System.out.println(n);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
	
	// 실습 2-10. 실습 2-9 알고리즘 개선하기
	/*
	 * 소수를 구하는 과정에서 그때까지 구한 소수를 배열 prime의 요소로 저장하는데, 
	 * 이때 n이 소수인지 아닌지 판단하기 위해서는 쌓아두었던 소수에서 나눗셈을 진행한다.
	 * 왜냐하면 소수는 2부터 n-1까지 어떤 소수로도 나누어 떨어지지 않기 때문이다.
	 * 
	 * 실습2-9에서는 나눗셈의 횟수가 78,022회였지만 해당 프로그램에서는 나눗셈의 횟수가 14,622로 대폭 감소한 것을 알 수 있다.
	 * 두 프로그램을 비교해보면 다음과 같은 결론을 내릴 수 있다.
	 * 1. 같은 답을 얻는 알고리즘은 하나가 아니다.
	 * 2. 빠른 알고리즘은 메모리를 많이 요구한다.
	 * 
	 */
	public void primeNumber2() {
		int counter = 0; // 나눗셈의 횟수
		int ptr = 0; // 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열
		
		prime[ptr++] = 2; // 2는 소수임
		
		// 3부터 1000까지 홀수만 계산하기
		for(int n=3; n<=1000; n+=2) {
			int i;
			for(i=1; i<ptr; i++) {
				counter++;
				if(n % prime[i] == 0)
					break;
			}
			if(ptr == i)
				prime[ptr++] = n;
		}
		
		// 찾은 ptr개의 소수를 나타냄
		for(int i=0; i<ptr; i++)
			System.out.println(prime[i]);
	
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
	
	// 실습 2-11. 실습 2-10의 알고리즘 개선2
	/*
	 * 100의 약수는 2X50, 4X25, 5X20, 10X10, 20X5, 25X4, 50X2라고 할 수 있다. 
	 * 이를 그래프로 나타내면 10X10 정사각형을 기준으로 넓이가 100인 직사각형이 대칭을 이룬다. 
	 * 직사각형의 한 변의 길이까지만 소수로 나눗셈을 시도하고, 그 과정에서 한 번도 나누어 떨어지지 않으면 소수라고 판단할 수 있다.
	 * 예를 들면, 100이 5로 나누어 떨어지지 않는다면 20도 나누어 떨어지지 않는다.
	 * 
	 * 이러한 성질을 이용하면 제곱근을 한 변으로 하는 직사각형에 대해 생각해볼 수 있다.
	 * 즉, 소수는  n의 제곱근 이하의 어떤 소수로도 나누어 떨어지지 않는다고 할 수 있다.
	 * 
	 * 이를 알아보기 위해서 prime[i]가 n의 제곱근 이하인지를 판단하면 된다.
	 */
	public void primeNumber3() {
		int counter = 0; // 곱셈과 나눗셈의 횟수
		int ptr = 0; // 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열
		
		prime[ptr++] = 2; // 2는 소수임
		prime[ptr++] = 3; // 3은 소수임
		
		// 5부터 1000까지 홀수만 계산
		for(int n=5; n<=1000; n+=2) {
			boolean flag = false;
			
			// prime[i] n의 제곱근 이하인지 판단 == 사각형 한 변의 길이가 n으로 나누어떨어지는지 검사
			for(int i=1; (prime[i] * prime[i]) <= n; i++) {
				counter += 2; // 곱셈과 나눗셈을 한번씩 하기 때문에 2씩 증가
				
				// 나누어 떨어진다면 소수가 아님 -> 반복 불필요
				if(n % prime[i] == 0) {
					flag = true;
					break;
				}
			}
			
			// 마지막까지 나누어 떨어지지 않음 -> 소수임
			// 앞서 prime[i]Xprime[i] <= n이 성립하지 않은 경우 for루프 본문으로 들어갈 수 없으므로 해당 곱셈이 counter에 포함되지 않는다. 따라서 여기서 counter를 증가시켜준다.
			if(!flag) {
				prime[ptr++] = n;
				counter++;
			}
		}
		
		for(int i=0; i<ptr; i++)
			System.out.println(prime[i]);
	
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
	}
	
	// [다차원 배열]
	
	// 실습 2-12. 2행 4열의 2차원 배열
	public void int2dArray() {
		int[][] x = new int[2][4];
		
		x[0][1] = 37;
		x[0][3] = 54;
		x[1][2] = 65;
		
		for(int i=0; i<2; i++)
			for(int j=0; j<4; j++)
				System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
	}
	
	// 실습 2-13. 한 해의 경과 일 수를 계산하는 프로그램
	/*
	 * m월 d일의 그 해 경과 일 수는 다음과 같다.
	 * 1월, 2월, ..., m-1월의 일 수 합 + d
	 * 
	 * 그런데 2월의 경우 평년은 28일, 윤년은 29일로 해에 따라 일수가 달라진다.
	 * 4로 나누어떨어지는 해를 윤년이라고 한다.
	 * 또한, 100으로 나누어떨어지지만, 400으로 나누어떨어지지 않는 해를 평년이라고 한다.
	 * 2월은 2행 12열의 2차원 배열에 각 일 수를 저장할 수 있다.
	 */
	
	// 각 달의 일수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
	};
	
	// 서기 year년은 윤년인가? (윤년 : 1 / 평년 : 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	// 서기 y년 m월 d일의 그 해 경과 일수를 구함
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i=1; i<m; i++){
			days += mdays[isLeap(y)][i - 1];
		}
		return days;
	}
	
	public void dayOfYear() {
		Scanner sc = new Scanner(System.in);
		
		int retry; // 다시 한 번 진행할 건지 여부
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년 : ");
			int year = sc.nextInt();
			System.out.print("월 : ");
			int month = sc.nextInt();
			System.out.print("일 : ");
			int day = sc.nextInt();
			
			System.out.printf("그 해 %d일째입니다.\n", practice8(year, month, day));
			
			System.out.print("한 번 더 할까요? (1. 예 / 0. 아니오) : ");
			retry = sc.nextInt();
		} while(retry == 1);
	}
	
	// 연습문제 8. 메서드 dayOfYear를 변수 i와 days없이 구현하시오. while문 사용
	static int practice8(int y, int m, int d) {
		
		m -= 1;
		
		while(m > 0) {
			d += mdays[isLeap(y)][m--];
		}
		
		return d;
	}
	
	// 연습문제9. y년 m월 d일의 그 해 남은 일 수 (12월 31이면 0, 12월 30일이면 1)를 구하는 메서드 작성
	static int leftDayOfYear(int y, int m, int d) {
		
		m -= 1;
		
		int leftDay = mdays[isLeap(y)][m] - d;
		
		while(m < 11) {
			leftDay += mdays[isLeap(y)][m++];
		}
		
		return leftDay;
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		int retry; // 다시 한 번 진행할 건지 여부
		
		System.out.println("그 해 남은 일수를 구합니다.");
		
		do {
			System.out.print("년 : ");
			int year = sc.nextInt();
			System.out.print("월 : ");
			int month = sc.nextInt();
			System.out.print("일 : ");
			int day = sc.nextInt();
			
			System.out.printf("그 해 %d일 남았습니다.\n", leftDayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? (1. 예 / 0. 아니오) : ");
			retry = sc.nextInt();
		} while(retry == 1);
	}
	
	// [확장 for문]
	/*
	 * 확장for문의 장점
	 * 1. 배열의 요솟수(길이)를 조사하는 수고를 덜 수 있다.
	 * 2. iterator와 같은 방법으로 스캔할 수 있다.
	 * 즉, 배열의 모든 요소를 스캔하는 과정에서 인덱스 자체의 값이 필요하지 않으면 그 스캔은 확장 for문에 의해 구현하는 것이 좋다.
	 */
	// 실습 2C-1. 배열의 모든 요소의 합을 구하여 출력(확장 for문 사용)
	public void arraySumForIn() {
		double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		
		for(int i=0; i<a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	
		double sum = 0;
		
		for(double i : a)
			sum += i;
		
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
	}
	
} 
