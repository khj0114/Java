package kh.java.func;

public class TestClass {
	public void test1() {
		System.out.println(1);//정수 1 출력
		System.out.println(1.0);//실수 1 출력
		System.out.println('1');//문자 1 출력
		System.out.println("1");//문자열 1 출력
	}
	public void test2() {
		System.out.println(1+1);// -> 2 /
		System.out.println(1.0+1.0);// -> 2.0 /
		System.out.println('1'+'1');// -> 98
		System.out.println("1"+"1");// ->11
		
		System.out.println(1-1);//0
		System.out.println(1.0-1.0);//0.0
		System.out.println('1'-'1');//0
		//System.out.println("1"-"1");//성립불가
		//문자열은 자바에서 만들어 준 특수한 형태의 데이터 -> 더하기말고는 연산이 불가능
		}
	public void test3() {
		//자바는 서로 다른 자료형끼리 연산하는것이 불가능
		//만약 서로 다른 자료형을 연산하는경우 -> 범위가 큰 자료형으로 변환해서 한번에 연산
		//정수 + 실수 => 실수 + 실수 => 연산
		//1+1.1 -> 1.0+1.1 -> 2.1
		System.out.println(1+1.1);
		//정수 + 문자 => 정수 + 정수 => 연산
		//1 + '1' => 1+49 => 50
		System.out.println(1+'1');
		//실수 + 문자 => 실수 + 정수 => 실수 + 실수 => 연산
		//1.0 + '1' =>1.0 + 49 => 1.0 + 49.0 => 50.0
		System.out.println(1.0+'1');
	}
	public void test4() {
		//문자열은 다른 자료형과도 +연산만 가능
		//서로다른 자료형 변환 시 문자열은 우선순위가 가장 높음 -> 다른자료형을 문자열로 변환해서 더함
		//문자열 + 정수 => 문자열 + 문자열 => 연산
		//"1+1 => "1"+"1" => "11"
		System.out.println("1"+1);
		//1.1+"1" => "1"+"1"1 = 1.11
		System.out.println(1.1+"1");
		// '1'+"1" => "1"+"1" => "11"
		System.out.println('1'+"1");
		
	}
}
