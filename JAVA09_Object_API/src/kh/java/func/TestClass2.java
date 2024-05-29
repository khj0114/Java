package kh.java.func;

import java.util.Scanner;

public class TestClass2 {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 :");
		String str1 = sc.next();
		System.out.print("문자열을 입력하세요 :");
		String str2 = sc.next();
		if(str1 == str2) {
			System.out.println("두 문자열이 같습니다.");
		}else {
			System.out.println("두 문자열이 다릅니다.");
		}
	}
	public void test2() {
		String str1 = new String ("aaa");
		String str2 = new String ("aaa");
		if(str1 == str2) {
			System.out.println("두 문자열이 같습니다.");
		}else {
			System.out.println("두 문자열이 다릅니다.");
		}
	}
}
