package kh.java.function;

import java.util.Scanner;

public class WhileTest {
	public void test1() {
		/*조건식이 true이면 실행코드를 반복해서 수행
		 한번실행되면 다시 실행하기전에 조건식을 1번씩 다시검사
		 while(조건식){
		 실행코드
		} */
		 int i =0;
		 while(i<3) {
			System.out.println("안녕하세요");
			i++;
		 }
		 //정해진 숫자한에서는 for문
		 //while문은 반복
		/* for(int i=0; i<3 ;i++) {
			System.out.println("안녕하세요");
			*/
		}
	public void test2() {
		int i =0;
		while(i<5) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 출력하시겠습니까? ");
		int num =sc.nextInt();
		System.out.println("["+num+"단]입니다.");
		int i =0;
		while(i<10) {
			System.out.printf("%d *%d = %d \n",num,i,num*i);
			i++;
		}
		}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		int i=0;
		int sum=0;
		
		while(i<5) {
		System.out.println("정수 값을 입력하시오 :");
		int num =sc.nextInt();
		i++;
		sum += num;
		System.out.println("입력한 5개의 정수의 합 :"+sum);
		
		}
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력 :");
		int num =sc.nextInt();
		int i =num;
		System.out.println("두번째 수 입력 :");
		int num1 =sc.nextInt();
		
		int sum = 0;
		
		while(i <=num1) {
		sum += i;
			i++;
		}
		System.out.printf("%d~%d의 정수의 합 :%d",num,num1,sum);
		}
	
		
}


