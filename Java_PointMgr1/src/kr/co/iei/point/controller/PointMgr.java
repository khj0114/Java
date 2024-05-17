package kr.co.iei.point.controller;


import java.util.Scanner;

import kr.co.iei.point.vo.Silver;


	public class PointMgr {
		private Scanner sc;
		private Silver[]members;
		private int index;
		
		public PointMgr() {
			members = new Silver[10];
			sc = new Scanner(System.in);
			index = 0;
			Silver s1 = new Silver();
			s1.setGrade("실버");
			s1.setName("회원1");
			s1.setPoint(1000);
	
			members[index] = s1;
			index++;
			Silver s2 = new Silver("골드","회원2",+100);
			members[index] = s2;
			index++;
		}
		
		public void main() {
			while(true) {
				System.out.println("\n =====포인트 관리 프로그램v1=====");
				System.out.println("1.회원 정보 등록 ");
				System.out.println("2.전체 회원 조회 ");
				System.out.println("3.회원 1명 조회 ");
				System.out.println("4.회원 정보 수정 ");
				System.out.println("5.회원 삭제 ");
				System.out.println("0.프로그램 종료");
				System.out.print("선택 >");
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
					updateMember();
				case 5:
					 deleteMember();
					break;
				case 0:
					System.out.println("시스템을 종료합니다.");
					return;
				}//switch문 종료
			}//while문 종료
		}//main문 종료
		
		
		public void insertMember() {
			System.out.println("\n========회원 정보 등록==========\n");
			System.out.print("등록할 회원 등급입력 :");
			String grade = sc.next();
			System.out.print("등록할 회원 이름입력 :");
			String name = sc.next();
			System.out.print("등록할 회원 포인트 입력 :");
			int point = sc.nextInt();
			
			Silver s = new Silver(grade, name, point);
			members[index++] = s;
			System.out.println("회원 정보 등록완료!");
		}
		
		public void printAllMember() {
			System.out.println("\n====전체 회원 출력====\n");
			System.out.println("등급\t이름\t포인트\t보너스");
			System.out.println("--------------------");
			
			for(int i=0; i<index; i++) {
				Silver s = members[i];
				System.out.println(s.getGrade()+"\t"+s.getName()+"\t"+s.getPoint()+"\t"+s.getBouns());
			}
		}
		
		public void printOneMember() {
			System.out.println("=====회원 정보 출력=====");
			System.out.println("조회 할 회원 이름 입력 :");
			
			String name = sc.next();
			int searchIndex = searchMember(name);
			
			if(searchIndex == -1) {
				System.out.println("회원 정보를 조회할 수 없습니다.");
			}else {
				Silver s = members[searchIndex];
				System.out.println("회원 등급 :"+s.getGrade());
				System.out.println("회원 이름 :"+s.getName());
				System.out.println("회원 포인트 :"+s.getPoint());
				System.out.println("회원 보너스 :"+s.getBouns());
		}
		
	}
		
		public void updateMember() {
			System.out.println("\n=====회원 정보 수정=====\n");
			System.out.println("수정할 회원 이름 입력 :");
			String name = sc.next();
			int searchIndex = searchMember(name);
	 		
			if(searchIndex == -1) {
				System.out.println("회원 정보를 조회 할 수 없습니다.");
			}else {
				System.out.println("수정 할 회원 등급 입력 :");
				String modifyGrade = sc.next();
				System.out.println("수정 할 회원 이름 입력 :");
				String modifyName = sc.next();
				System.out.println("수정 할 회원 포인트 입력 :");
				int modifyPoint = sc.nextInt();
				  Silver s = members[searchIndex];
				  s.setGrade(modifyGrade);
				  s.setName(modifyName);
				  s.setPoint(modifyPoint); 
				 //members[searchIndex].setPoint(modifyPoint);
				/*Silver s= new Silver(modifyGrade,modifyName,modifyPoint);
				members[searchIndex] = s;*/
				System.out.println("정보 수정 완료!");
			}
		}
		public void deleteMember() {
			System.out.println("\n=====회원 정보 삭제=====\n");
			System.out.println("삭제할 회원 이름 입력 :");
			String name = sc.next();
			int searchIndex = searchMember(name);
			if(searchIndex == -1) {
				System.out.println("회원 정보를 조회 할 수 없습니다.");
			}else {
				for(int i=searchIndex; i<index-1; i++) {
					members[i] = members[i+1];
				}
				members[index-1] = null;
				index--;
				System.out.println("삭제 완료");
			}
		}
		public int searchMember(String name) {
			
			for(int i=0; i<index; i++) {
				Silver s = members[i];
				String searchName = s.getName();
				if(name.equals(name)) {
					return i;
					
				}
			}
			return -1;
					}
	}



