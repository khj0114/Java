package kr.co.iei.point.controller;

import java.util.Scanner;

import kr.co.iei.point.vo.Silver;
import kr.co.iei.point.vo.Gold;
import kr.co.iei.point.vo.SearchResult;
import kr.co.iei.point.vo.Vip;


public class pointMgr {
	private Scanner sc;
	private Silver[] sMembers;
	private int sIndex;
	
	private Gold[] gMembers;
	private int gIndex;
	
	private Vip[] vMembers;
	private int vIndex;
	//searchMember2()에서 값을 변경, deleteMember()에서 해당 값을 확인
	private String searchGrade; 
	public pointMgr() {
		super();
		sc = new Scanner(System.in);
		sMembers = new Silver[10];
		sIndex = 0;
		
		gMembers = new Gold[10];
		gIndex = 0;
		
		vMembers = new Vip[10];
		vIndex = 0;
		
		//셈플데이터 저장
		Silver s1 = new Silver("silver","회원1",1000);
		sMembers[sIndex] = s1;
		sIndex++;
		sMembers[sIndex] = new Silver("silver", "회원2", 2000);
		sIndex++;
		sMembers[sIndex++] = new Silver("silver", "회원3", 3000);
		gMembers[gIndex++] = new Gold("gold", "회원4", 1000);
		gMembers[gIndex++] = new Gold("gold", "회원5",2000);
		vMembers[vIndex++] = new Vip("vip", "회원6",1000);
		
	}
	public void main() {
		while(true) {
			System.out.println("\n---------회원 관리 프로그램v2----------\n");
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
		System.out.println("\n------------회원 정보 등록----------\n");
		System.out.println("회원 등급 입력[silver,gold,vip] : ");
		String grade = sc.next();
		System.out.println("이름 입력 :");
		String name = sc.next();
		System.out.println("포인트 입력 :");
		int point = sc.nextInt();
		//입력받은 등급이 silver면 Silver객체 생성해서 sMembers 추가
		//입력받은 등급이 gold면 Gold객체 생성해서 gMembers 추가
		//입력받은 등급이 vip면 Vip객체 생성해서 vMembers 추가
		switch(grade) {
		case "silver" :
			Silver s = new Silver(grade, name, point);
			sMembers[sIndex] = s;
			sIndex++;
			break;
		case "gold" :
			gMembers[gIndex] =  new Gold(grade, name, point);
			gIndex++;
			break;
		case "vip" :
			vMembers[vIndex++] =  new Vip(grade, name, point);
			break;
		default :
			System.out.println("등급을 똑바로 입력해");
			return;
		}
		System.out.println("회원 등록 완료");
	}
	
	public void printAllMember() {
		System.out.println("\n-----------전체 회원 정보 출력-----------\n");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("----------------------------");
		//실버등급 회원 출력 ->sMembers
		for(int i=0;i<sIndex;i++) {
			Silver s = sMembers[i];
			System.out.println(s.getGrade()+"\t"+s.getName()+"\t"+s.getPoint()+"\t"+s.getBonus());
		}//골드 등급 회원을 출력 ->gMembers
		for(int i=0;i<gIndex;i++) {
			System.out.println(gMembers[i].getGrade()+"\t"+gMembers[i].getName()+"\t"+gMembers[i].getPoint()+"\t"+gMembers[i].getBonus());
		}//vip등급 회원을 출력 -> vMembers 출력
		for(int i=0;i<vIndex;i++) {
			Vip v = vMembers[i];
			System.out.println(v.getGrade()+"\t"+v.getName()+"\t"+v.getPoint()+"\t"+v.getBonus());
		}
		
	}
	public void printOneMember() {
		System.out.println("\n--------------회원 정보 조회-----------\n");
		System.out.println("조회 할 회원 이름 입력 :");
		String name = sc.next();
		int searchIndex = searchMember1(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
		}else {
			if(searchIndex/100 == 1) {
				//vMembers에 있는 경우
				Vip v = vMembers[searchIndex-100];
				System.out.println("등급 :"+v.getGrade());
				System.out.println("이름 :"+v.getName());
				System.out.println("포인트 :"+v.getPoint());
				System.out.println("보너스 : "+v.getBonus());
			}else if (searchIndex/10 == 1) {
				//gMembers에 있는 경우
				Gold g = gMembers[searchIndex-10];
				System.out.println("등급 :"+g.getGrade());
				System.out.println("이름 :"+g.getName());
				System.out.println("포인트 :"+g.getPoint());
				System.out.println("보너스 :"+g.getBonus());
			}else {
				//sMembers에 있는 경우
				Silver s = sMembers[searchIndex];
				System.out.println("등급 :"+s.getGrade());
				System.out.println("이름 :"+s.getName());
				System.out.println("포인트 :"+s.getPoint());
				System.out.println("보너스 :"+s.getBonus());
			}
		}
	}
	public void updataMember() {
		System.out.println("\n------------회원 정보 수정------------\n");
		System.out.println("수정 할 회원 이름 입력 :");
		String name = sc.next();
		SearchResult result = searchMember3(name);
		if(result == null) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
		}else {
			System.out.println("수정 회원 등급 입력[silver/gold/vip] :");
			String modifyGrade = sc.next();
			System.out.println("수정 회원 이름 입력 :");
			String modifyName = sc.next();
			System.out.println("수정 회원 포인트 입력 :");
			int modifyPoint = sc.nextInt();			
			
			switch(result.getType()) {
			case "silver" :
				for(int i=result.getSearchIndex();i<sIndex-1;i++) {
					sMembers[i] = sMembers[i+1];
					
				}
				sMembers[--sIndex] = null;
				break;
			case "gold":
				for(int i=result.getSearchIndex();i<gIndex-1;i++) {
					gMembers[i] = gMembers[i+1];
				}
				gMembers[--gIndex] = null;
				break;
			case "vip" :
				for(int i=result.getSearchIndex();i<vIndex-1;i++) {
					vMembers[i] = vMembers[i+1];
				}
				vMembers[--vIndex] = null;
				break;
			}
			
			
			switch(modifyGrade) {
			case "silver" :
				Silver s = new Silver(modifyGrade,modifyName,modifyPoint);
				//s.setGrade(modifyGrade);
				//s.setName(modifyName);
				//s.setPoint(modifyPoint);
				sMembers[sIndex++] = s;
				break;
			case "gold" :
				Gold g = new Gold(modifyGrade,modifyName,modifyPoint);
				//g.setGrade(modifyGrade);
				//g.setName(modifyName);
				//g.setPoint(modifyPoint);
				gMembers[gIndex++] = g;
				break;
			case "vip" :
				Vip v = new Vip(modifyGrade,modifyName,modifyPoint);
				//v.setGrade(modifyGrade);
				//v.setName(modifyName);
				//v.setPoint(modifyPoint);
				vMembers[vIndex++] = v;
				break;
			}
			System.out.println("수정 완료");			
		}					
	}

	public void deleteMember() {
		System.out.println("\n---------회원 정보 삭제--------\n");
		System.out.println("삭제 할 회원 이름 입력 :");
		String name = sc.next();
		int searchIndex = searchMember2(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		}else {
			switch(searchGrade) {
			case "silver":
				for(int i=searchIndex; i<sIndex-1;i++) {
					sMembers[i] = sMembers[i+1];
				}
				sMembers[sIndex-1] = null;
				sIndex--;
				break;
			case "gold":
				for(int i=searchIndex; i<gIndex-1;i++) {
					gMembers[i] = gMembers[i+1];
				}
				gIndex--;
				gMembers[gIndex] = null;
				break;
			case "vip" :
				for(int i=searchIndex; i<vIndex-1; i++) {
					vMembers[i] = vMembers[i+1];
				}
				vMembers[--vIndex] = null;
				break;
			}
		}
		
	}
	
	public int searchMember1(String name) {
		for (int i=0; i<sIndex;i++) {
			Silver s = sMembers[i];
			String searchName = s.getName();
			if(searchName.equals(name)) {
				return i;
			}
		}
		for (int i=0; i<gIndex;i++) {
			String searchName = gMembers[i].getName();
			if(searchName.equals(name)) {
				return i + 10;
			}
		}
		for(int i=0; i<vIndex; i++) {
			if(vMembers[i].getName().equals(name)) {
				return i + 100;
			}
		}
		return -1;
	}
	
	public int searchMember2(String name) {
		String searchGrade = null;
		for(int i=0; i<sIndex; i++) {
			String searchName = sMembers[i].getName();
			if(searchName.equals(name)) {
				searchGrade = "silver";
				return i;
			}
		}
		for(int i=0; i<gIndex; i++) {
			String searchName = gMembers[i].getName();
			if(searchName.equals(name)) {
				searchGrade = "gold";
				return i;
			}
		}
		for(int i=0; i<vIndex; i++) {
			String searchName = vMembers[i].getName();
			if(searchName.equals(name)) {
				searchGrade = "vip";
				return i;
			}
		}
		return -1;
	}
	public SearchResult searchMember3(String name) {
		for(int i=0; i<sIndex; i++) {
			String searchName = sMembers[i].getName();
			if(searchName.equals(name)) {
				SearchResult result = new SearchResult();
				result.setType("silver");
				result.setSearchIndex(i);
				return result;
			}
		}
		for(int i=0; i<gIndex; i++) {
			String searchName = gMembers[i].getName();
			if(searchName.equals(name)) {
				SearchResult result = new SearchResult("gold",i);
				return result;
			}
		}
		for(int i=0;i<vIndex;i++) {
			String searchName = vMembers[i].getName();
			if (searchName.equals(name)) {
				SearchResult result = new SearchResult("vip",i);
				return result;
				
			}
		}
		return null;
	}						
}
