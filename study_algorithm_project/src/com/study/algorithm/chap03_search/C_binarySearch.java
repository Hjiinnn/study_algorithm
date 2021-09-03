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
}
