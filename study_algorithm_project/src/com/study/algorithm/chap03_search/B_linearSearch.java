package com.study.algorithm.chap03_search;

import java.util.Scanner;

public class B_linearSearch {

	// [선형 검색]
	/*
	 * 요소가 직선인 모양으로 늘어선 배열에서의 검색은 원하는 키 값을 갖는 요소를 만날 때까지 맨 앞부터 순서대로 요소를 검색하면 된다.
	 * 이를 선형 검색(linear search) 또는 순차 검색(sequential search) 알고리즘이라고 한다.
	 * 
	 * 검색의 종료 조건은 2개이다.
	 * 1. 검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우
	 * 2. 검색할 값과 같은 요소를 발견한 경우
	 * 1번은 검색 실패로, n+1회 검사를 하게 되고
	 * 2번은 검색 성공으로, n회 검사를 하게 된다.
	 * 
	 * 배열의 요솟수가 n개일 때 조건을 판단하는 횟수는 평균 n / 2회 이다.
	 */
		
	// 실습 3-1. 선형검색 (while)
	/*
	 * 조건 판단 횟수는 3회 (while(1), if(i == n), if(a[i] == key))이다.
	 */
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if (i == n)
				return -1; // 검색 실패 시 -1을 반환
			if (a[i] == key)
				return i; // 검색 성공 시 인덱스를 반환
			i++;
		}
	}
	public void seqSearch() {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
			
		System.out.println("검색할 값 : "); // 키 값을 입력
		int key = sc.nextInt();
			
		int idx = seqSearch(x, num, key); // 배열 x에서 키 값이 ky인 요소를 검색
			
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
	}
		
	// 실습 3-02. 선형검색 (for)
	/*
	 * 앞에서 사용했던 while문 대신 for문을 사용하면 보다 짧고 간결해진 것을 볼 수 있다.
	 */
	static int seqSearch2(int[] a, int n, int key) {
		for(int i=0; i<n; i++)
			if(a[i] == key)
				return i;
		return -2;
	}
		
	// [보초법]
	/*
	 * 선형검색은 반복할 때마다 앞에서 살펴봤듯이 2가지의 종료 조건을 모두 판단한다.
	 * 이를 반으로 줄일 수 있는 방법이 보초법(sentinel method)이다.
	 * 
	 * 초기에 준비해둔 a[0] ~ a[6] 의 데이터가 있다고 할 때, 
	 * 검색하기 전에 검색하고자 하는 키 값을 맨 끝 요소 a[7]에 저장해두고, 이를 보초(sentinel)라고 한다.
	 * 그러면 데이터에 존재하지 않는 값을 검색할 때 보초인 a[7]까지 검색하여 종료조건2번이 성립한다.
	 * 즉, 종료조건 1번 (검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우)은 필요하지 않다는 것이므로, 종료조건을 1회로 줄일 수 있다는 것이다.
	 */
	// 실습 3-3. 보초법
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key; // 보초 추가
			
		while(true) {
			if(a[i] == key) // 검색 성공 시
				break;
			i++;
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
			
		int idx = seqSearchSen(x, num, key);
			
		if(idx == -1)
			System.out.println("그 값의 요소가 존재하지 않습니다.");
		else
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
	}
	
	/*
	 * 시간복잡도
	 * 
	 * 1. int i = 0;
	 * 		변수 i에 0을 대입하는 횟수는 처음 한 번 실행한 이후엔 없다. 이렇게 한 번만 실행하는 경우 복잡도는 O(1)로 표기한다.
	 * 		또한, 메서드에서 값을 반환하는 return i;나 return -1; 도 한 번만 실행되기 때문에 O(1)로 표기한다.
	 * 2. while(i < n){}
	 * 3. if(a[i] == key)
	 * 		배열의 맨 끝에 도달했는지를 판단하는 것과, 현개 검사하고 있는 요소와 찾고자 하는 값이 같은지를 판단하는 것의 평균 실행 횟수는 n/2이다.
	 * 		이처럼 n에 비례하는 횟수만큼 실행하는 경우의 복잡도를 O(n)으로 표기한다. 
	 * 		
	 */
	static int seqSearchComplexity(int[] a, int n, int key) {
		
		int i = 0;
		while(i < n) {
			if(a[i] == key) {
				return i;		// 검색 성공
			}
			i++;
		}
		return -1;				// 검색 실패
	}
}
