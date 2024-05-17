package kh.java.test3;

public class Bclass extends Aclass {
	private int data;
	public Bclass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bclass(int num, String str) {
		super(num, str);
		// TODO Auto-generated constructor stub
	}
	//생성자는 받아서 올수 없다.
	//super 내 상속 클래스에 생성자

	public Bclass(int data) {
		super();
		this.data = data;
	}
	public Bclass(int num, String str, int data) {
		super(num,str);
		this.data = data;
		//부모 클래스의 super는 자식변수보다 먼저 생성 될수 없다.
	}
	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}
	
	//@ : annotation : 자바 컴파일러에게 알려주는 주석문
	/*오버라이딩 조건
	 * 메소드의 이름이 동일해야 한다
	 * 매개변수의 개수와 타입이 동일
	 * 리턴 타입이 동일
	 * private 메소드의 오버라이딩이 불가능하다
	*/
	@Override
	public void test1() {
		System.out.println("나는 Bclass의 test1메소드");
	}
	
	
	
}
