package kh.java.function;

import java.util.Scanner;

public class LoopTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째정수를 입력하세요  :");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요 :");
		int num2 = sc.nextInt();

		for (int i = 0; i > (num2 - num1 + 1); i++) {
			System.out.println(i);
		}
	}

	public void test2() {
		for (;;) {
			System.out.println("무한반복");
		}
	}

	public void test3() {
		while (true) {
			System.out.println("무한반복");
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수를 입력하세요 :");
			int num = sc.nextInt();
			if (num == 1) {
				break; // 즉시 반복문을 빠져 나감
			} else if (num == 2) {
				continue; // 즉시 다음 반복문 회차로 이동
			} else {
				System.out.println("입력한 숫자는" + num);
			}
			System.out.println("반복문의 마지막 위치");
		}
		System.out.println("반복문을 나오면 보이는 문구!");
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("정수를 입력하세요 :");
			int num = sc.nextInt();
			if (num == 1) {
				break;
			}
			System.out.println("입력한 정수는 :" + num);
		}
		System.out.println("이건 반복문 종료시 나오는 구문");
	}

	public void test6() {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------카카오톡-------");
			System.out.println("1. 친구");
			System.out.println("2. 대화");
			System.out.println("3. 오픈채팅");
			System.out.println("4. 쇼핑");
			System.out.println("0. 프로그램종료 ");
			System.out.println("선택 >");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("여기는 내 친구 목록이 쭉 나올예정임(나중에)");
			} else if (select == 2) {
				System.out.println("여기서는 내 채팅목록이 쭉 나올 예정(이것도 나중에)");
			} else if (select == 3) {
				System.out.println("여기는 내가 참여한 오픈채팅 목록이 나옴");
			} else if (select == 4) {
				System.out.println("여기는 쇼핑 목록이 나옴");
			} else if (select == 0) {
				break;
			}
		}

	}

	public void test8() {
		Scanner sc = new Scanner(System.in);
		boolean power = true;
		while (power) {
			System.out.println("-------카카오톡-------");
			System.out.println("1. 친구");
			System.out.println("2. 대화");
			System.out.println("3. 오픈채팅");
			System.out.println("4. 쇼핑");
			System.out.println("0. 프로그램종료 ");
			System.out.println("선택 >");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("여기는 내 친구 목록이 쭉 나올예정임(나중에)");
				break;
			case 2:
				System.out.println("여기서는 내 채팅목록이 쭉 나올 예정(이것도 나중에)");
				break;
			case 3:
				System.out.println("여기는 내가 참여한 오픈채팅 목록이 나옴");
				break;
			case 4:
				System.out.println("여기는 쇼핑 목록이 나옴");
				break;
			case 0:
				power = false;
				break;
			}// switch 종료
		} // 메뉴 반복용 while 종료
	}// 메소드종료

	public void test9() {
		for (int i = 0; i < 3; i++) {

			// System.out.println("i : "+i);

			for (int j = 0; j < 3; j++) {
				System.out.println("i :" + i + "/j:" + j);
			}
		}
	}

	public void test10() {
		for (int j = 2; j < 10; j++) {
			for (int i = 0; i < 9; i++) {
				System.out.printf("%d*%d=%d  ", j, (i + 1), j * (i + 1));

			}

			System.out.println();
		}
		/*
		 * for (int i = 0; i < 9; i++) { System.out.printf("%d*%d=%d  ",
		 * 2,(i+1),2*(i+1)); } System.out.println(); for (int i = 0; i < 9; i++) {
		 * System.out.printf("%d*%d=%d  ", 3,(i+1),3*(i+1)); } System.out.println();
		 * for(int i=0; i<9; i++) { System.out.printf("%d*%d=%d  ", 4,(i+1),4*(i+1)); }
		 */
	}

	public void test11() {
		System.out.println();

		for (int j = 2; j < 10; j++) {
			for (int i = 0; i < 8; i++) {
				System.out.printf("%d*%d=%d\t ", (i + 2), j, (i + 2) * j);
			}
			System.out.println();
		}
	}

	public void test12() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void test13() {
		for (int i = 0; i < 5; i++) {
			for(int j=0;j<5; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}	
		}
	
	public void test14() {
		for(int j=0;j<5;j++) {
			for(int i=0;i<5;i++) {
				System.out.print((i+1));
			}
			System.out.println();
		}
		
	}
	public void test15() {
		for(int j=0;j<5;j++) {
			for(int i=0; i<5; i++) {
				System.out.print(j+i+1);
			}
			System.out.println();
		}
	}
	public void test16() {
		for(int i=4; i > -1;i--) {
			for(int j=0;j<5;j++) {
				System.out.print(j+i+1);
			}
			System.out.println();
		}
	}
	public void test17() { // 8번
		for(int i=0; i<5;i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void test18() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void test19() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	public void test20() { //11번
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void test21() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			for(int i=0; i<4;i++) {
				for(int j=0; j<4-i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			/*for(int i=0; i<9;i++) {
			 * for(int j=0;i<4; j<i+1; j<9-i; j++) {
			 * 	System.out.print("*");
			 * }
			if(i<4) { 
			for(int j=0;j<i+1;j++) {
			System.out.print("*");
			}
			 	}else {
			 	for(int j=0;j<9-i;j++) {
			 	System.out.print("*");
			 	}
			 }	*/
	}
	public void test22() {
		for (int i=0; i<5;i++) {
			for(int j=0; j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			for(int j=0; j<i+2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void test23() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	public void starAll() {
		System.out.println("Q4.");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		System.out.println("Q5.");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println("Q6.");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j+i+1);
			}
			System.out.println();
		}
		System.out.println("Q7.");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j+5-i);
			}
			System.out.println();
		}		
		System.out.println("Q8.");
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q9.");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q10.");
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q11.");
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q12.");
		for(int i=0;i<10;i++) {
			for(int j=0;(i<5)?j<i:j<10-i;j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
		System.out.println("Q13.");
		for(int i=0;i<9;i++) {
			for(int j=0;(i<5)?j<5-i:j<i-3;j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
		System.out.println("Q16.");
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q17.");
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<9-2*i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q18.");
		for(int i=0;i<9;i++) {
			for(int j=0;i<5?j<4-i:j<i-4;j++) {
				System.out.print(" ");
			}
			for(int j=0;i<5?j<2*i+1:j<17-2*i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q19.");
		for(int i=0;i<9;i++) {
			for(int j=0;i<5?j<5-i:j<i-3;j++) {
				System.out.print("*");
			}
			for(int j=0;i<5?j<2*i+1:j<17-2*i;j++) {
				System.out.print(" ");
			}
			for(int j=0;i<5?j<5-i:j<i-3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q20.");
		for(int i=0;i<9;i++) {
			for(int j=0;i<5?j<i+1:j<9-i;j++) {
				System.out.print("*");
			}
			for(int j=0;i<5?j<9-2*i:j<2*i-7;j++) {
				System.out.print(" ");
			}
			for(int j=0;i<5?j<i+1:j<9-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q21.");
		for(int i=0;i<9;i++) {
			for(int j=0;i<5?j<i+1:j<9-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;i<5?j<9-2*i:j<2*i-7;j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
	}
}// 클래스 종료
