package kh.java.test1;
import java.util.Scanner;
public class MethodTest1 {
	public void test1() {
		System.out.println("메소드 테스트111");
	}
	
	
	public void test2() {
		System.out.println("메소드 테스트222");
		//같은 클래스 내부의 다른 메소드를 호출하는 방법
		test1();//메소드명();으로 호출
		int num1 = test3();
		System.out.println(num1);
		int num2 = test4();
		System.out.println(num2);
		test5();
	}
	
	//반환자료형을 선언한 경우에는 해당 타입의 데이터를 반드시 되돌주는 코드를 작성해야함
	//데이터를 되돌려주는 코드를 작성하지 않으면 에러가 발생
	//데이터를 되돌려주는 코드 -> return 데이터;
	public int test3() {
		System.out.println("이건 테스트3 메소드");
		System.out.println("내부에서 어던 코드를 작성해도 상관은 없으나");
		System.out.println("반드시 반환형에 해당하는 데이터를 되돌려줘야함");
		int num = 200;
		return num;//return은 해당데이터를 되돌려주면서 그 즉시 메소드를 종료
		//System.out.println("리턴이후코드");
		//리턴은 즉시 메소드를 종료하기 때문에 이후코드는 dead code
	}
	public int test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1을 입력하세요 : ");
		int data = sc.nextInt();
		if(data == 1) {
			return 10;
		}
		return 9;		
	}
	//모든 메소드는 반환형과 상관없이 반드시 return코드가 존재해야함
	//반환형이 void인경우 return 생략 가능
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 10을 입력하세요 : ");
		int data = sc.nextInt();
		if(data == 10) {
			return;
		}
			System.out.println("10 입력 하라니까요?????");		
		return;
	}
	public String test6(int data) {
		if(data == 1000) {
			return "커피";
		}else {
			return "콜라";
		}
	}
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("돈 얼마 줄까?");
		int money = sc.nextInt();
		String str = test6(money);
		System.out.println(str);		
	}
	public void test8() {
			System.out.println("test8메소드");
			test9(1,"hi");//메소드의 매개변수는 이름이 중요한게 아니라 자료형,순서가 중요
			int num = 100;
			String data = "문자열";
			test9(num,data);
	}
	
	
	public void test9(int num, String data) {
		System.out.println("num :" +num);
		System.out.println("data :"+data);
	}
	public void test10() {
		int num1 = 100;
		int num2 = 200;
		test11(num2,num1);
		
	}
	public void test11(int num1, int num2) {
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
		
	}
	public void test12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 :");
		int num2 = sc.nextInt();
		
		int sum = sum(num1,num2);
		
		System.out.println("두 수의 합은 :" +sum);
		
		System.out.print("세번째 정수 입력 :");
		int num3 = sc.nextInt();
		System.out.print("네번째 정수 입력 :");
		int num4 = sc.nextInt();
		sum2(num3,num4);
	
	}
	//메소드가 하나의 기능만 담당
	//메소드가 하나의 기능으로 만들어야 활용도가 더 좋다.
	/**
	 * @author user
	 * @data 2024 05 08
	 * version 1.2
	 * @param su1 합쳐질 수 1
	 * @param su2 합쳐질 수 2
	 * @return 매개변수로 받은 숫자 2개를 합친 값
	 */
	public int sum(int su1,int su2) {
		int data = su1+su2;//이건 BigData와 AI를 이용한 아주 어렵고 복잡한 코드(약 10000줄 정도의 코드)
		return data;		
	}
	/** 
	 * 
	 * @param su1
	 * @param su2
	 */
	
	public void sum2(int su1,int su2) {
		int data = su1+su2;
		System.out.println("두 수의 합은 :"+data); 
	}
	public void test13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("세번째 정수 입력 : ");
		int num3 = sc.nextInt();
		int result1 = add(num1,num2);
		int result2 = add(num1,num2,num3);
		
		add(num1,num2);
	}
	//숫자를 매개변수로 받아서 합친 결과를 리턴하는 메소드
	//메소드 오버로딩 조건
	//1.이름이 같아야함
	//2. 매개변수 언언부가 달라야한다(매개변수 타입 ,개수 ,순서가 달라야한다)
	
	public int add(int su1,int su2) {
		int data = su1 + su2;
		return data;
	}
	public String add(int num1,String num2) {
		String data = num1 + num2;
		return data;
	}
	
	public int add(int su1, int su2, int su3) {
		int data = su1+ su2+ su3;
		return data;
	}
	
}
