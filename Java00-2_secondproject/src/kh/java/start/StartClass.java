package kh.java.start;
//1.실행하고 싶은 메소드가 있는 클래스의 위치를 알려줌
import kh.java.func.TestClass;

public class StartClass {

	public static void main(String[] args) {
		//2.약어설정
		//클래스이름 별명 = new클래스이름();
		TestClass fc = new TestClass();
		//3. 실행
		//약어.메소드이름();
		//fc.test2();
		//fc.methodName();
		
		fc.helloMessage();
	}

}
