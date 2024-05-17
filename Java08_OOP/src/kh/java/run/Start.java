package kh.java.run;

import kh.java.test2.NewTV;
import kh.java.test3.SamsungTV;
import kh.java.test3.LgTV;

import kh.java.test4.TestClass1;
import kh.java.test4.TestClass2;
import kh.java.test5.CalcFront;
import kh.java.test5.TestInterface;
import kh.java.test5.TestInterfaceimpl;
//import kh.java.test2.Radio;
//import kh.java.test2.TV;
//import kh.java.test2.NewTV;
public class Start {

	public static void main(String[] args) {
		CalcFront cf = new CalcFront();
		cf.view();
		
		
		
		
		
	//TestClass1 tc = new TestClass1();// 추상클래스는 객체를 생성할수 없다
	//TestClass2 tc2 = new TestClass2();//추상클래스를 상속한 클래스는 완성된 클래스로 객체생성이 가능
	//TestClass1 tc3 = new TestClass2();//추상클래스는 객체생성은 불가능하지만 부모타입 자료형으로는 사용이 가능
	//tc3.testMethod2();
	//TestInterfaceimpl til = new TestInterfaceimpl();
	//TestInterface ti = new TestInterface();//인터페이스는 객체를 생성할 수 없음
	//TestInterface ti2 = new TestInterfaceimpl();//인터페이스는 객체생성은 불가능하지만 부모타입 자료형으로는 사용가능
	//ti2.test1();
	//ti2.test2();
	
		//SamsungTV tv5 = (SamsungTV)tv1;//다운캐스팅 명시 필수로 사용
		//tv5. samsungFunc();
		
		//LgTV tv6 = (LgTV)tv2;
		//tv6.lgFunc();
		//tv1은 SamsungTV 객체를 NewTV타입으로 저장한 변수
		//원래는 SamsungTV 객체 -> NewTV인척하고있음
		//NewTV는 SamsungTV,LgTV두가지 다 기능성이 있어서
	//LgTV로 변환햇을때 에러는 없음 -> 실행하면 실제로는 SamsungTV LgTV는 서로 변환 불가능
		//LgTV tv7 = (LgTV)tv1;
		//tv7.lgFunc();
		//다형성이 적용되면 부모타입에 존재하는 멤버들만 사용이 가능
		//tv1.samsungFunc();
		//tv2.lgFunc();
		
		
		//다형성이 적용된 상태에서 자식객체만 가지고있는 고유의 기능을 사용하고 싶으면?
		//형병환
	
		
		
		
		//자식타입 변수에 부모타입 객체를 저장하는것은 불가능
		//SamsungTV tv4 = new SamsungTV();
		//SamsungTV tv5 = new NewTV();
		//형제 관계에서도 다형성은 적용할 수 없음
	}

}


