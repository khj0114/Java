package kh.java.test.function;
import java.util.Scanner;
public class Exmaple {

	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 :");
		int K = sc.nextInt();
		
		System.out.println("영어 점수 입력 :");
		int E = sc.nextInt();
		
		System.out.println("수학 점수 입력 :");
		int M = sc.nextInt();
		
		int sum =(K+E+M);
		double avg = (double)sum/3;
		
		System.out.println("합계 :" +sum);
		System.out.printf("평균 : %.2f\n" ,avg);
		boolean KCheck = K >=40;
		boolean ECheck = E >=40;
		boolean MCheck = M >=40;
		boolean avgCheck = avg >= 60;
		boolean result = KCheck && ECheck && MCheck && avgCheck;
		System.out.println(result?"합격" : "불합격");
	}
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		System.out.println(num%2 != 0 ? "홀수" : "짝수");
		
	}
}