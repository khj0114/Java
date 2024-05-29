package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	private Scanner sc;
	
	public ExceptionTest() {
		super();
		sc = new Scanner(System.in);
	}

	public void test1() {

		try {
			System.out.print("정수를 입력하세요 :");
			int num = sc.nextInt();
			System.out.println("입력한 정수  :"+num);
			System.out.println("두번째 정수를 입력하세요 :");
			int num2 = sc.nextInt();
			int data = num/num2;
			System.out.println(data);
		}catch (InputMismatchException e) {
			System.out.println("에러가 발생하면 이게 보임");
		}
		
	}
	public void test2() {
		try {
			System.out.print("첫번째 정수 입력 :");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 :");
			int num2 = sc.nextInt();
			try {
				System.out.println("결과 :"+(num1/num2));
			}catch (ArithmeticException e) {
				System.out.println("0으로는 나눌 수 업습니다.");
			}		
		}catch(InputMismatchException e) {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	public void test3() {
		try {
			System.out.print("첫번째 정수 입력 :");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 :");
			int num2 = sc.nextInt();
			System.out.println("결과 :"+(num1/num2));
		}catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
		}
			
		}
		
	public void test4() {
		try {
			System.out.print("첫번째 정수 입력 :");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 :");
			int num2 = sc.nextInt();
			System.out.println("결과 :"+(num1/num2));
		}catch (InputMismatchException e) {
			System.out.println("잘못입력하셨습니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 업습니다.");
		}		
	}
	public void test5() {
		try {
			System.out.print("첫번째 정수 입력 :");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 :");
			int num2 = sc.nextInt();
			System.out.println("결과 :"+(num1/num2));
		}catch (InputMismatchException e) {
			System.out.println("잘못입력하셨습니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 업습니다.");
		}finally {		
			System.out.println("try가 문제가 있건, 없든 무조건 동작하는 구문");			
		}
	}
	
	public void test6() {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//에러 원인을 찾는것
			//System.out.println("그런 파일은 없어");
		}
	}
	public void test7() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("test.txt");
		
	}
	public void test8() {
		try {
			test7();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}