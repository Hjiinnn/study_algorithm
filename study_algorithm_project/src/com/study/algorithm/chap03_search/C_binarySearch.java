package com.study.algorithm.chap03_search;

import java.util.Scanner;

public class C_binarySearch {
	/*
	 * 이진 검색은 선형 검색보다 좀 더 빠르게 검색할 수 있다는 장점이 있다.
	 * 검색 대상(배열)이 정렬되어 있음을 가정한다.
	 * 
	 * 이진검색(binary search)
	 * 요소가 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘
	 * 
	 * pl : 검색 범위의 맨 앞 인덱스
	 * pr : 검색 범위의 맨 끝 인덱스
	 * pc : 검색 범위의 중앙 인덱스
	 * 
	 * pl = 0
	 * pr = n - 1
	 * pc = (n - 1) / 2
	 * 
	 * * 이진 검색을 한 단계씩 진행할 때마다 검색 범위가 거의 반으로 좁혀진다.
	 * 
	 * 1. pc < key
	 * 		pl ~ pc까지는 검색 대상에서 제외하고 검색 범위를 pc(n-1/2) ~ pr로 좁힌다.
	 * 		pl = pc + 1 로 업데이트 한다.
	 * 2. pc > key
	 * 		pc ~ pr까지는 검색 대상에서 제외하고 검색 범위를 pl ~ pc(n-1/2)로 좁힌다.
	 * 		pr = pc - 1로 업데이트 한다.
	 * 
	 * 검색 알고리즘의 종료 조건은 아래 중 하나만 성립하면 된다.
	 * 1. pc와 key가 일치하는 경우
	 * 2. 검색 범위가 더 이상 없는 경우
	 * 
	 * 이진 검색은 검색을 반복할 대마다 검색 범위가 절반이 되므로 검색에 필요한 비교 횟수의 평균값은  log n이다.
	 * 검색에 실패한 경우는 [log(n+1)]회, 검색에 성공한 경우는 log n-1회가 된다.
	 */
	
	// 실습 3-4. 이진 검색
	// 요솟수가 n인 배열 a에서 key 와 같은 요소를 이진 검색한다.
	static int binSearch(int [] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2; 
			// pc == key인 경우
			if(a[pc] == key) {
				return pc;
			
			// pc < key인 경우
			}else if(a[pc] < key) {
				pl = pc + 1;
			
			// pc > key인 경우
			}else {
				pr = pc - 1;
			}
		} while(pl <= pr);
		
		return -1; // 검색 실패
	}
	
	public void binSearch() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while(x[i] < x[i - 1]);
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = binSearch(x, num, key);
		
		if(idx == 1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}
	}
	
	/*
	 * 복잡도
	 * 프로그램의 실행 속도는 프로그램이 동작하는 하드웨어나 컴파일러 등의 조건에 따라 달라진다.
	 * 알고리즘의 성능을 객관적으로 평가하는 기준을 복잡도(complexity)라고 한다.
	 * - 시간 복잡도(time complexity) : 실행에 필요한 시간을 평가한 것
	 * - 공간 복잡도(space complexity) : 기억 영역과 파일 공간이 얼마나 필요한가를 평가한 것
	 */
	
	/*
	 * 시간복잡도
	 * 한 번만 실행하는 경우 : O(1)
	 * n에 비례하는 횟수만큼 실행하는 경우(평균 실행 횟수 : n / 2) : O(n)
	 * 		-> 왜 O(n/2)가 아닌가? n의 값이 무한히 커진다고 가정했을 때, 그 차이가 무의미해짐
	 * 
	 * 근데 이 n이 점점 커지면 O(n)에 필요한 계산 시간은 n에 비례하여 점점 길어진다.
	 * 이와 달리 O(1)에 필요한 계산 시간은 변하지 않는다.
	 * 일반적으로 O(f(n))과 O(g(n))의 복잡도를 계산하는 방법은 아래와 같다.
	 * O(f(n)) + O(g(n)) = O(max(f(n), g(n))
	 * 		- max(a, b) : a와 b 가운데 큰 쪽
	 * 
	 * 2개 이상의 복잡도로 구성된 알고리즘의 전체 복잡도는 차원이 더 높은 족의 복잡도를 우선시한다.
	 * 즉, 전체 복잡도는 차원이 가장 높은 복잡도를 선택한다.
	 * 그러므로 선형 검색 알고리즘의 복잡도를 구하면 아래와 같다.
	 * O(1) + O(n) + O(n) + O(1) + O(n) + O(1) = O(max(1, n, n, 1, n, 1)) = O(n)
	 */
	
	// 연습문제 1. 실습 3-3의 seqSearchSen 메서드를 while문이 아니라 for문을 사용하여 수정한 프로그램을 작성
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		
		for(i=0; i<n; i++) {
			if(a[i] == key) {
				break;
			}
		}
		return i == n ? -1 : i;
	}
	public void seqSearchSen() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num + 1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = practice2(x, num, key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 존재하지 않습니다.");
		}else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}
	}
	
	// 연습문제 2. 검색의 스캐닝 과정을 상세하게 출력하는 프로그램 작성
	//			이때, 각 행의 맨 왼쪽에 현재 검색하는 요소의 인덱스를 출력하고, 현재 검색하고 있는 요소 위에 별포 기호 *를 출력
	static int practice2(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		
		System.out.print("   |");
		for(int k=0; k<=n; k++) {
			System.out.printf("%4d", k);
		}
		System.out.println();
		
		System.out.print("---+");
		for(int k=0; k<=4*n+2; k++) {
			System.out.print("-");
		}
		System.out.println();
		
		for(i=0; i<n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			
			for(int j=0; j<n; j++) {
				System.out.printf("%4d", a[j]);
			}
			System.out.println("\n   |");
			
			if(a[i] == key) {
				break;
			}
		}
		return i == n ? -1 : i;
	}
	
	// 이진 검색의 시간 복잡도
	/*
	 * O(log n)
	 */
	static int binSearch2(int[] a, int n, int key) {
		int pl = 0; // 검색 범위 맨 앞의 인덱스
		int pr = n-1; // 검색 범위 맨 끝의 인덱스
		
		do {
			int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
			if(a[pc] == key) {
				return pc;
			}else if(a[pc] < key) {
				pl = pc + 1;
			}else {
				pr = pc - 1;
			}
		} while(pl <= pr);
		
		return -1; // 검색 실패
	}
	
	// 연습문제3. 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고,
	//			일치한 요솟수를 반환하는 메서드를 작성하세요.
	//			요솟수가 8인 배열 a의 요소가 {1, 9, 2, 9, 4, 6, 7, 9}이고 key가 9면 배열{1, 3, 7}을 저장하고 3 반환
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		
		int idxN = 0;
		for(int i=0; i<n; i++) {
			if(a[i] == key) {
				idx[idxN++] = i;
			}
		}
		return idxN;
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("요솟수 : ");
			n = sc.nextInt();			
		} while(n <= 0);
		
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		int key;
		do {
			System.out.print("key : ");
			key = sc.nextInt();
		} while(key < 0);
		
		int[] idx = new int[n];
		int result = searchIdx(a, n, key, idx);
		
		if(result == 0) {
			System.out.println("그 값의 요소가 존재하지 않습니다.");
		}else {
			for(int i=0; i<result; i++) {
				System.out.println("그 값은 x[" + idx[i] + "]에 있습니다.");
			}
		}
	}
	
	// 연습문제4. 이진 검색의 과정을 자세히 출력하는 프로그램 작성
	//			각 행의 맨 왼쪽에 현재 검색하고 있는 요소의 인덱스를 출력하고, 
	//			검색 범위의 맨 앞 요소 위에 <-, 맨 끝 요소 위에 ->, 현재 검색하고 있는 중앙 요소 위에 +를 출력
	static int prc4(int[] a, int n, int key) {
		
		System.out.print("   |");
		for(int i=0; i<n; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		
		System.out.print("---+");
		for(int i=0; i<n*4; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2;
			
			System.out.print("   |");
			if(pl != pc) {
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			}else {
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			}
			
			if(pc != pr) {
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			}else {
				System.out.println("->");
			}
			
			System.out.printf("%3d|", pc);
			
			for(int i=0; i<n; i++) {
				System.out.printf("%4d", a[i]);
			}
			System.out.println("\n   |");

			if(a[pc] == key) {
				return pc;
			}else if(a[pc] < key) {
				pl = pc + 1;
			}else {
				pr = pc - 1;
			}
			
		} while(pl <= pr);
		
		return -1;
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("요솟수 : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		int[] a = new int[n];
		System.out.print("a[0] : ");
		a[0] = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("찾을 값 : ");
		int key = sc.nextInt();
		
		int result = prc4(a, n, key);
		
		if(result == -1) {
			System.out.println("그 값의 요소가 존재하지 않습니다.");	
		}else {
			System.out.println("그 값은 a[" + result + "]에 있습니다.");
		}
	}
	
	// 연습문제5. 이진 검색 알고리즘 프로그램은 검색할 값과 같은 값을 갖는 요소가 하나 이상일 경우 그 요소 중에서 맨 앞의 요소를 찾지 못한다.
	//			검색에 성공했을 때 그 위치로부터 앞쪽으로 하나씩 검사하면 여러 요소가 일치하는 경우에도 가장 앞쪽에 위치하는 요소의 인덱스를 찾을 수 있다.
	//			맨 앞의 요소를 찾는 메서드를 작성해 보시요.
	static int binSearchX(int[] a, int n, int key) {
		
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2;
				
			if(a[pc] == key) {
				for(int i=pc; i>=0; i--) {
					if(a[i] != key) {
						return i + 1;
					}
				}
			}else if(a[pc] < key) {
				pl = pc + 1;
			}else {
				pr = pc - 1;
			}
			return -1;
		} while(pl <= pr);
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("찾을 값 : ");
		int key = sc.nextInt();
	
		int result = binSearchX(a, n, key);
		
		if(result == -1) {
			System.out.println("일치하는 값이 없습니다.");
		}else {
			System.out.println("a[" + result + "]에 있습니다.");
		}
	}
	
}
