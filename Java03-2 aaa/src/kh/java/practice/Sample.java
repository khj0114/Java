package kh.java.practice;

import java.util.Scanner;
public class Sample {
	public void Sample1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력 :");
		char ch = sc.next().charAt(0);
		int unicode = ch;
		System.out.println(ch+"의 유니코드 값 :"+unicode);
		System.out.println(ch+"의 유니코드 값 :"+(int)ch);
		System.out.printf("%c의 유니코드 값 : %d",ch,(int)ch);
		
		
		
	}
	public void Sample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 :");
		double K =sc.nextDouble();
		
		System.out.print("수학점수 입력 :");
		double M = sc.nextDouble();
		
		System.out.print("영어점수 입력 :");
		double E = sc.nextDouble();
		System.out.println("===========결과===========");
		int sum = (int)(K+M+E);
		int avg = sum/3;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
		
	}
	
	}

	