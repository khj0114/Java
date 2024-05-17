package kh.java.test2;

import java.util.Scanner;

public class TV {
	/*
	 TV 생성 
	 속성 : 크기/전원/볼륨/채널
	 기능 : 전원 on,off/ 채널 1증가/ 채널 1감소/ 숫자로 채널 변경/ 볼륨1증가/ 볼륨1감소
	 속성은 전역변수로 (클래스 레벨의 변수)로 생성
	 기능은 메소드로 생성
	 */
	//전역변수와 지역변수 차이점
	//전역변수는 지역변수와 다르게 선언하면 기본값이 세팅되어있음 (숫자타입 모두 0, 문자 : ' ', 논리형 : false, 참조형 : null)
	private int inch; 		//크기
	private boolean power;  //전원
	private int volume; 	//볼륨 (소리크기 X)
	private int channel; 	//채널
	
	public void power() {
		//현재 전원상태를 반전(true면 false/ false면 true 대입)
		power = !power;
		if(power) {
			System.out.println("전원이 켜졌습니다!");
		}else {
			System.out.println("전원이 꺼졌습니다!");
		}
	}
	
	public void channelUp() {
		channel++;
		System.out.println("현재 채널 :" +channel);
	}
	
	public void channelDown() {
		channel--;
		System.out.println("현재 채널 :" +channel);
	}
	
	public void volumeUp() {
		volume++;
		System.out.println("현재 볼륨 :" +volume);		
	}
	
	public void volumeDown() {
		if(volume !=30) {
			volume--;
		}
		
		System.out.println("현재 볼륨 :" +volume);
	}
	
	//TV를 운영하는 메소드
	public void start() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("========내가만든 TV======");
			System.out.println("1.전원버튼");
			System.out.println("2.채널 올리기");
			System.out.println("3.채널 내리기");
			System.out.println("4.채널 변경(채널번호 입력)");
			System.out.println("5.볼륨 올리기");
			System.out.println("6.볼륨 내리기");
			System.out.println("0.TV 버리기");
			System.out.print("선택 >>");			
			int select = sc.nextInt();
			
			if(select >=2 && select <=6) {
				if(!power) {
					System.out.println("전원이 꺼져있습니다.");
					continue;
				}
			}
			switch(select) {
			case 1:
				power();
				break;
			case 2:
				channelUp();
				break;
			case 3:
				channelDown();
				break;
			case 4:		
				System.out.println("변경할 채널 번호를 입력하세요 :");
				int changeNo = sc.nextInt();
				channel = changeNo;
				System.out.print("현재 채널 :" +channel);
				break;
			case 5:
				volumeUp();
				break;
			case 6:
				volumeDown();
				break;
			case 7:
				/*System.out.println("출력1");
				sleep(1000);
				System.out.println("출력2");
				sleep(1000);
				System.out.println("출력3");
				sleep(1000);
				for(int i=0; i<10; i++) {
					System.out.println((i+1));
					sleep(1000);
				}*/
				break;
			case 0:
				return;
			}
		}		
	}	
	/*public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
