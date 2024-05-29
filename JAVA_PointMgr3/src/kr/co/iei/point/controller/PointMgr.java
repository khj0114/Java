package kr.co.iei.point.controller;

import java.util.Scanner;



import kr.co.iei.point.vo.Gold;
import kr.co.iei.point.vo.Grade;

import kr.co.iei.point.vo.Silver;
import kr.co.iei.point.vo.Vip;

public class PointMgr implements PointMgrInterface{

	
	private Scanner sc;				//키보드 입력을 받기위한 Scanner
	private Grade[]members;			//회원정보를 저장할 배열(Silver,Gold,vip 전부 다 Grade를 상속했으므로)
	private int index;				//배열의 회원 수를 관리하기위한 변수
	
	public PointMgr() {
		super();
		sc = new Scanner(System.in);
		members = new Grade[30];
		index = 0;
		members[index++] = new Silver("silver", "회원1", 1000);
		members[index++] = new Silver("silver", "회원2", 2000);
		members[index++] = new Silver("silver", "회원3", 3000);
		members[index++] = new Gold("gold", "회원4", 4000);
		members[index++] = new Gold("gold", "회원5", 5000);
		members[index++] = new Vip("vip", "회원6", 6000);
	}
				
	@Override
	public void main() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("\n----------회원 관리 프로그램v3-----------\n");
			System.out.println("1.회원 정보 등록");
			System.out.println("2.전체 회원 출력");
			System.out.println("3.회원 1명 출력");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.회원 정보 삭제");
			System.out.println("0.프로그램 종료");
			System.out.print("선택>");
			int select = sc.nextInt();
			switch(select) {
				case 1:
					 insertMember();
					break;
				case 2: 
					printAllMember();
					break;
				case 3:
					printOneMember();
					break;
				case 4:
					updataMember();
					break;
				case 5:
					deleteMember();
					break;
				case 0:
					System.out.println("시스템을 종료합니다.");
					return;
			}
		}
	}

	@Override
	public void insertMember() {
		// TODO Auto-generated method stub
		System.out.println("\n---------회원 정보 등록---------\n");
		System.out.print("회원 등급 입력[Silver,Gold,Vip] :");
		String grade = sc.next();
		System.out.print("이름 입력 :");
		String name = sc.next();
		System.out.print("포인트 입력 :");
		int point = sc.nextInt();
		//다형성 : 부모타입 변수에 자식타입 객체의 주소를 저장할 수 있는 기능
		switch(grade) {
		case "silver" :
			Silver s = new Silver();
			s.setGrade(grade);
			s.setName(name);
			s.setPoint(point);
			Grade gra = (Grade)s; //업캐스팅(자료형을 상위 자료형 형태로 저장하는것 ->다형성)	
			members[index] = gra;
			index++;
			break;
		case "gold" :
			Gold g =  new Gold(grade, name, point);
			Grade gra2 = g;//업캐스팅(업캐스팅은 강제형병환을 하지않아도 저건이 맞으면 자동으로 형변환 가능
			members[index] = gra2;
			index++;
			break;
		case "vip" :
			Vip v =new Vip(grade, name, point);
			members[index] = v;
			index++;
			break;
		default :
			System.out.println("등급을 똑바로 입력해주세요.");
			return;
		}
		System.out.println("회원 등록 완료");
	}

	@Override
	public void printAllMember() {
		// TODO Auto-generated method stub
		System.out.println("\n-----------전체 회원 정보 출력-----------\n");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("----------------------------");
		
		for(int i=0;i<index;i++) {
			Grade g = members[i];
			System.out.println(g.getGrade()+"\t"+g.getName()+"\t"+g.getPoint()+"\t"+g.getBonus());
		}				
	}

	@Override
	public void printOneMember() {
		// TODO Auto-generated method stub
		System.out.println("\n--------------회원 정보 조회-----------\n");
		System.out.print("조회 할 회원 이름 입력 :");
		String name = sc.next();
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 조회 할수 없습니다");
		}else {			
				Grade g = members[searchIndex];		
				System.out.println("등급 :"+g.getGrade());
				System.out.println("이름 :"+g.getName());
				System.out.println("포인트 :"+g.getPoint());
				System.out.println("보너스 :"+g.getBonus());										
		}					
	}

	@Override
	public void	updateMember() {		
		System.out.println("\n------------회원 정보 수정------------\n");
		System.out.println("수정 할 회원 이름 입력 :");
		String name = sc.next();
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
		}else {
			System.out.println("수정 회원 등급 입력[silver/gold/vip] :");
			String modifyGrade = sc.next();
			System.out.println("수정 회원 이름 입력 :");
			String modifyName = sc.next();
			System.out.println("수정 회원 포인트 입력 :");
			int modifyPoint = sc.nextInt();	
						
			switch(modifyGrade) {
			case "Silver":				
				Silver s = new Silver(modifyGrade,modifyName,modifyPoint);
				members[searchIndex] =s;
				break;
			case "Gold" :
				members[searchIndex] = new Gold(modifyGrade,modifyName,modifyPoint);
				break;
			case "Vip" :
				members[searchIndex] = new Vip(modifyGrade,modifyName,modifyPoint);
				break;
			}
		
		}
	}
		
	

	@Override
	public void deleteMember() {
		// TODO Auto-generated method stub
		System.out.println("\n---------회원 정보 삭제--------\n");
		System.out.println("삭제 할 회원 이름 입력 :");
		String name = sc.next();
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 알수 없습니다.");		
		}else {
			for(int i =searchIndex; i<index-1;i++) {
				members[i] = members[i+1];
			}
			members[--index] = null;
			System.out.println("회원 삭제 완료");
	}
}
	 
	@Override
	public int searchMember(String name) {		
		for (int i=0; i<index;i++) {
			String searchName = members[i].getName();
			if(searchName.equals(name)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void updataMember() {
		// TODO Auto-generated method stub
		
	}
}

