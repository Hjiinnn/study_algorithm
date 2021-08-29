package com.study.algorithm.chap02_basicDataStructure;

import java.util.Scanner;

public class B_class {

	/*
	 * 클래스란?
	 * 여러 형의 요소를 조합하여 만든 자료구조를 클래스(class)라고 한다.
	 */
	
	// [클래스의 배열]
	
	// 실습 2-14. 신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포 구하기
	static final int VMAX = 21; // 시력분포(0.0에서 0.1단위로 21개)
	
	static class PhyscData{
		String name; 
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	// 키의 평균값 구하기
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i=0; i<dat.length; i++)
			sum += dat[i].height;
		
		return sum / dat.length;
	}
	
	// 시력 분포 구하기
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		
		dist[i] = 0;
		for(i = 0; i<dat.length; i++)
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int)(dat[i].vision * 10)]++;
	}
	
	public void physicalExamination() {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영준", 174, 1.2),
				new PhyscData("박용규", 169, 0.8),
		};
		int[] vdist = new int[VMAX]; // 시력분포
		
		System.out.println("-- 신체검사 리스트 --");
		System.out.println("이름     키   시력");
		System.out.println("-----------");
		for(int i=0; i<x.length; i++)
			System.out.printf("%-8s%d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		
		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist); // 시력 분포 구하기
		
		System.out.println("\n시력 분포");
		for(int i=0; i<VMAX; i++)
			System.out.printf("%3.1f~ : %2d명\n", i/10.0, vdist[i]);
		
	}
	
	// 연습문제 10. 시력 분포를 그래프로 출력하도록 바꾸어 프로그램을 작성하시요.
	//           기호 문자 *를 사람 수 만큼 반복해서 나타내세요
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영준", 174, 1.2),
				new PhyscData("박용규", 169, 0.8),
		};
		int[] vdist = new int[VMAX]; // 시력분포
		
		System.out.println("-- 신체검사 리스트 --");
		System.out.println("이름     키   시력");
		System.out.println("-----------");
		for(int i=0; i<x.length; i++)
			System.out.printf("%-8s%d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		
		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist); // 시력 분포 구하기
		
		System.out.println("\n시력 분포");

		for(int i=0; i<VMAX; i++) {
			String star = "";
			for(int j=0; j<vdist[i]; j++) {
				star += "*";
			}
			System.out.printf("%3.1f~ : %2s\n", i/10.0, star);
		}
	}
	
	// 연습문제 11. 서기 년월일을 필드로 갖는 클래스를 만들고, 생성자 메서드를 정의하시오.
	public class YMD {
		private int y; // 년
		private int m; // 월
		private int d; // 일
		
		YMD(int y, int m, int d ){
			this.y = y;
			this.m = m;
			this.d = d;
		}
		
		// n일 뒤의 날짜를 반환
		YMD after(int n) {
			YMD temp = new YMD(this.y, this.m, this.d);
			if (n < 0)
				return (before(-n));

			temp.d += n;

			while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
				temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
				if (++temp.m > 12) {
					temp.y++;
					temp.m = 1;
				}
			}
			return temp;
		}

		// n일 앞의 날짜를 반환
		YMD before(int n) {
			YMD temp = new YMD(this.y, this.m, this.d);
			if (n < 0)
				return (after(-n));

			temp.d -= n;

			while (temp.d < 1) {
				if (--temp.m < 1) {
					temp.y--;
					temp.m = 12;
				}
				temp.d += mdays[isLeap(temp.y)][temp.m - 1];
			}
			return temp;
		}

	}
	
	// 각 달의 일수
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
					         { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
	};

	// 서기 year년은 윤년인가? (윤년：1／평년：0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
			
	public void practice11() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년：");
		int y = stdIn.nextInt();
		System.out.print("월：");
		int m = stdIn.nextInt();
		System.out.print("일：");
		int d = stdIn.nextInt();
		YMD date = new YMD(y, m, d);

		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = stdIn.nextInt();

		YMD d1 = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);

		YMD d2 = date.before(n);
		System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
	}
	
}
