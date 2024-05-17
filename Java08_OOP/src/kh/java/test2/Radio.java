package kh.java.test2;

import java.util.Scanner;

public class Radio {

	//1.주제 선정 (
	//2.추상화(속성/기능 추출)
	//3.속성은 변수
	//4.기능은 메소드
	//5.운영메소드로 운영
	int channel;   //채널
	boolean power; //전원
	int volume;    //볼륨
	
	public void power() {
		power = !power;
		if(power) {
			System.out.println("전원이 켜졌습니다!");
		}else {
			System.out.println("전원이 꺼졌습니다!");
		}
	}
	public void volumeUp() {
		volume++;
		System.out.println("현재 볼륨 :"+volume);
	}
	public void volumeDown() {
		volume--;
		System.out.println("현재 볼륨 :"+volume);
	}
	public void channelUp() {
		channel++;
		System.out.println("현재 채널 :"+channel);
	}
	public void channelDown() {
		channel--;
		System.out.println("현재 채널 :"+channel);
	}
	public void start2() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("===라디오===");
			System.out.println("1.라디오 전원 :");
			System.out.println("2.볼륨 높이기 :");
			System.out.println("3.볼륨 낮추기 :");
			System.out.println("4.채널 높이기 :");
			System.out.println("5.채널 낮추기 :");
			System.out.println("0.라디오 작동X :");
			System.out.print("선택 >>");
			int select = sc.nextInt();
		
		if(select >= 2 && select <= 5) {
			if(!power) {
				System.out.println("전원이 꺼졌습니다.");
				continue;
			}
		}
		switch(select) {
		case 1:
			power();
			break;
		case 2:
			volumeUp();
			break;
		case 3:
			volumeDown();
			break;
		case 4:
			channelUp();
			break;
		case 5:
			channelDown();
			break;
		case 0:
			return;
		}
	
	}		
}
	
	
	
	
	
	
	
	
	
	
	//1.주제 선정 (
		//2.추상화(속성/기능 추출)
		//3.속성은 변수
		//4.기능은 메소드
		//5.운영메소드로 운영
	
	
	
	public class CoffeeShop {
		
		private String[]menu;
		private double[]prices;
		
			public CoffeeShop() {
				menu = new String[] {"아메리카노", "에스프레소", "카페라떼", "카페모카"};
				prices = new double[] {2000.0, 2500.0, 3000.0, 3500.0};
			}
			
			public  double amPrice(int menuNumber, int quantity) {
				if(menuNumber < 1 || menuNumber > menu.length) {
					System.out.println("죄송합니다. 해당 메뉴는 없습니다.");
					return 0;
				}
				double price = prices[menuNumber - 1] * quantity;
				System.out.println(menu[menuNumber - 1]+" "+quantity +"잔의 가격은"+price+"원 입니다.");
				return price;
			}
			public void PrintMenu() {
				System.out.println("=====메뉴=====");
				for(int i=0; i<menu.length;i++) {
					System.out.println((i+1) + ". "+menu[i]+": "+prices[i]+"원");					
				}
			}
			public static void main (String[] args) {
				//CoffeeShop coffeeShop = new CoffeeShop();
				Scanner sc = new Scanner(System.in);
				
				while(true) {
					
				//	coffeeShop.PrintMenu();
					System.out.println("주문하실 메뉴 번호를 입력하세요 :");
					//int menuNumber = Scanner.nextint();
					
					//if(menuNumber == 0) {
						System.out.println("주믄을 종료합니다.");
						break;
					}
					System.out.println("주문하실 잔 수를 입력하세요 :");
					//int quantity = Scanner.nextint();
					
					
					//double totalPrice = coffeeShop.amPrice(menuNumber,quantity);
					//System.out.println("총 가격"+totalPrice+"원");	
				}
				
			}
					
			}
			
		
	
	
//}
	