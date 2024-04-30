package kh.java.function;

import java.util.Scanner;

public class IfTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		//Scanner 컨트롤 쉬프트 영어O
		System.out.println("정수 10을 입력하세요 :");
		int num = sc.nextInt();
		/*
		 if(논리형데이터){
		  	논리형데이터가 true이면 실행될 코드 (false이면 실행되지 않음)
		 }
		 */
		boolean result = (num == 10);
		if(result) {
			System.out.println("참 잘했어요!");
		}	
			if(num == 10) {
				System.out.println("참 잘했어요@@");
		
		}
		System.out.println("끝!");
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==========숫자 구별 프로그램=============");
		System.out.print("임의의 정수를 입력 하세요 :");
		int num = sc.nextInt();
		if(num > 0) {
			
			System.out.println("당신이 입력한 수" +num + "은(는) 양수입니다.");
		}
		
		if(num == 0) {
			System.out.println("당신이 입력한 수 " +num +"은(는)" +num + "입니다." );
		}
		
		if(num < 0) {
			System.out.println("당신이 입력한 수 " +num +"은(는) 음수입니다.");
		}											
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========두수 비교 프로그램=============");
		System.out.print("첫번째 정수를 입력 하세요 :");
		int num =sc.nextInt();
		System.out.print("두번째 정수를 입력 하세요 :");
		int num1 =sc.nextInt();
		if(num < num1) {
			System.out.println(num + "<" + num1);
			System.out.println("두번째 수가 더 큽니다.");
		}
		if(num == num1) {
			System.out.println(num + "==" + num1);
			System.out.println("두 수가 같습니다.");
			
		}
		if(num > num1) {
			System.out.println(num + ">" + num1);
			System.out.println("첫번째 수가 더 큽니다.");
		}
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======계산기 프로그램=======");
		System.out.println("연산자를 입력하세요 (+,-,*,/) :");
		char oper =sc.next().charAt(0);
		
		System.out.print("첫번째 정수를 입력 하세요 :");
		int num1 =sc.nextInt();
		
		System.out.print("두번째 정수를 입력 하세요 :");
		int num2 =sc.nextInt();
		
		//int sum = num1 + num2;
		//int sub = num1 - num2;
		//int mul = num1 * num2;
		//double div = (double)num1/num2;
		//기본자료형: 공간에값을 직접 대입
		//참조자료형: 주소값을 대입
		//equals
		if(oper == '+') {
			int sum = num1 + num2;
			System.out.printf("%d+%d=%d" ,num1,oper,num2,sum);
		}
		if(oper == '-') {
			int sub = num1 - num2;
			System.out.printf("%d-%d=%d" ,num1,num2,sub);
		}
		if(oper == '*') {
			int mul = num1 * num2;
			System.out.printf("%d*%d=%d" ,num1,num2,mul);
		}
		if(oper =='/') {
			double div = (double)num1/num2;
			System.out.printf("%d/%d=%d",num1,num2,div);
		}
		
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int num = sc.nextInt();
		//입력받은 정수가 홀수인지/짝수인지 구분하는 프로그램을 제작
		//홀수/짝수 구분하는 기준 -> 입력받은 숫자를 2로 나눴을때 나머지가 0인지(짝수) 1인지 (홀수)로 구분
		int data;
		
		if(num%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		/*
		if(num%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		if(num%2 == 0) {
			System.out.println("짝수");
		}
		if(num%2 == 1) {
			System.out.println("홀수");
		}
		*/
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======놀이공원 프로그램=======");
		
		System.out.print("입장하실 총 인원은 몇명입니까? :");
		int people = sc.nextInt();
							
		System.out.print("어른은 몇명입니까? (1인당 15000원) :");
		int p = sc.nextInt();
		
		System.out.print("아이는 몇명입니까? (1인당 5000원) :");
		int k = sc.nextInt();
		int sum = p+k;
		if(sum == people) {
		System.out.println("지불하실 총 금액은 "+ (p*15000 + k*5000) +"원 입니다." );
		}
		else {
		System.out.println("인원수가 맞지 않습니다.");
		}
		/*if(p + k == people) {
		int sum =p*15000 + k*5000;
		System.out.println("지불하실 총 금액은" +sum+"원 입니다."	
		}else {
		System.out.println("인원수가 맞지 않습니다.")
		*/
}
		public void test7() {
			Scanner sc = new Scanner(System.in);
			
			int count = 0;
			System.out.println("=======퀴즈 프로그램========");
			
			System.out.println("첫번째 퀴즈");
			System.out.println("사과는 영어로 무엇일까요(1.apple, 2.스티브 잡스)? :");
			int a = sc.nextInt();
			if(a == 1) {
				count ++;
				System.out.println("정답 !!!");	
			} else {
				System.out.println("땡 !!!");
			}
			
			System.out.println("두번째 퀴즈");
			System.out.println("바나나는 길어 길으면 기차 기차는(1.비싸,2.빨라)? :");
			int b = sc.nextInt();
			if(b ==2) {
				count++;
				System.out.println("정답!!!");
			}else {
				System.out.println("땡!!!");
			}
			//System.out.println("총" +count+"문제를 맞췄습니다.");
			
			if(count == 0) {
				System.out.println("총 0문제를 맞췄습니다.");
			}else if(count == 1) {
				System.out.println("총 1문제를 맞췄습니다.");
			}else {
				System.out.println("총 2문제를 맞췄습니다.");
			}
			/*if(a == 1 && b == 2) || (a == 1 && b == 2)){
				//System.out.println("총 1문제를 맞췄습니다.");
			}*/
			
			
		}
		public void test8() {
			Scanner sc = new Scanner(System.in);
			System.out.println("=======심리테스트=======");
			
			System.out.print("당신은 술을 좋아하십니까(1.yes, 2.no) ?:");
			int s = sc.nextInt();
						
			if(s == 1) {
				System.out.print("당신은 담배를 피웁니까(1.yes,2.no) ? :");
				int m = sc.nextInt();
				if (m == 1) {
					System.out.println("담배는 건강에 좋지 않습니다.");
				}else {
					System.out.println("술은 간에 좋지 않습니다.");
				}
			}else {
			System.out.print("당신은 이성친구가 있습니까(1.yes,2.no) ? :");
			int g = sc.nextInt();
			if (g == 1) {
				System.out.println("올..ㅋ");
			}else {
				System.out.println("힘내요ㅠㅠ");
			}
		}
	}
	public void test9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int num = sc.nextInt();
		if(num > 1000) {
			System.out.println("1000 보다 큰 수 입니다");
		} else if(num > 100) {
			System.out.println("100 보다 큰 수 입니다.");
		} else if(num > 10) {
			System.out.println("10 보다 큰 수 입니다.");
		} else {
			//위 else if조건에 해당되는게 없으면 그 외 나머지
			System.out.println("10 이하의 수 입니다.");
		}
		
		
		
	}
	public void test10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========대/소문자로 변환 프로그램=========");
		System.out.print("문자입력 :");
		char c = sc.next().charAt(0);
		int chInt = c;
		System.out.println("=====결과======");
		//c += 32; 좀더 간단히 사용할수 있다
		//c -= 32;
		//c^ = 32; xor 연산
		if(chInt >=97 && chInt <=122) {
			//입력받아서 저장된 숫자에 32를빼서 변수에 저장
			System.out.println("소문자를 입력 하였습니다.");
			System.out.println("대문자로 변환 : " + (char)(c -32));
		} else if(chInt >=65 && chInt <=90) {			
			System.out.println("대문자를 입력 하셨습니다.");
			System.out.println("소문자로 변환 :" +(char)(c +32));
		} else {
			System.out.println("잘못입력하셨습니다. 영문자를 입력해주세요.");
		}
			
				
								
	}
	//1.3의 배수이면서 4의 배수인경우
	//2.3의 배수에만 해당하는경우
	//3.4의 배수에만 해당하는경우
	//4.3의 배수도,4의 배수도 아닌경우
	//5.0은 어떤수의 배수도 아님
	public void test11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num =sc.nextInt();
		
		System.out.print("=====결과=====");
		if (num ==0 || (num%3 ==0 && num%4 ==0)) {
			System.out.println("["+num+"]은 어떤수의 배수도 아닙니다.");
		}else if(num%3 ==0 && num%4 ==0) {
			System.out.println(num +"은(는) 3의 배수면서 4의 배수입니다.");	
		}else if(num%3 ==0);{
			System.out.println("["+num+"]은(는) 3의 배수입니다.");
		} if(num%4 ==0); {
			System.out.println("["+num+"]은 4의 배수입니다."); 
		
		
		}
	}
}
	




