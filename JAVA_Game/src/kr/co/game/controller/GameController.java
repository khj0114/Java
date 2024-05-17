package kr.co.game.controller;

import java.util.Scanner;

import kr.co.iei.Game.Character;
import kr.co.iei.Game.Dealer;
import kr.co.iei.Game.Healer;
import kr.co.iei.Game.Tanker;
import kr.co.iei.Game.Member;

public class GameController {
	private Scanner sc;
	private Character[] characterList;		//전체 판매 상품을 저장하는 배열
	private int CharacterIndex;	
	
	private Member[] members;
	private int memberIndex;
	
	public GameController() {
		super();
		sc= new Scanner(System.in);
		characterList = new Character[30];
		CharacterIndex = 0;
		
		characterList[CharacterIndex++] = new Dealer("한조", 80, 200, 100, 1);
		characterList[CharacterIndex++] = new Dealer("겐지", 60, 200, 150, 1);
		
		characterList[CharacterIndex++] = new Healer("메르시", 60, 200, 50, 2, 80, 12);
		characterList[CharacterIndex++] = new Healer("젠야타", 90, 200, 20, 2, 50, 13);
		
		characterList[CharacterIndex++] = new Tanker("라인", 80, 500, 45, 3, 400);
		characterList[CharacterIndex++] = new Tanker("디바", 100, 600, 90, 3, 800);
		members = new Member[30];
		memberIndex = 0;
		
		members[memberIndex++] = new Member("aaa", "aaa", "123");
		members[memberIndex++] = new Member("bbb", "bbb", "123");
	}

	public void main() {
		while(true) {
			System.out.println("\n----------- 캐릭터 사전? -----------\n");
			System.out.println("1. 직원");
			System.out.println("2. 유저");
			System.out.println("0. 종료");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				Develop();
				break;
			case 2:
				Client();
				break;
			case 0:
				return;
			}// switch
		}// while
	}// main()
	
	/*----------------------개발자------------------------------*/
	public void Develop() {
		while (true) {
			System.out.println("\n----------- 게임 시작 -----------\n");
			System.out.println("1. 캐릭터 등록");
			System.out.println("2. 캐릭터 목록보기");
			System.out.println("3. 캐릭터 정보 변경");
			System.out.println("4. 캐릭터 삭제");
			System.out.println("0. 이전 메뉴로");
			System.out.println("선택 > ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				characterInsert();
				break;
			case 2:
				characterPrint();
				break;
			case 3:
				characterUpdate();
				break;
			case 4:
				characterDelete();
				break;
			case 0:
				return; // 메소드 종료
			}// switch
		} // while
	}

	public void characterInsert() {
		System.out.println("\n----------- 캐릭터 등록 -----------\n");
		System.out.print("캐릭터 유형을 입력하세요 [1. 딜러 / 2. 힐러 / 3. 탱커] : ");
		int type = sc.nextInt();
		System.out.print("캐릭터 이름 입력 : ");
		String name = sc.next();
		
		System.out.print("캐릭터 공격력 입력 : ");
		int attack = sc.nextInt();
		
		System.out.print("캐릭터 체력 입력 : ");
		int hp = sc.nextInt();

		System.out.print("캐릭터 방어력 입력 : ");
		int defend = sc.nextInt();
		
		switch(type) {
		case 1: // 입력받은 타입이 딜러일때
			characterList[CharacterIndex++] = new Dealer(name, attack, hp, defend, type);
			break;
		case 2: // 입력받은 타입이 힐러일때
			System.out.print(" 힐 수치를 입력하세요 : ");
			int heal = sc.nextInt();
			System.out.print(" 버프 수치를 입력하세요 : ");
			int buff = sc.nextInt();
			characterList[CharacterIndex++] = new Healer(name, attack, hp, defend, type, heal, buff);
			break;
		case 3: // 입력받은 타입이 탱커일때
			System.out.print(" 쉴드 수치를 입력하세요 : ");
			int shield = sc.nextInt();
			characterList[CharacterIndex++] = new Tanker(name, attack, hp, defend, type, shield);
			break;
		}
		System.out.println("등록 완!");
	}

	public void characterUpdate() {
		characterPrint();
		System.out.print("수정할 캐릭터 번호를 입력해주세요 : ");
		int chNum = sc.nextInt();
		Character ch = characterList[chNum - 1];
		System.out.println("------ "+ch.getName()+"의 정보를 수정합니다." + " ------");
		while(true) {
			System.out.println("1. 이름 변경");
			System.out.println("2. 공격력 변경");
			System.out.println("3. 체력 변경");
			System.out.println("4. 방어력 변경");
			System.out.println("5. 옵션 변경(힐러 전용)");
			System.out.println("6. 옵션 변경(탱커 전용)");
			System.out.println("0. 수정 끝(나가기)");
			System.out.println("선택 > ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("수정할 캐릭터 이름을 입력해주세요 : ");
				String modifyName = sc.next();
				ch.setName(modifyName);
				break;
			case 2:
				System.out.print("수정할 캐릭터 공격력을 입력해주세요 : ");
				int modifyAttack = sc.nextInt();
				ch.setAttack(modifyAttack);
				break;
			case 3:
				System.out.print("수정할 캐릭터 체력을 입력해주세요 : ");
				int modifyHp = sc.nextInt();
				ch.setHp(modifyHp);
				break;
			case 4:
				System.out.print("수정할 캐릭터 체력을 입력해주세요 : ");
				int modifyDefend = sc.nextInt();
				ch.setDefend(modifyDefend);
				break;
			case 5:
				if(ch.getType() == 2) {
					System.out.print("수정할 힐러의 힐 수치를 입력해주세요 : ");
					int modifyHeal = sc.nextInt();
					System.out.print("수정할 힐러의 버프 수치를 입력해주세요 : ");
					int modifyBuff = sc.nextInt();
					Healer h = (Healer)ch;
					h.setHeal(modifyHeal);
					h.setBuff(modifyBuff);
				}else {
					System.out.println("힐러만 가능합니다.");
				}
				break;
			case 6:
				if(ch.getType() == 3) {
					System.out.print("수정할 탱커의 방어력 수치를 입력해주세요 : ");
					int modifyShield = sc.nextInt();
					Tanker t = (Tanker)ch;
					t.setDefend(modifyShield);

				}else {
					System.out.println("탱커만 가능합니다.");
				}
				break;
			case 0:
				System.out.println("수정을 끝냅니다.");
				return;
			}
		}
	}

	public void characterPrint() {
		System.out.println("\n----------- 캐릭터 목록 -----------\n");
		System.out.println("번호\t이름\t공격력\t체력\t방어력\t\t옵션");
		System.out.println("--------------------------------------------------------------");
		for(int i = 0; i < CharacterIndex; i++) {
			Character ch = characterList[i];
			
			if(ch.getType() == 1) {
				// 딜러는 캐릭터 클래스랑 다를게 없음
				System.out.println((i+1)+"\t"+ch.getName()+"\t"+ch.getAttack()+"\t"+ch.getHp()+"\t"+ch.getDefend());
			}else if(ch.getType() == 2) {
				Healer h = (Healer)ch;
				System.out.println((i+1)+"\t"+h.getName()+"\t"+h.getAttack()+"\t"+h.getHp()+"\t"+h.getDefend()+"\t힐 : "+h.getHeal()+ " , 버프 : " + h.getBuff());
			}else if(ch.getType() == 3) {
				Tanker t = (Tanker)ch;
				System.out.println((i+1)+"\t"+t.getName()+"\t"+t.getAttack()+"\t"+t.getHp()+"\t"+t.getDefend()+"\t실드 : "+t.getShield());
			}
		}
	}

	public void characterDelete() {
		System.out.println("\n----------- 캐릭터 삭제 -----------\n");
		characterPrint();
		System.out.print("삭제할 캐릭터 번호를 입력하세요 : ");
		int chNum = sc.nextInt();
		
		for(int i = chNum - 1; i < CharacterIndex - 1; i++) {
			characterList[i] = characterList[i+1];
		}
		characterList[--CharacterIndex] = null;
		System.out.println("삭제 완!");
	}

	/*----------------------유저------------------------------*/

	public void Client() {
		while (true) {
			System.out.println("\n----------- 게임 시작 -----------\n");
			System.out.println("1. 회원 가입");
			System.out.println("2. 게임하기");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 탈퇴하기");
			System.out.println("0. 이전 메뉴로");
			System.out.print("선택 > ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				memberInsert();
				break;
			case 2:
				memberGame();
				break;
			case 3:
				memberUpdate();
				break;
			case 4:
				memberDelete();
				break;
			case 0:
				return; // 메소드 종료
			}// switch
		} // while
	}

	public void memberInsert() {
		System.out.println("\n========== 회원 가입 ==========\n");
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("ID : ");
		String id = sc.next();
		
		System.out.print("PW : ");
		String pw = sc.next();
		
		members[memberIndex++] = new Member(name, id, pw);
		
		System.out.println("이름\t아이디\t비밀번호");
		for(int i = 0; i < memberIndex; i++) {
			System.out.print(members[i].getName()+"\t");
			System.out.print(members[i].getId()+"\t");
			System.out.print(members[i].getPw()+"\t");
			System.out.println();
		}
	}

	public void memberGame() {
		System.out.println("\n========== 게임 창 ==========\n");
		
		System.out.println("\n---------- 로그인 해주세요 ----------\n");
		System.out.print("ID를 입력하세요 : ");
		String id = sc.next();
		
		int searchIndex = searchIndex2(id);
		Member m = new Member();
		
		if(searchIndex == -1) {
			System.out.println("입력하신 ID 정보가 없습니다 다시 로그인해주세요");
		}else {
			System.out.print("비밀번호를 입력하세요 : ");
			String pw = sc.next();
			if(id.equals(members[searchIndex].getId())) {
				if(pw.equals(members[searchIndex].getPw())) {
					System.out.println("로그인 성공");
					System.out.println("\n========== 게임을 시작합니다. ==========\n");
					characterPrint();
					System.out.print("캐릭터 유형을 입력하세요 [1. 딜러 / 2. 힐러 / 3. 탱커] : ");
					int type = sc.nextInt();
					
				}else {
					System.out.println("PW 불일치");
				}
			}
		}		
		
	}
	
	
	public void memberUpdate() {
		// TODO Auto-generated method stub
		System.out.println("---------회원 정보 수정-----------");
		System.out.println("정보를 수정할 회원 이름 입력 :");
		String name = sc.next();
		int searchIndex = searchIndex2(name);
		for(int i=0; i<CharacterIndex; i++) {
			Member searchCharacter = members[i];
			String searchName = searchCharacter.getName();
			if(name.equals(searchName)) {
				searchIndex = i;
				break;
			}
		
		}
		if(searchIndex == -1) {
			System.out.println("회원 정보를 조회를 할수 없습니다.");
		}else {
			System.out.print("수정할 회원 이름 입력 :");
			String modifyName = sc.next();
			System.out.println("수정할 회원 아이디 입력 :");
			String modifyId = sc.next();
			System.out.println("수정할 회원 비밀번호 입력 :");
			String modifyPw = sc.next();
			
			Member  m = new Member(modifyName, modifyId, modifyPw);
			members[searchIndex] = m;
			System.out.println("정보 수정 완료!");
		}
	}

	public void memberDelete() {
		/*------------------나중에 지울거---------------------*/
		System.out.println("이름\t아이디\t비밀번호");
		for(int i = 0; i < memberIndex; i++) {
			System.out.print(members[i].getName()+"\t");
			System.out.print(members[i].getId()+"\t");
			System.out.print(members[i].getPw()+"\t");
			System.out.println();
		}
		/*----------------------------------------------*/
		System.out.println("\n========== 탈퇴 ==========\n");
		System.out.print("ID를 입력하세요 : ");
		String id = sc.next();
		
		int searchIndex = searchIndex2(id);
		
		Member m = new Member();
		
		if(searchIndex == -1) {
			System.out.println("다시 로그인해주세요");
		}else {
			System.out.print("비밀번호를 입력하세요 : ");
			String pw = sc.next();
			if(id.equals(members[searchIndex].getId())) {
				if(pw.equals(members[searchIndex].getPw())) {
					for(int i = searchIndex; i < memberIndex - 1; i++) {
						members[i] = members[i+1];
					}
					members[--memberIndex] = null;
				}else {
					System.out.println("PW 불일치");
				}
			}else {
				System.out.println("ID 불일치");
			}
		}
	}
	

	public int searchIndex(String name) {
		for(int i = 0; i < CharacterIndex; i++) {
			if(characterList[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public int searchIndex2(String id) { // id 인덱스 값 찾기
		for(int i = 0; i < memberIndex; i++) {
			if(members[i].getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}	
}

	
	

