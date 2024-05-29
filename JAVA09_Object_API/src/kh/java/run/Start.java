package kh.java.run;
import kh.java.func.ApiTest;
import kh.java.func.StringTest;
import kh.java.func.TestClass1;
import kh.java.func.TestClass2;
import kh.java.func.TestClass3;
public class Start {

	public static void main(String[] args) {	
		//StringTest st = new StringTest();
		//st.exam1();
		
		ApiTest AT = new ApiTest();
		AT.wrap2();
			//equals
		/*
			TestClass2 tc = new TestClass2();
			tc.test2();
			TestClass1 tc1 = new TestClass1();
			TestClass1 tc2 = (TestClass1)tc1.clone();
			
			String str1 = "Hello";
			String str2 = str1.toLowerCase();
			System.out.println(str2);
			String str3 = str1.toUpperCase();
			System.out.println(str3);
			System.out.println(str1);
			String str4 = "1,2,3,4";
			String[] arr = str4.split(",");
			for(int i=0; i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
			TestClass1 tc1 = new TestClass1();
			TestClass1 tc2 = new TestClass1();
			TestClass1 tc3 = tc1;
			//tc1과 tc2는 같은 자료이지만 독립적인다. 
			
			//:(클론)void 다음 있는건 리턴타입
			//괄호안에 있는건 매개변수
			//- 나머지 상속하는 클래스이다. object가 사용하는 메소드 사용할수 있다.
			//적어도 이정도는 있어야해 
			System.out.println(tc1.hashCode());
			System.out.println(tc2.hashCode());
			System.out.println(tc3.hashCode());
			
			System.out.println(tc1.toString());
			//객체의 아무메소드도 사용하지않고 출력하면 자동으로 toString메소드를 호출
			System.out.println(tc1);
			*/
			
		}
	}


