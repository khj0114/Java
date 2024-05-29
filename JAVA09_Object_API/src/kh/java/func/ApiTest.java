package kh.java.func;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ApiTest {
	
	public void math() {
		//다른 클래스에 작성된 메소드를 사용하려면?
		//1.객체 생성
		//TestClass3 tc = new TestClass3();
		//2.생성된 객체를 이용해서 메소드 호출
		//tc.test1();
		
		//static 메소드를 쓰는법
		//클래스이름.메소드명();
		
		//Math객체는 모든 메소드가 static으로 만들어져 잇음
		//-> 객체를 만들지 않고 바로 사용
		
		//Math.abs(숫자) : 절대값
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		//올림,버림,반올림
		System.out.println(Math.ceil(10.1));//소수 첫째자리에서 올림
		System.out.println(Math.floor(10.9));//소수 첫째자리에서 버림
		System.out.println(Math.round(10.5));//소수 첫째자리에서 반올림
		//1.3456 -> 소수 2째자리까지 반올림해서 표현 -> 1.35
		//1.3456 -> 134.56 -> 135 -> 1.35
		
		System.out.println(Math.round(1.3456*100)/(double)100);
		//max : 매개변수로 준 2개숫자 중 큰수를 리턴
		System.out.println(Math.max(100,200));
		System.out.println(Math.max(200,100));
		//min : 매개변수로 준 2개숫자 중 작은수를 리턴
		System.out.println(Math.min(200,100));
		
		//random() : 0.0~1.0 사이의 임의의 실수 1개를 리턴
		System.out.println(Math.random());
		
		
	}
	
	public void test1( ) {
		//컴퓨터의 날짜 계산방법 -> 1970년1월 1일 0시부터 현재까지 몇ms가 흘렀는지를 저장하고
		//저장된 데이터를 환산해서 날짜로 표기-> 저장된 데이터 타입이 long
		Date date1 = new Date(); // 객체가 만들어지는 시점의 시스템의 시간을 가져옴
		System.out.println(date1);
		//Date 객체 생성시 생성자의 파라미터로 정수를 주면
		//해당 정수시간만큼 흐른 날짜를 계산해서 Date 객체 생성
		Date date2 = new Date(0);
		System.out.println(date2);
		//하루 지난시간 
		Date date3 = new Date(24*60*60*1000);
		System.out.println(date3);
		
		//SimpleDateFormat : date 타입을 주면 원하는 형식의 문자열로 리턴해주는 객체
		//객체 생성 시 생성자에 원하는 패턴을 문자열로 전달
		//y = 년도, M = 월, d = 일, h=오전시간,H = 오후시간,m = 분, s = 초
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str1 = sdf1.format(date1);
		System.out.println(str1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd-HH:mm:ss");
		String str2 = sdf1.format(date1);
		System.out.println(str2);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss EEE");
		String str3 = sdf3.format(date1);
		System.out.println(str3);
	}
	
	public void test2() {
		//시간을 계산할때 사용하는 객체 
		//Calendar
		//Calendar 객체 생성하는 방법
		//Calendar 생성자의 접근제어지시자가 public 아님
		//대신 getInstance() 메소드를 public static로 생성 0 -> getInstance로 객체를 생성 
		Calendar today = Calendar.getInstance();//객체가 생성되는 순간의 정보가 저장
		//Calendar 객체에서 정보를 가져오는 방법 today.get(알고싶은정보);
		System.out.println(today.get(Calendar.YEAR));//년도
		System.out.println(today.get(Calendar.MONTH)+1);//월(0~11로 제공) -> 보정작업 필요
		System.out.println(today.get(Calendar.DATE));//일
		System.out.println(today.get(Calendar.AM_PM));//AM :0, PM :1
		System.out.println(today.get(Calendar.HOUR));//시간
		System.out.println(today.get(Calendar.MINUTE));// 분
		System.out.println(today.get(Calendar.SECOND));//초
		System.out.println(today.get(Calendar.MILLISECOND));//밀리초
		System.out.println(today.get(Calendar.DAY_OF_WEEK));//요일(1:일요일 ~ 7:토요일)
		////////////////////////////////////////////////////////////////////////////
		System.out.println("------------------------------------------------------");
		Calendar day1 = Calendar.getInstance();
		//캘린터 객체 정보를 변경하는법
		//2024/10/11
		//day1.set(Calendar.MONTH,9);//월욜 10월로 변경(0 ~11월이니깐)
		//day1.set(Calendar.DATE,11);//일욜 변경
				
		day1.set(2024,9,11);//년,월,일 정보를 넣으면 한번에 변환
		
		
		System.out.println(day1.get(Calendar.YEAR));
		System.out.println(day1.get(Calendar.MONTH)+1);
		System.out.println(day1.get(Calendar.DATE));
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));
		System.out.println("-------------------------------");
		Calendar day2 = Calendar.getInstance();
		//1970년 1월 1일부터 day2의 시간까지 몇ms가 흘렀는지를 long 타입으로 리턴
		long time = day2.getTimeInMillis();
		System.out.println("time :"+time);
		long days = time/(1000*60*60*24);
		System.out.println(days/365);
		
		Date date1 = new Date(time+86400000);
		System.out.println(date1);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String str = sdf.format(date1);
		System.out.println(str);
		
	}
	
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=========D-DAY 계산기=========");
		System.out.print("D-DAY [년도] 입력 :" );
		int year = sc.nextInt();	
		
		System.out.print("D-DAY [월] 입력 :" );
		int month = sc.nextInt();
		
		System.out.print("D-DAY [일] 입력 :" );
		int date = sc.nextInt();
		
		Calendar today = Calendar.getInstance();
		long todayMs= today.getTimeInMillis();
		today.set(year, month-1, date);
		long ddayMs = today.getTimeInMillis();	
		long time = ddayMs - todayMs;
				
		Date todayDate = new Date(todayMs);
		Date ddayDate = new Date(ddayMs);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String todayStr = sdf.format(todayDate);
		String ddayStr = sdf.format(ddayDate);
	
		System.out.println("오늘 날짜 :"+todayStr);
		System.out.println("D-Day 날짜 : "+ddayStr);
			long interDay = time/(60*60*24*1000);
		if(time > 0) {
			System.out.println(interDay+"일 남았습니다.");
		}else if(time < 0) {
			System.out.println(Math.abs(interDay)+"일 지났습니다.");
		}else {
			System.out.println("D-Day 입니다.");
		}
	}
	public void wrap() {
		//Wrapper클래스 : 기본자료형을 참조형으로 사용할 수 있도록 포장하는 클래스
		//정수형 변수 선언 후 10대입
		int num1 = 10;
		System.out.println(num1);
		//Wrapper클래스를 사용 (int -> Integer)
		Integer num2 = new Integer(10);//기본형을 참조형으로 포장 -> boxing
		int num3 = num2.intValue();//wrapper로 감싸진 데이터를 다시 기본형으로 변환 ->unboxing
		System.out.println(num3);
		
		double d1 = 3.14;
		//wrapper 클래스 사용 (double -> Double)
		Double d2 = new Double(3.14);//boxing
		double d3 = d2.doubleValue();//unboxing
		
		//auto-boxing, auto-unboxing
		int num11 = 100;
		Integer num12 = 100;//auto-boxing
		int num13 = num12;//auto-unboxing
		
		double d11 = 3.14;
		Double d12 = 3.14;//auto-boxing
		double d13 = d12;//auto-unboxing
	}
	public void wrap2() {
		//wrapper 클래스 사용 예시 기본형 <-> 문자열 데이터변환
		//1) 문자열 -> 기본자료형
		String str1 = "100";
		System.out.println(str1);
		//변경하고싶은 기본자료형의 wrapper 클래스를 사용
		int num1 = Integer.parseInt(str1);
		System.out.println(num1);
		System.out.println(num1+1);
		
		String str2 = "3.14";
		double num2 = Double.parseDouble(str2);
		System.out.println(num2+1);
		/*정상적으로 변환이 불가능한 값은 변환하려고 할때 에러가 발생
		String str3 = "100";
		int num3 = Integer.parseInt(str3);
		System.out.println(num3);
		*/
		//문자열 -> 문자
		String str4 = "ABCD";
		char ch = str4.charAt(0);
		
		//기본형 -> 문자열로 변환
		int num3 = 100;
		//2-1-1) Integer 사용법
		String str5 = Integer.valueOf(num3).toString();
		System.out.println(str5+1);
		
		//2-1-2) String 클래스 사용법
		String str55 = String.valueOf(num3);
		System.out.println(str55+1);
		
		double num4 = 3.14;
		//2-2-1) Double 사용법
		String str6 = Double.valueOf(num4).toString();
		System.out.println(str6+1);
		
		//2-2-2) String 클래스 사용법
		String str66 = String.valueOf(num4);
		System.out.println(str66+1);
		
	}
}