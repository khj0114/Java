package kh.java.func;

public class GenericEx1 {
	private int data1;
	private String data2;
	public GenericEx1() {
		super();
		
	}
	
	public GenericEx1(int data1, String data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return "GenericEx1 [data1=" + data1 + ", data2=" + data2 + "]";
	}
}	
