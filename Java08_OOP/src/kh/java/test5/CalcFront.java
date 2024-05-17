package kh.java.test5;

import java.util.Scanner;

public class CalcFront {
	public void view() {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[2];
		System.out.print("정수 입력 :");
		arr[0] = sc.nextInt();
		System.out.print("정수 입력 :");
		arr[1] = sc.nextInt();
		Calc calc = new CalcBack();
		int result = calc.sum(arr);
		System.out.println("결과 :"+result);
	}
}
