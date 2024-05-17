package kh.java.test4;


//testMethod2()는 추상메소드 -> TestCalss1은 추상메소드를 포함하고있는 클래스 -> 추상클래스
public abstract class TestClass1 {
	private int num;

	public TestClass1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestClass1(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	//미완성된 메소드 -> 코드실행부가({}) 없는 메소드 -> 추상 메소드
	public abstract void testMethod2();
}
