package kh.java.function;

import java.util.Scanner;

public class ForTest {
	public void test1() {
		//안녕하세요 3번 출력
		/*
	      초기값 : 반복문의 횟수를 처리할 변수를 선언 또는 초기화
		  조건식 : 반복문의 수행 여부를 결정하는 조건식(논리데이터가 나와야 함(true/false)) 
		  증감문 : 초기값에서 사용하는 변수를 조작해서 조건식을 이용해서 횟수를 조절하기 위한 증가/감소
		  for(초기값설정;조건식;조건처리를 위한 증감식) {
		    실행코드
		  }
		 */
		for(int i=0; i<3; i++) {
			System.out.println("안녕하세요");
		}
		
	
	}
	public void test2() {
		for(int i=0; i<5; i++) {
			System.out.println("안녕하세요");
		}
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 출력하시겠습니까?");
		int count = sc.nextInt();
		//입력받은 횟수만큼 안녕하세요 출력
		for(int i = 0; i < count; i++) {
			System.out.println("안녕하세요");			
		}
	}
	public void test4() {
		System.out.println("2단 입니다.");
		/*for(int i = 1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",2,i,2*i);
			
		}*/
		
		for(int i=0;i<9;i++) {
			//System.out.printf("%d * %d = %d\n",2,i+1,2*(i+1));
			System.out.println("2 * "+(i+1)+" = "+2*(i+1));
		}
		/*
		System.out.printf("%d * %d = %d\n",2,1,2*1);
		System.out.printf("%d * %d = %d\n",2,2,2*2);
		System.out.printf("%d * %d = %d\n",2,3,2*3);
		System.out.printf("%d * %d = %d\n",2,4,2*4);
		System.out.printf("%d * %d = %d\n",2,5,2*5);
		System.out.printf("%d * %d = %d\n",2,6,2*6);
		System.out.printf("%d * %d = %d\n",2,7,2*7);
		System.out.printf("%d * %d = %d\n",2,8,2*8);
		System.out.printf("%d * %d = %d\n",2,9,2*9);
		*/
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 출력하시겠습니까? :");
		int num = sc.nextInt();
		
		for(int i=0;i<9;i++) {
			System.out.printf("%d * %d= %d\n",num,i+1,num*(i+1));
		}
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		int sum= 0;
		
		for(int i=0; i<5; i++) {
		System.out.print("정수 값을 입력하시오 :");
		int num= sc.nextInt();	
		
		sum += (num);
		//sum = sum + num;
		
		System.out.println("입력한 5개의 정수의 합 :"+sum);
		
		
		
		}	
	}
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력 :");
		int num =sc.nextInt();
	
		System.out.println("두번째 수 입력 :");
		int num1 =sc.nextInt();
		/*int count = num1 - num +1;
		 int sum -0;
		for(int i=num;i<num2+1;i++){ 
		   sum = sum + i;
	 	}
		System.out.println(sum);
		    */
		int sum = 0; 
		for (int i=num; i<=num1;i++) {
		sum +=i;
			System.out.println(num+ "~" +num1+"의 정수의 합 :"+sum);
			
		}
	}
	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 :");
		//1씩 덧셈이 아닌 더 많은 숫자를 덧셈할때 증감식에 +=이것을 넣는다.
		int num =sc.nextInt();
		int sum =0;
		for(int i=0; i<num+1;i+=2) {
			//if(i%2 == 0) {
				sum+= i;	
			//}
		}	
			//sum= sum + i;
		System.out.println("총합은 :"+sum );
			
		}
	
		
	}
		


