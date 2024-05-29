package kh.java.func;

import java.util.Random;
import java.util.StringTokenizer;

public class StringTest {
	public void test1() {
		//String 클래스에서 자주 사용하는 메소드
		String str1 = "AbcdEfg";
		//toUpperCase(): 문자열을 모두 대문자로 변환해서 리턴(원본문자열은 영향 없음)
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		//toLowerCase(): 문자열을 모두 소문자로 변환해서 리턴(원본문자열은 영향 없음)
		System.out.println(str1.toLowerCase());
		System.out.println(str1);
		String str2 = "한글aAbExs";
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
		
		String str3 = "abcdabcd";
		//replace(문자열1,문자열2) :문자열1을 찾아서 문자열2로 대체
		System.out.println(str3.replace("a","A"));
		System.out.println(str3);
		
		//indexOf(문자열) : 매개변수로 준 문자열 위치를 정수로 리턴

		System.out.println(str3.indexOf("b"));
		//lastIndexOf(문자열) 
		System.out.println(str3.lastIndexOf("b"));
		
		//split(구분자) : 문자열을 구분자 기준으로 잘라서 문자열 배열로 리턴
		String str4 = "이윤수/서울/강사/kh";
		String[] arr = str4.split("/");
		System.out.println(arr[1]);
	}	
	
	public void test2() {
		//외부클래스 사용시 import 생략 가능 조건
		//1.같은 패키지 내부에 있는 클래스끼리는 
		//2.java.lang. 패키지에 있는 클래스들은 import 없이 사용가능
		StringBuilder sb = new StringBuilder();		//""
		System.out.println("문자열 길이 : "+sb.length());
		System.out.println(sb);
		//append(param) : 현재 저장된 문자열에 매개변수로 전달한 값을 뒤로 추가 
		sb.append("test");
		System.out.println(sb);
		System.out.println("문자열 길이 :"+sb.length());
		sb.append(1);
		System.out.println(sb);
		sb.append(" 안녕");
		System.out.println(sb);
		System.out.println("문자열 길이 : "+sb.length());
		sb.append(" test");
		System.out.println(sb);
		System.out.println("문자열 길이 : "+sb.length());
		//insert(정수,데이터) : 첫번째 매개변수 위치에 두번째 데이터를 삽입
		sb.insert(3, "data");
		System.out.println(sb);
		//replace(정수,정수,데이터) : 첫번째 매개변수부터 두번째 매개변수 앞까지 데이터를 세번째 매개변수로 변환
		sb.replace(3, 6, "수정구문");
		System.out.println(sb);
		//for(int i=3; i<6; i++)
		System.out.println(sb);
		//delete(정수,정수) : 첫번째 매개변수부터 두번째 매개변수 앞까지 데이터를삭제
		sb.delete(4, 9);
		System.out.println(sb);
		//reverse() : 현재 문자열 순서를 뒤집음
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.toString());
		
		}
	
	public void exam1() { //무작위 소문자,대문자,숫자 만들기
		StringBuilder sb = new StringBuilder();//""
		Random ra = new Random();
		
		for(int i=0; i<8; i++) {
		
			int flag = ra.nextInt(3); //0:숫자 /1:대문자/ 2.소문자
			if(flag == 0) {
				int randomNum= ra.nextInt(10);
				sb.append(randomNum);
			}else if (flag == 1) {
				int randomNum = ra.nextInt(26)+65;
				char ch = (char) randomNum;
				sb.append(ch);
			}else if (flag == 2) {
				int randomNum = ra.nextInt(26)+97;
				char ch = (char) randomNum;
				sb.append(ch);
			}
			/*소문자
			int randomNum = ra.nextInt(26)+97;
			char ch = (char) randomNum;
			sb.append(ch);
			
			대문자 65~90
			int randomNum = ra.nextInt(26)+65;
			char ch = (char) randomNum;
			sb.append(ch);
			 //숫자
			int randomNum = ra.nextInt(10);
			sb.append(randomNum);
			*/
		}
		System.out.println(sb.toString());
		
	}
	
	public void test3() {
		String str = "이윤수/서울/강사/kh";
		//1.매개변수 문자열을 두번째 매개변수 문자열(구분자)를 기준으로 잘라서 토큰으로 관리
		StringTokenizer sT = new StringTokenizer(str,"/");	
		while(sT.hasMoreElements()) {
			String str1 = sT.nextToken();
			System.out.println(str1);
		}
		/*
		while(sT.countTokens() !=0) {
			String str1 = sT.nextToken();
			System.out.println(str1);
		}
		
		System.out.println("토큰 수 : "+sT.countTokens());//현재 남아있는 토큰 수를 정수로 리턴
		String str1 = sT.nextToken(); //현재 남아있는 토큰 중 가장 앞에 있는 토큰을 꺼내옴
		System.out.println(str1);
		System.out.println("토큰 수 : "+sT.countTokens());
		String str2 = sT.nextToken(); 
		System.out.println(str2);
		System.out.println("토큰 수 : "+sT.countTokens());
		String str3 = sT.nextToken(); 
		System.out.println(str3);
		System.out.println("토큰 수 : "+sT.countTokens());
		String str4 = sT.nextToken(); 
		System.out.println(str4);
		System.out.println("토큰 수 : "+sT.countTokens());
		*/
	}
	
}
