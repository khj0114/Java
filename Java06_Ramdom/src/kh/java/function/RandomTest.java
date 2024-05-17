package kh.java.function;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public void test1() {
		// 난수(Random숫자) : 무작위 수/ 임의의 수
		// 자바에서 난수를 기능을 제공 Random
		// 1. import java.util.Random;
		// 2. Random r = new Random();
		Random r = new Random();
		int num = r.nextInt(); // int 범위내에서 random숫자 1개 가져옴
		System.out.println("랜덤 수 :" + num);
		// random수 범위를 제한
		// r,nextInt(숫자); 해당숫자 갯수만큼의 범위내에서 랜덤으로 가져옴
		// 범위숫자의 시작숫자는 0부터~
		int num1 = r.nextInt(10);// 0~9까지 중 1개의 수를 랜덤으로 가져옴
		System.out.println("랜덤 수 :" + num1);

		int num2 = r.nextInt(13);// 0~12까지 중 1개의 수를 랜덤으로 가져옴
		System.out.println("랜덤 수 :" + num2);

		int num3 = r.nextInt(27);
		System.out.println("랜덤 수 :" + num3);

		int num4 = r.nextInt(10) + 1;
		System.out.println("랜덤 수 :" + num4);
		// 숫자1 : 랜덤 경우의 수
		// 숫자2 : 랜덤 시작 숫자
		// r.nextInt(숫자 1)+숫자2;

		int num5 = r.nextInt(21) + 10;
		System.out.println("랜덤 수 :" + num5);
	}

	public void coin() {
		// 컴퓨터랑 동전 앞/뒤 맞추기 게임
		// 컴퓨터가 동전을 던지고, 사람이 맞추는 게임
		Random r = new Random(); // 컴퓨터가 앞/뒤를 랜덤으로 결정하기 위함
		Scanner sc = new Scanner(System.in); // 사용자가 앞/뒤를 입력해서 선택하도록 하기 위함
		boolean power = true;
		int win = 0;
		int lose = 0;
		while (power) {
			System.out.println("=========동전 앞/뒤 맞추기=========");
			System.out.println("1. 게임시작");
			System.out.println("2. 전적확인");
			System.out.println("3. 게임종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				// 게임 로직
				// 동전을 컴퓨터가 던진다 -> 앞/뒤 중 1개를 결정
				int coin = r.nextInt(2) + 1;// 1 또는 2 중 1개의 값이 랜덤으로 나옴

				// 1이 나오면 앞면, 2나오면 뒷면
				System.out.println("앞면/뒷면 선택하세요(1.앞면 / 2.뒷면) :");
				int select = sc.nextInt();

				if (coin == select) {
					win++;
					System.out.println("정답입니다!!");
				} else {
					lose++;
					System.out.println("틀렸습니다!!!!!!!!!");
				}
				break;
			case 2:
				// 전적 출력
				System.out.println("WIN : " + win);
				System.out.println("LOSE :" + lose);
				break;
			case 3:
				// 게임 종료
				power = false;
				System.out.println("잘가라~");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}// switch 종료
		} // while 종료
	}// 메소드 종료
		// 맞춘경우 : coin == 1 / select == 1, coin == 2/ select =2
		// 틀린경우 : coin == 1 / select == 2, coin == 2/ select =1
		// 이겼을때 : ra == 1/ select == 3, ra ==2 / select == 1, ra ==3 / select ==2
		// 졌을때 : ra ==1/ select ==2, ra ==2 / select ==3, ra==3 / select ==1

	public void game() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int win = 0;
		int draw = 0;
		int lose = 0;
		boolean power = true;
		while (power) {
			System.out.println("===가위 바위 보 게임===");
			System.out.println("1. 게임시작");
			System.out.println("2. 전적확인");
			System.out.println("3. 게임종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				while (true) {

					System.out.println("숫자를 선택하세요(1.가위/2.바위/3.보) :");
					int select = sc.nextInt();

					System.out.println("========결과========");
					int user = sc.nextInt();
					System.out.println();
					if (user == 1) {
						System.out.println("당신이 가위를 냈습니다.");
					} else if (user == 2) {
						System.out.println("당신이 바위를 냈습니다.");
					} else if (user == 3) {
						System.out.println("당신이 보를 냈습니다.");
					}
					int com = r.nextInt(3) + 1;
					switch (select) {
					case 1:
						System.out.println("컴퓨터는 가위를 냈습니다.");
						break;
					case 2:
						System.out.println("컴퓨터는 바위를 냈습니다.");
						break;
					case 3:
						System.out.println("컴퓨터는 보를 냈습니다.");
						break;
					}
					System.out.println("===================");
					if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
						win++;
						System.out.println("당신이 이겼습니다.ㅠ.ㅠ");
					} else if (user == com) {
						draw++;
						System.out.println("당신은 비겼습니다.");
					} else {
						System.out.println("당신이 졌습니다.");
						break;
					}
				}
			case 2:
				System.out.println("WIN : " + win);
				System.out.println("draw :" + draw);
				System.out.println("LOSE :" + lose);
				break;
			case 3:
				power = false; // 전제 메뉴 반복 종료
				System.out.println("Bye~");
				break;
			}

			/*
			 * System.out.println(); System.out.println(); int user = sc.nextInt();
			 * System.out.println(); if(user == 1) { System.out.println(가위); }else if(user
			 * == 2) { System.out.println(바위); }else if(user == 3) { System.out.println(보);
			 * }
			 * 
			 * 컴퓨터가 가위/바위/보를 선택할 차례 -> 컴퓨터는 랜덤수로 선택 -> 경우의 수3개 int com = r.nextInt(3)+1;
			 * switch(com) { case 1 : System.out.println(가위); break; case 2 :
			 * System.out.println(바위); break; case 3 : System.out.println(보); break; }
			 */
		}
	}

	public void updown() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		boolean power = true;
		int rank = 0; // 최고기록 변수

		while (power) {
			System.out.println("=========up and down=========");

			System.out.println("1. Game start");
			System.out.println("2. Game score");
			System.out.println("3. End game");
			System.out.print("선택 > ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("<<game start>>");
				int num = r.nextInt(100) + 1;
				int count = 1;
				while (true) {
					System.out.println(count + "회차 번호 입력 :");
					int user = sc.nextInt();

					if (user < num) {
						count++;
						;
						System.out.println("<<UP>>");
					} else if (user > num) {
						count++;
						;
						System.out.println("<<DOWN>>");
					} else if (user == num) {
						if (rank == 0 || rank > count) {
							rank += count;
						}
						System.out.println("<<정답>>");
						break;
					}
				}
				// count++;;
				// case 1에있는 count는 대입을 하지않았기 때문에 case2에 들어갈수 없다
			case 2:
				if (rank == 0) {
					System.out.println("아직 기록이 없습니다.");
				} else {
					System.out.println("현재 최고 기록은" + rank + "회 입니다.");
				}
				break;
			case 3:
				// 게임 종료
				power = false;
				break;
			}
		}

	}

	public void bae() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int win = 0;
		int lose = 0;
		while(true) {
			System.out.println("========== BR 31 ==========");
			System.out.println("1. GAME START");
			System.out.println("2. GAME SCORE");
			System.out.println("3. End Game");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				//턴게임 -> 사용자랑 컴퓨터가 1~3 사이의 숫자를 외치면 숫자 커짐
				//-> 31이되면 종료(31을 외치는 쪽이 패배)
				int count = 0;//화면에 출력하는 숫자를 관리하기위한 변수
				while(true) {
					System.out.println("<< YOUR TURN >>");
					while(true) {				
						System.out.print("Input Number(1~3) : ");
						int userNum = sc.nextInt();
						if(1<=userNum && userNum<=3) {				
							for(int i=0;i<userNum;i++) {
								count++;
								System.out.println(count+"!");
								if(count == 31) {
									lose++;
									System.out.println("패배!!!!!!!");
									break;
							}		
						}
							break;
						}else {
							System.out.println("잘못 입력하셨습니다. 1~3 사이 숫자를 입력하세요.");
							}
					}
					if(count == 31) {
						break;
					}
					System.out.println("<< COMPUTER TURN >>");
					int comNum = r.nextInt(3)+1;
					for(int i=0;i<comNum;i++) {
						count++;
						System.out.println(count+"!");
						if(count == 31) {
							win++;
							System.out.println("승리!!!!!!!!!!!!!");
							break;
						}
					}
					if(count == 31) {
						break;
					}
				}
				break;
			case 2:
				System.out.println("WIN : "+win);
				System.out.println("LOSE : "+lose);
				break;			
			}
			if(select == 3) {
				break;
			}
		}
	}
	public void dice() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean isEnd = false;
		int win = 0;
		int lose = 0;
		int draw = 0;
		int money = 10000;
		while (true) {
			System.out.println("===== DICE Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				if (money == 0) {
					System.out.println("잔액이 없습니다. bye~");
				} else {
					while (true) {
						System.out.println("<< Game Start >>");
						int userTotal = 0;
						for (int i = 0; i < 3; i++) {
							int user = r.nextInt(6) + 1;
							System.out.println((i + 1) + "번째 주사위 값 : " + user);
							userTotal += user;
						}
						System.out.println("내 주사위 총 합 : " + userTotal);
						System.out.print("배팅 하시겠습니까[y/n] : ");
						char ch = sc.next().charAt(0);
						if (ch == 'n') {
							System.out.println("메뉴로 돌아갑니다.");
							break;
						} else if (ch == 'y') {
							int batMoney = 0;
							while (true) {
								System.out.print("얼마를 배팅하시겠습니까(현재 내 소지금 " + money + "원) : ");
								batMoney = sc.nextInt();
								if (batMoney > money) {
									System.out.println("금액이 부족합니다. 다시 입력해주세요.");
									continue;
								}
								break;
							}
							int comTotal = 0;
							for (int i = 0; i < 3; i++) {
								int ranNum = r.nextInt(6) + 1;
								System.out.println("컴퓨터 " + (i + 1) + "번째 주사위 값 : " + ranNum);
								comTotal += ranNum;
							}
							System.out.println("컴퓨터 주사위 총 합 : " + comTotal);
							System.out.println("<< 결과 >>");
							if (userTotal > comTotal) {
								System.out.println("승리!!");
								System.out.println("+" + batMoney + "원!!");
								money += batMoney;
								win++;
							} else if (userTotal < comTotal) {
								System.out.println("패배!!");
								System.out.println("-" + batMoney + "원!!");
								money -= batMoney;
								lose++;
								if (money == 0) {
									System.out.println("거지는 안받아요~");
									break;
								}
							} else {
								System.out.println("무승부!!");
								draw++;
							}
							System.out.print("한번 더 하시겠습니까[y/n] : ");
							String choice = sc.next();
							if (choice.equals("n")) {
								break;
							}
						}
					}
				}
				break;
			case 2:
				System.out.println("<< 당신의 전적 >>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				System.out.println("DRAW : " + draw);
				System.out.println("내 소지금 : " + money + "원");
				break;
			case 3:
				isEnd = true;
				System.out.println("게임을 종료합니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			if(isEnd) {
				break;
			}
		}
	}
		}