package kh.java.function;

import java.util.Scanner;

public class Example {
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번 째 정수 입력 :");
		int fs = sc.nextInt();
		
		System.out.println("두번 째 정수 입력 :");
		int se = sc.nextInt();
		System.out.println("===========결과===========");
		int num = fs + se;
		System.out.println("더하기 결과 : "+ num);
		int num1 = fs - se;
		System.out.println("빼기 결과 :"+ num1);
		int x = fs * se;
		System.out.println("곱하기 결과 :"+ x);
		int z = fs / se;
		System.out.println("나누기 몫 :"+z);
		int y = fs % se;
		System.out.println("나누기 나머지 :"+y);
			
	}
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 길이 입력 :");
		double ga = sc.nextDouble();
		System.out.println("세로 길이 입력 :");
		double se = sc.nextDouble();
		System.out.println("===========결과============");
		double x = ga * se;
		System.out.println("면적 :"+ x);
		double y = 2* (ga + se);
		System.out.println("둘레 :" + y);
	}
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 단어 입력 :");
		String str = sc.nextLine();	
		char ch= str.charAt(0);
		System.out.println("첫번째 문자 :"+ch);
		char ch1 = str.charAt(1);
		System.out.println("두번째 문자 :"+ch1);
		char ch2 = str.charAt(2);
		System.out.println("세번재 문자 :"+ch2);
	}
}	