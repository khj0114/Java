package kh.java.func;
import java.util.Scanner;

public class OperatorTest {
	public void test1() {
		//산술 연산자(+,-,*,/,%)
		//대입연사자(=) a = b; -> b라는 값을 a라는 공간에 대입
		
		//복한대입 연산자 : 산술 연산자와 대입연산자가 합쳐진 형태
		//+=, -=, *=, /=, %=
		//산술연산을 한 결과를 바로 변수에 대입까지 하는 연산자
		int num = 10;
		System.out.println("num :"+num);
		num += 5;	//num = num + 5;
		System.out.println("num :"+num);
		num *=3;	//num = num * 3;
		System.out.println("num :"+num);
		
	}
	public void test2() {
		int num = 10;
		//증감 연산자(++,--) : 단항연산자 -> 변수하나에 사용하는 연산자
		System.out.println("num :"+num);
		num++;//num 변수의 값을 1 증가시킴
		System.out.println("num :"+num);
		++num;//num 변수의 값을 1 증가시킴
		System.out.println("num :"+num);
		--num;//num 변수의 값을 1 감소시킴
		System.out.println("num :"+num);
		--num;//num 변수의 값을 1감소시킴
		System.out.println("num :"+num);
		//증감연산자가 단독으로 사용되는 경우에는 위치가 앞/뒤 상관없이 결과 동일
		//변수++ : 후위연산(증감연산자가 변수 뒤에 위치할때)
		//후위연산 : 인접연산을 먼저 수행한 후 자기 자신을 증가/감소
		//++변수 : 전위연산(증감연산자가 변수 앞에 위치할때)
		//전위연산 : 자기 자신을 증가/감소 한 후 인접연산 수행
		//인접연산이 존재하는 경우 앞/뒤에 따라서 차이가 발생
		int num1 = 10;		
		int num2 = (++num1)+2;		
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
		
		int a =10;
		int b =10;
		int c = (a++) + (++b) + a;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		System.out.println("c :"+c);
		//a :11
		//b :11
		//c :32
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		boolean result1 = num1 < num2;
		System.out.println("num1 < num2 :"+result1);
		
		boolean result2 = num1 > num2;
		System.out.println("num1 > num2 :"+result2);
		
		boolean result3 = num1 <= num2;
		System.out.println("num1 <= num2 :"+result3);
		
		boolean result4 = num1 >= num2;
		System.out.println("num1 >= num2 :"+result4);
		
		boolean result5 = num1 == num2;
		System.out.println("num1 == num2 :"+result5);
		
		boolean result6 = num1 != num2;
		System.out.println("num1 != num2 :"+result6);
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 :");
		int num1 =sc.nextInt();
		
		System.out.print("두번째 정수 입력 :");
		int num2 =sc.nextInt();
		
		System.out.print("세번째 정수 입력 :");
		int num3 =sc.nextInt();
		
		System.out.print("네번쨰 정수 입력 :" );
		int num4 =sc.nextInt();
		
		boolean result1 = num1 < num2;
		boolean result2 = num3 < num4;
		System.out.println("result1 :"+result1);
		System.out.println("result2 :"+result2);
		
		//and &&(그리고), or ||(또는), not !(그러나)
		//&&연산자를 기준으로 양쪽의 논리값이 모두 true이면 true/아니면 false
		boolean and = result1 && result2;
		//||연산자를 기준으로 양쪽의 논리값 중 1개라도 true면 true/둘 다 false면 false
		boolean or = result1 || result2;
		//! 연산자 뒤의 논리값을 반전(true->false / false->true)
		boolean not = !result1;
			
			System.out.println("result1 && result2"+and);
			System.out.println("result1 || result2"+or);
			System.out.println("!result1"+not);			
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 정수를 입력하세요 :");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 :");
		int num2 = sc.nextInt();
		
		//삼황 연산자	논리값(조건식) ? 논리값이 true면 실행되는 코드 : 논리값이 false면 실행되는 코드
		int result = num1>num2?num1:num2;
		System.out.println("result :"+ result);
		
		System.out.println(num1>num2?num1:num2);
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int num = sc.nextInt();
		//입력받은 정수가 10이상 20이하면 "정답" / 아니면 "오답"
		boolean result1 = (10 <=num);
		boolean result2 = (20 >=num);
		boolean result = result1 && result2;
		
		String resultString = result?"정답":"오답";
		System.out.println(resultString);
		
		System.out.println(result?"정답":"오답");
		
		System.out.println(result1 && result2?"정답":"오답");
		
		System.out.println((10 <=num) && (20 <=num)?"정답":"오답");
		
	}
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 :");
		int fs = sc.nextInt();
		System.out.print("두번째 수 입력 :");
		int se = sc.nextInt();
		System.out.println("===========결과==========");
		int num = fs + se;
		System.out.println("두 수를 더한 수 :"+num);
		int num1 = fs - se;
		System.out.println("두 수를 뺀 수 : "+num1 );
		int num2 = fs * se;
		System.out.println("두 수를 곱한 수 :"+num2);
		double num3 = (double)fs / se;
		System.out.printf("두 수를 나눈 수 : %.2f",num3);
	}
	public void test8() {
		Scanner sc = new Scanner(System.in);
		int a =40, b =20;
		a += b;
		System.out.printf("a의 값 : %d , b의 값 : %d \n",a,b);
		a-=b;
		System.out.printf("a의 값 : %d , b의 값 : %d \n",a,b);
		b*=a;
		System.out.printf("a의 값 : %d , b의 값 : %d \n",a,b);
		b/=a;
		System.out.printf("a의 값 : %d , b의 값 : %d \n",a,b);
	}
	public void test9() {
		Scanner sc = new Scanner(System.in);
		int a =10, b = 20, c = 30, d = 40;
		boolean result1, result2;
		result1 = ((a <20 && b > 10) && (c==20 || d != 40));
		result2 = ((a == 10 && b != 2 * 10) ||(c == 30 && d != 40));
		System.out.printf("첫번째 결과값 : %b \n", result1);
		System.out.printf("두번째 결과값 : %b \n", result2);
	}
	public void test10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 :");
		int age = sc.nextInt();
		boolean resualt1 = (20 > age);
		String resualtString = resualt1 ? "미성년자는 입장불가입니다." : "성인입니다. 어서오세요.";
		System.out.println(resualtString);
		//String msg = age>=19?"성인입니다." :"미성년자는 입장불가입니다.";
		//System.out.println(msg);
		//System.out.println(age>=19?"성인입니다.": "미성년자는 입장불가입니다.");
	}
		
}