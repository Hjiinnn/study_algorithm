package com.study.algorithm.chap01;

//실습 1-7. 곱셈표를 출력한다.
/*
 * 바깥쪽의 for문은 1행, 2행... 9행까지 해당한다. 즉, 세로 방향에 대한 반복이다.
 * 안쪽의 for문은 변수 j의 값을 1부터 9까지 증가시킨다. 즉, 행의 가로 방향에 대한 반복이다.
 */
public class Multi99Table {

	public static void main(String[] args) {
		System.out.println("----- 곱셈표 -----");
		
		for(int i=1; i<10; i++) {
			for (int j=1; j<10; j++) 
				System.out.printf("%3d", i * j);
			System.out.println();
		}
	}

}
