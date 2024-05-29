package kh.java.run;

import kh.java.func.Animal;
import kh.java.func.AnimalMgr1;
import kh.java.func.AnimalMgr2;
import kh.java.func.AnimalMgr3;
import kh.java.func.GenericEx1;
import kh.java.func.GenericEx3;
import kh.java.func.GenericEx4;
import kh.java.func.Rabbit;
import kh.java.func.Tiger;

public class Start {

	public static void main(String[] args) {
		Tiger t1 = new Tiger(200);
		Rabbit r1 = new Rabbit(100);
		
		AnimalMgr3<Tiger> am1 = new AnimalMgr3<Tiger>(t1);
		AnimalMgr3<Rabbit> am2 = new AnimalMgr3<Rabbit>(r1);
		
		
		Tiger t2 = am1.getData();
		t2.getHp();
		t2.tigerFunction();
		
		Rabbit r2 =am2.getData();
		r2.getHp();
		r2.rabbitFunction();
		
		/*
		Tiger t1 = new Tiger(200);
		Rabbit r1 = new Rabbit(100);
		
		AnimalMgr2 am1 = new AnimalMgr2(t1);
		AnimalMgr2 am2 = new AnimalMgr2(r1);
		
		Animal a1 = am1.getData();
		a1.getHp();
		Tiger t2 = (Tiger)a1;
		t2.tigerFunction();
		
		Animal a2 = am2.getData();
		a2.getHp();		
		Rabbit r2 = (Rabbit)a2;
		r2.rabbitFunction();
		
		
		
		Tiger t1 = new Tiger(200);
		Rabbit r1 = new Rabbit(100);
		
		AnimalMgr1 am1 = new AnimalMgr1(t1);
		AnimalMgr1 am2 = new AnimalMgr1(r1); 
		
		
		Object o1 =am1.getData();
		Tiger t2 = (Tiger)o1;//업캐스팅이 된상태이므로 사용 불가능하니 다운캐스팅을 해줘야한다.
		int hp1 = t2.getHp();
		t2.tigerFunction();
		
		Object o2 = am2.getData();
		Rabbit r2 = (Rabbit)o2;
		r2.getHp();
		r2.rabbitFunction();
		*/
		/*
		GenericEx1 ge1 = new GenericEx1();
		ge1.setData1(100);
	
		GenericEx3<String> ge3 = new GenericEx3<String>();
		ge3.setData1("data");
		String str1 = ge3.getData1();
		//제네릭으로 지정되는 자료형은 반드시 참조형
		GenericEx3<Integer> ge4 = new GenericEx3<Integer>();
		ge4.setData1(100);
		int num1 = ge4.getData1();
		
		GenericEx4<Double,String> ge5  = new GenericEx4<Double,String>();
		*/
	}

}
