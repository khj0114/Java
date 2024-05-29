package kh.java.func;

public class TestClass1 implements Cloneable{
	private String str;
	private int num;
	
	public TestClass1() {
		super();
	
	}
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "TestClass1 [str=" + str + ", num=" + num + "]";
	}
	public TestClass1(String str, int num) {
		super();
		this.str = str;
		this.num = num;
	}

	public void test1() {
		System.out.println("hi");
		
	}
	//TestClass1객체를 복제하는 기능을 구현
	//1. Cloneable Interface 상속
	//2.clone 메소드 오버라이딩
	@Override
	public Object clone() {
		try {
			//부모의 clone 메소드를 호출하여 리턴
			//clone 메소드의 소스코드는 확인할 수 없음
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
