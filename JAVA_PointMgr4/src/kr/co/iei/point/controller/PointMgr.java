package kr.co.iei.point.controller;


import java.util.Scanner;



import kr.co.iei.point.vo.Gold;
import kr.co.iei.point.vo.Grade;

import kr.co.iei.point.vo.Silver;
import kr.co.iei.point.vo.Vip;
import java.util.ArrayList;
	
	public class PointMgr {
		private Scanner sc;	
		private ArrayList<Grade> members;
		
		public PointMgr() {
			super();
			sc = new Scanner(System.in);
			members = new ArrayList<Grade>();

			members.add(new Silver ("Silver","회원1",1000));
			members.add(new Gold ("Gold","회원2",3000));
			members.add(new Vip ("Vip","회원3",5000));
			
		}
		
		
		public void main() {
			while(true) {
				System.out.println("\n----------회원 관리 프로그램v4-----------\n");
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
		public void insertMember() {
			System.out.println("\n---------회원 정보 등록---------\n");
			System.out.print("회원 등급 입력[Silver,Gold,Vip] :");
			String grade = sc.next();
			
			System.out.print("이름 입력 :");
			String name = sc.next();
			
			System.out.print("포인트 입력 :");
			int point = sc.nextInt();
			
			switch(grade) {
			case "Silver" :
				members.add(new Silver(grade,name,point));
				break;
			case "Gold" :
				members.add(new Gold(grade,name,point));
				break;
			case "Vip" :
				members.add(new Vip(grade,name,point));
				break;
			default :
				System.out.println("등급을 똑바로 입력해주세요.");
				return;
			}
			System.out.println("회원 등록 완료");
		}
		
		public void printAllMember() {
			System.out.println("\n-----------전체 회원 정보 출력-----------\n");
			System.out.println("등급\t이름\t포인트\t보너스");
			System.out.println("----------------------------");
			
			for(Grade g:members) {
				System.out.println(g.getGrade()+"\t"+g.getName()+"\t"+g.getPoint()+"\t"+g.getBonus());
			}
		}
		public void printOneMember() {
			System.out.println("\n--------------회원 정보 조회-----------\n");
			System.out.print("조회 할 회원 이름 입력 :");
			String name = sc.next();
			int searchIndex = searchMember(name);
			if(searchIndex == -1) {
				System.out.println("회원 정보를 조회 할수 없습니다");
		}else {
			Grade g = members.get(searchIndex);
			System.out.println("등급 :"+g.getGrade());
			System.out.println("이름 :"+g.getName());
			System.out.println("포인트 :"+g.getPoint());
			System.out.println("보너스 :"+g.getBonus());
			
		}
	}
		
		public void updataMember() {
			System.out.println("\n------------회원 정보 수정------------\n");
			System.out.println("수정 할 회원 이름 입력 :");
			String name = sc.next();
			int searchIndex = searchMember(name);
			if(searchIndex == -1) {
				System.out.println("회원 정보를 조회할 수 없습니다.");
		}else {
			System.out.println("수정 회원 등급 입력 :");
			String modifyGrade = sc.next();
			System.out.println("수정 회원 이름 입력 :");
			String modifyName = sc.next();
			System.out.println("수정 회원 포인트 입력 :");
			int modifyPoint = sc.nextInt();	
			
			switch(modifyGrade) {
			case "Silver" :
				members.add(new Silver(modifyGrade, modifyName, modifyPoint));
				break;
			case "Gold" :
				members.add(new Gold(modifyGrade, modifyName, modifyPoint));
				break;
			case "Vip" : 
				members.add(new Vip(modifyGrade, modifyName, modifyPoint));
				break;
			}
		}						
	}		
			public void deleteMember() {
				System.out.println("\n---------회원 정보 삭제 ----------\n");
				System.out.print("삭제 할 회원 이름 입력 :");
				String name = sc.next();
				int searchIndex = searchMember(name);
				if(searchIndex == -1) {
					System.out.println("회원 정보를 조회할 수 없습니다.");
			}else {
				members.remove(searchIndex);
				System.out.println("삭제 완료");
				
			}			
		}
	private int searchMember(String name) {
			for(int i=0; i<members.size();i++) {
				Grade g = members.get(i);
				String searchName = g.getName();
				if(name.equals(searchName)); {
					return i;
				}
			}
			return -1;
		}
	}
