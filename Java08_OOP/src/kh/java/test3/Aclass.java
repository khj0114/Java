package kh.java.test3;

public class Aclass {
	private int num;
	private String str;
	public Aclass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aclass(int num, String str) {
		super();
		this.num = num;
		this.str = str;
	}
	public int getNum() {
		return num;
	}
	
	public String getStr() {
		return str;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public void test1() {
		System.out.println("나는 Aclass의 test1메소드");
	}
}
