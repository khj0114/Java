package kh.java.function;

import java.util.Scanner;

public class SwitchTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3사이의 정수를 입력하세요 :");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("1111111111111");
			break;
		case 2:
			System.out.println("22222222222222");
			break;
		case 3:
			System.out.println("333333333333");
			break;
		default :
			System.out.println("???????????");
		}
		/* 숫자의범위가 겹치지 않는다면 순서가 바뀌어도 상관이 없다
		if(num == 1) {
			System.out.println("11111111111");
		}else if (num ==2) {
			System.out.println("222222222");
		}else if (num ==3) {
			System.out.println("333333333");
		}else {
			System.out.println("?????????");
		}*/
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요 :");
		char ch = sc.next().charAt(0);
		//아스키코드표를 case에 사용해도 된다 
		switch(ch) {
		case 'a':
			System.out.println("aaaaaa");
			break;
		case 'b':
		System.out.println("bbbbbbbb");
			break;
		case 'c':
			System.out.println("cccccccc");
			break;
		}
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 :");
		String str = sc.next();
		switch(str) {
		case "aa" :
			System.out.println("aaaaaa");
			break;
		case "bb" :
			System.out.println("bbbbbb");
			break;
		case "cc" :
			System.out.println("cccccc");
			break;
		}
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("일수를 알고싶은 달을 입력하세요 :");
		int num = sc.nextInt();
		
		switch(num) {
		//case 1,3,5,7,8,10,12 :
		//case 4,6,9,11 :
		case  1:
		case  3:
		case  5:
		case  7:
		case  8:
		case 10:
		case 12:
			System.out.println(num +"월달은 31일까지 있습니다.");
			break;
		case  2 :
			System.out.println(num +"월달은 29일까지 있습니다.");
			break;
		case 4: 
		case 6:
		case 9:
		case 11:
			System.out.println(num +"월달은 30일까지 있습니다.");
			break;
		}
	}
}
