package kh.java.function;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	public void test1() {
		//1,2,3,4,5 라는 데이터를 각각 저장하고 출력
		//1) 변수를 이용해서 처리
		int num1 =1;
		int num2 =2;
		int num3 =3;
		int num4 =4;
		int num5 =5;
		System.out.println("변수를 이용한 값 출력");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		for(int i=0; i<5; i++) {
			
		}
		
		//2) 배열을 이용해서 처리
		//배열 선언 방법
		//자료형[] 변수이름 = new 자료형[배열길이];
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println("배열을 이용한 값 출력");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);	
		System.out.println("배열 데이터를 for문을 이용해서 출력");
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
	}
	public void test2() {
		//배열을 선언해서 데이터 1,2,3,4,5 각각 저장한 후 출력
		int[] arr = new int[5];
		//배열은 할당을 하면 기본값으로 데이터가 초기화 되어있음
		//기본값: 정수(0), 실수(0.0), 문자(''), 논리형(flase),참조형(null-주소가 비어있다.)
		for(int i=0; i<5; i++) {
			System.out.println(i+" :"+arr[i]);					
		}
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println("----------");
		for(int i=0; i<5; i++) {
			System.out.println(i+" :"+arr[i]);
		}
		//배열을 선언하면서 바로 값을 대입
		int[] arr1 = {1,2,3,4,5}; 
		System.out.println("----------");
		for(int i=0; i<5; i++) {
			System.out.println(i+" :"+arr1[i]);
		}
	}
	public void test3() {
		String[] arr = new String[4];
		arr[0] = "오늘은 금요일이죠";
		arr[1] = "집에 너무 가고 싶어요";
		arr[2] = "저 먼저 들어가도 될까요??";
		arr[3] = "여러분은 자습하고 가세요";
		for(int i=0; i<4; i++) {
			System.out.println(i+" : "+arr[i]);
		}
	}
	public void test4() {
		int [] arr = new int [3];
		arr[0] = 200;
		
		System.out.println(arr[0]);
		//arr[1] = 300; 형변환이 가능한것만 사용가능 'a' O, "a" X
	}
	public void test5() {
		
		String[] arr = {"딸기", "복숭아", "키위", "사과", "바나나"};
		
		System.out.println(arr[4]);
		
		System.out.println("-------");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("-------");
		
		String[] arr1 = new String[5];
		arr[0] = "딸기";
		arr[1] = "복숭아";
		arr[2] = "키위";
		arr[3] = "사과";
		arr[4] = "바나나";
		for(int i=0; i<5; i++) {
			System.out.println(i+" : "+arr[i]);
			//System.out.println(arr[i]);
		}
	}
	public void test6() {
		int arr[] = new int[100];
		for(int i=0; i < 100; i++) {
			//arr[i] = i+1;
			//for(int i=0; i<100; i++) {
			//System.out.println(arr[1]);
		//}
			System.out.println("(" + (i+1)+ "): " + (arr[i] + i+1));						
		}
	}
			
	public void test7() {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[4];
		String[] subject = {"국어", "영어", "수학"};
		for(int i=0; i<3; i++) {
			System.out.print(subject[i]+"점수 :");
			int score = sc.nextInt();
			arr[i] = score;
			arr[3] += score;
		}
		/*
		System.out.print("국어점수 :");
		arr[0] = sc.nextInt();
		System.out.print("영어점수 :");
		arr[1] = sc.nextInt();
		System.out.print("수학점수 :");
		arr[2] = sc.nextInt();     
		arr[3] = arr[0]+arr[1]+arr[2]; */
		
		System.out.println("국어점수 :"+arr[0]);
		System.out.println("영어점수 :"+arr[1]);
		System.out.println("수학점수 :"+arr[2]);
		System.out.println("합계 :"+arr[3]);
		System.out.printf("평균 : %2f",arr[3]/3.0);
	}
	//버블 정렬의 기본논리 -> 두 수를 비교해서 큰수를 배열의 뒤쪽에 배치
	public void sort1() {
		int[] arr = {5,4,2,1,3};
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+"\t");			
		}
		System.out.println(); 
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		/*
		for(int i=0; i<4; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		for(int i=0; i<3; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		for(int i=0; i<2; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		/*if (arr[0] > arr[1]) {
			//두개 자리바꾸는 코드
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		if(arr[1] > arr[2]) {
			int temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}
		if(arr[2] > arr[3]) {
			int temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;
		}
		if(arr[3] > arr[4]) {
			int temp = arr[3];
			arr[3] = arr[4];
			arr[4] = temp;
		}
		
		*/
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+"\t");			
		}
		System.out.println(); 
		
	}
	public void sort2() {
		int[] arr = {100,36,50,78};
		//버블정렬로 오름차순 정렬해서 출력
		for(int i=0; i<4; i++) {
			System.out.print(arr[i]+"\t");	
	}
			System.out.println(); 
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<4; i++) {
			System.out.print(arr[i]+"\t");			
		}
		System.out.println(); 
	}
	public void test8() {
		int[] arr1 = new int [5];
		System.out.println(arr1.length); //배열의 길이를 구하는 방법(데이터 타입은 int)
		String[] arr2 = new String[3];
		System.out.println(arr2.length);
		
		int[] arr = {5,4,2,1,3};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");			
		}
		System.out.println(); 
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");			
		}
		System.out.println(); 
		
	}	
	public void test9() {
		Scanner sc = new Scanner(System.in);
		//다섯개 숫자를 입력받아서 오름차순 정렬해서 출력
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 정수 입력 :");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	public void test10() {
		Scanner sc = new Scanner(System.in);
		//정수 배열
		//방을 관리하기위한 배열
		//배열안에 데이터가 0이면 빈방 / 1이면 손님이 있는방
		//배열안에 데이터가 false면 빈방 / true면 손님이 있는방
		int[] rooms = new int[10];//배열은 할당하면 기본값이 세팅(정수면 -> 0, 최초에 모두 빈방인 상태)
		boolean power = true;
		while(power ) {
			System.out.println("모텔 관리 프로그램 v1.0");
			System.out.println("1.입실\t2.퇴실\t3.방보기\t4.종료");
			System.out.print("선택 >>");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("몇번방에 입실하시겠습니까?");
				int inRoomNo = sc.nextInt();
				//입실처리(데이터를 0->1로 변경) : 입실의 조건은 현재 빈방이어야 함(현재값이 0이어야함)
				if(rooms[inRoomNo-1] == 0) {
					rooms[inRoomNo-1] = 1;
					System.out.println(inRoomNo+"번방에 입실했습니다.");
				}else
					System.out.println(inRoomNo+"번방에는 손님이 있습니다.");
				rooms[inRoomNo-1] = 1;				
				break;
			case 2:
				System.out.print("몇번방에서 퇴실하시겠습니까?");
				//퇴실처리(데이터를 1->0으로 변경) : 퇴실 조건은 현재 손님이 있는방이어야 함(현재값이 1)
				int outRoomNo = sc.nextInt() - 1;
				if(rooms[outRoomNo ] == 1) {
					rooms[outRoomNo] =0;
					System.out.println((outRoomNo+1)+"번방에서 퇴실했습니다.");
				} else {
					System.out.println((outRoomNo+1)+"번방은 빈방입니다.");
				}										
				break;
			case 3:
				for(int i=0; i<rooms.length; i++) {
					if(rooms[i] == 1) {
						System.out.println((i+1)+"번방에는 손님이 있습니다.");
					}else {
						System.out.println((i+1)+"번방은 빈방입니다.");
					}
				}								
				break;
			case 4:
				power = false;
				break;
			}
		}		
	}	
	public void lotto() {
		Scanner sc = new Scanner(System.in);
		int[] userNum = new int[6];	
			
			System.out.println("========로또 프로그램========");
			for(int i =0; i<userNum.length;i++) {
				System.out.print((i+1)+"번째 번호 입력 :");
			int num = sc.nextInt();		
			//검증이 끝나면 배열에 대입
			//검증작업 총 2가지
			//1)입력한 숫자가 1~45 사이의 숫자인지
			//2)입력한 숫자가 배열에 존재하지 않은지
			if(num >= 1 && num <=45) {
				//정상적인 범위를 입력한 경우 -> 배열에 중복인지 체크
				boolean check = true;// 중복체크 확인용 변수
				for(int j=0; j<i;i++) {
					if(userNum[j] == num) {
						check = false;
						break;//중복인 숫자를 찾으면 그 이후 검사는 의미가없으니까 중복체크 반복문 종료						
					}
				}
				if(check) {
					userNum[i] = num;
				}else {
					i--;
					System.out.println("이미 중복된 번호입니다.");
				}				
			}else {
				//비정상적인 범위를 입력한경우 -> 배열 중복체크가 의미가 없다.					
				System.out.println("1~45 범위의 숫자를 입력하세요.ㅣ");	
				i--;
			}
			
		}
		//컴퓨터 번호 (당첨번호)
		Random r = new Random();
		int[] comNum = new int[6];
		for(int i=0; i<comNum.length; i++) {
			int num = r.nextInt(45)+1;
			boolean check = true;
			for(int j=0; j<i; j++) {
				if(comNum[j] == num) {
					check = false;
					break;
				}
			}
			if(check) {
				comNum[i] = num;
			}else {
				i--;
			}
		}
		//사람 숫자 정렬
		for(int i=0; i<userNum.length-1; i++) {
			for(int j=0; j<userNum.length-1-i; j++) {
				if(userNum[j] > userNum[j+1]) {
					int temp = userNum[j];
					userNum[j] = userNum[j+1];
					userNum[j+1] = temp;
				}
			}
		}
		//컴퓨터 숫자 정렬
		for(int i=0; i<comNum.length-1; i++) {
			for(int j=0; j<comNum.length-1-i; j++) {
				if(comNum[j] > comNum[j+1]) {
					int temp = comNum[j];
					comNum[j] = comNum[j+1];
					comNum[j+1] = temp;
				}
			}
		}
		//최종 출력
		System.out.println("최종결과");
		System.out.print("사용자 번호");
		for(int i=0; i<userNum.length; i++) {
			System.out.println(userNum[i]+" ");
		}
		System.out.println();
		System.out.print("당첨 번호");
		for(int i=0; i<comNum.length;i++) {
			System.out.println(comNum[i]+" ");
		}
		System.out.println();
		int count = 0;
		//등수체크
		for(int i=0; i<userNum.length; i++) {
			int num = userNum[i];
			
			for(int j=0; j<comNum.length;j++) {
				if(num == comNum[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("맞은 개수 :" +count);
		switch(count) {
		case 6:
			System.out.println("1등!!");
			break;
		case 5:
			System.out.println("2등!");
			break;
		case 4 :
			System.out.println("3등");
			break;
		default :
			System.out.println("꽝!!!!");
			break;
		}
	}
}
		

