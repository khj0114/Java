package kh.java.func;
//1.import
import java.util.Scanner;
public class ScanTest {

	public void scanTest1() {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("정수를 입력하세요 : ");
		//sc.nextInt() : 사용자가 콘솔에 숫자를 입력하기를 기다리다가
		//					입력하면 입력받은 숫자를 정수타입으로 가져옴
		int num = sc.nextInt();
		System.out.println("입력받은 숫자는 : "+num);
		System.out.print("실수를 입력 하세요 :");
		//sc.nextInt() : 사용자가 콘솔에 숫자를 입력하기를 기다리다가
		//					입력하면 입력받은 숫자를 실수타입으로 가져옴
		double dNum = sc.nextDouble();
		System.out.println("입력받은 실수는 :"+dNum);
		*/
		System.out.println("문자열을 입력하세요 : ");
		//sc.next() : 사용자가 콘솔에 문자열을 입력하기를 기다리다가
		//				입력하면 입력받은 문자열을 문자열 타입으로 가져옴(띄어쓰기 불가능)
		//sc.nextLine() : 사용자가 콘솔에 문자열을 입력하기를 기다리다가
		//					입력하면 입력받은 문자열을 문자열 타입으로 가져옴(띄어쓰기 가능)
		String str1 = sc.nextLine();
		System.out.println("입력받은 문자열은 : "+str1);
	}
	public void scanTest2() {
		Scanner sc = new Scanner(System.in);
		//이름,나이,주소를 입력받아서 출력
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("제 이름은" +name);
		
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("제 나이는" +age);
		sc.nextLine();
		
		System.out.println("주소를 입력하세요 : ");
		String address = sc.nextLine();
		System.out.println("저의 주소는" +address);
		
		
	}
	public void scanTest3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주소 입력 : ");
		String address = sc.nextLine();
		System.out.println("주소 : +address");
		System.out.println("주소 입력2 :");
		String address2 = sc.nextLine();
		
	}
	public void scanTest4() {
		Scanner sc = new Scanner(System.in);
		//Scanner에도 문자타입을 직접 입력받는 경우는 없음
		//문자 -> 문자열을 받고 -> 문자열을 문자로 추출
		System.out.println("문자를 입력하세요 :");
		String str = sc.next();
		char ch= str .charAt(0);
		System.out.println("ch : "+ch);
		
		System.out.println("문자를 입력하세요 : ");
		char ch2 = sc.next().charAt(0);
		System.out.println("ch : "+ ch2);
		
		/*사용자의 입력을 기다리다가 사용자가 입력하면 입력한 데이터를
		 * sc.nextlnt() :정수로 가져옴
		 * sc.nextDouble() :실수로 가져옴
		 * sc.next() :문자열로 가져옴(띄어쓰기 불가능)
		 * sc.nextLine() :문자열로 가져옴(띄어쓰기 가능)
		 * 문자타입은 따로 입력받는 기능이 없음
		 * ->문자열로 입력받아서 필요한 문자를 추출
		  문자열.charAt(글자번호)
		 */
		 */
	}
	public void scanTest5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println(name);
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println(age);
		sc.nextLine();
		System.out.println("주소를 입력하세요 :");
		String address = sc.nextLine();
		System.out.println(address);
		
		System.out.println("키를 입력하세요 :");
		double height = sc. nextDouble();
		//int intHeight = (int)helght;
		System.out.printf("%.0f", height);
		System.out.println();
		
		System.out.println("몸무게를 입력하세요 :");
		double weight = sc.nextDouble();
		System.out.printf("%.1f", weight);
		System.out.println();
		
		System.out.println("성별을 입력하세요 :");
		String str = sc.next();
		char gender = str.charAt(0);
		System.out.println(gender);
										
	}
	public void scanTest6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 :");
		int K = sc.nextInt();		
		
		System.out.print("수학점수 입력 :");
		int M = sc.nextInt();
		
		System.out.print("영어점수 입력 :");
		int E = sc.nextInt();
		
		int sum = K + M + E;
		
		double avg = (double)sum/3;
		System.out.printf("당신 성적의 총 합은 %d점이고 평균은 %.2f 입니다.",sum,avg);
	}
	
}
