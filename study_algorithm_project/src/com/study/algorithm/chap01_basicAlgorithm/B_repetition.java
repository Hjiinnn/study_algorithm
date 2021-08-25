package com.study.algorithm.chap01_basicAlgorithm;

import java.util.Scanner;

public class B_repetition {
	
	// 실습1-4. 1부터 n까지의 정수 합 구하기
	public void sumWhile() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 n입력 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 0;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
	
	// 연습문제6. 실습1-4에서 while문이 종료될 때 변수 i 값이 n + 1이 됨을 확인하기 (변수 i값을 출력하도록 프로그래밍)
	public void practice6() {
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
	
	// 실습1-5. 1부터 n까지의 정수의 합을 for문으로 구하기 
	public void sumFor() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 n입력 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) 
			sum += i;
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
	
	// 연습문제7. 실습1-5 프로그램을 참고하여 n이 7이면 '1+2+3+4+5+6+7=28'로 출력하는 프로그램 작성
	public void practice7() {
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
	public void practice8() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 n입력 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		/*
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
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();
	
		System.out.print("b : ");
		int b = sc.nextInt();
		
		int sum = sumof(a, b);
		
		System.out.println(a + "와  " + b + "사이의 합은 " + sum + "입니다.");
	}
	
	// 실습1-6. 양수만 입력하기
	/*
	 * 실습1-5 프로그램을 실행하여 변수 n에 음수인 -5를 입력하면 '1부터 -5까지의 합은 0입니다.'가 출력된다.
	 * 이는 수학적으로 정확한 표현이 아니기 때문에 양수만 n 값으로 입력하도록 해야 한다.
	 * 
	 * 양수만 받을 수 있도록 0 이하인 값이 입력되면 n의 값을 다시 입력할 수 있도록 do while문을 이용했다.
	 */
	public void sumForPos() {
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
	
	/*
	 * 사전 판단 반복  VS 사후 판단 반복
	 * while문과 for문은 사전 판단 반복문이고, do문은 사후 판단 반복문이다.
	 * while과 for문은 처음에 제어식을 평가한 결과가 0이면 루프 본문은 한 번도 실행되지 않는다.
	 * 이와 달리 do문은 루프 본문이 반드시 한 번은 실행된다.
	 */
	
	// 연습문제10. 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램 작성 (변수 b에 입력한 값이 a 이하면, 변수 b의 값을 다시 입력)
	public void practice10() {
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
	
	// 연습문제11. 양의 정수를 입력하고 자릿수를 출력하는 프로그램
	// 			 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고, 1314를 입력하면 '그 수는 4자리입니다.'라고 출력
	public void practice11() {
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
	
	
	/*
	 * 구조적 프로그래밍이란?
	 * 하나의 입구와 하나의 출구를 가진 구성 요소만을 계층적으로 배치하여 프로그램을 구성하는 방법을 구조적 프로그래밍(structured programming)이라고 한다.
	 * 구조적 프로그래밍은 순차, 선택, 반복이라는 3종류의 제어 흐름을 사용한다.
	 */
	
	// 실습 1C-2. 논리 연산과 드모르간 법칙
	//          입력한 값을 '2자리의 양수'로 제한하기
	/*
	 * 드모르간 법칙
	 * 각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고, 다시 전체를 부정하면 원래의 조건과 같다.
	 * no < 10 || no > 99 -----> !(no >= 10 && no <= 99)
	 */
	public void digits() {
		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.print("입력 : ");
			no = sc.nextInt();
		} while(no < 10 || no > 99);
		
		System.out.print("변수 no의 값은 " + no + "가(이) 되었습니다.");
	}
	
	// [다중 루프]
	// 실습 1-7. 곱셈표
	/*
	 * 바깥쪽의 for문은 1행, 2행... 9행까지 해당한다. 즉, 세로 방향에 대한 반복이다.
	 * 안쪽의 for문은 변수 j의 값을 1부터 9까지 증가시킨다. 즉, 행의 가로 방향에 대한 반복이다.
	 */
	public void multi99Table() {
		System.out.println("----- 곱셈표 -----");
		
		for(int i=1; i<10; i++) {
			for (int j=1; j<10; j++) 
				System.out.printf("%3d", i * j);
			System.out.println();
		}
	}
	
	// 연습문제12. 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램 작성
	//			단, 구분선은 수직선기호(|), 마이너스 기호(-), 플러스 기호(+) 사용
	public void practice12() {
		
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
	
	// 연습문제13. 덧셈을 출력하는 프로그램
	//          연습문제12와 같은 형식으로 출력
	public void practice13() {
		
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
	
	// 연습문제14. 입력한 수를 한 변으로 하는 정사각형을 *기호로 출력하는 프로그램 작성
	public void practice14() {
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
	
	// 실습 1-8. 직각 이등변 삼각형 출력 (별찍기)
	public void triangleLB() {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		// 1. 양수인지 검사하기
		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		// 2. 출력하기
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 연습문제15. 직각 이등변 삼각형을 출력하는 부분을 해당 형식의 메서드로 작성
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
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		triangleLB(n);
	}
	
	// 연습문제16. n단의 피라미드를 출력하는 메서드 작성
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
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("몇 단 피라미드입니까? : ");
			n = sc.nextInt();
		} while(n <= 0);
	
		spira(n);
	}
	
	// 연습문제17. 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드 작성
	//           i행에 출력하는 숫자는 i % 10 으로 구하기
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
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("몇 단 피라미드입니까? : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		npira(n);
	}
}
