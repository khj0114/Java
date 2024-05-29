package kr.co.iei.pointMgr.view;

import java.util.Scanner;
import java.util.ArrayList;

import kr.co.iei.point.model.vo.Gold;
import kr.co.iei.point.model.vo.Grade;
import kr.co.iei.point.model.vo.Silver;
import kr.co.iei.point.model.vo.Vip;




public class PointMgrView {
	private Scanner sc;
	
	public PointMgrView() {
		super();
		sc = new Scanner(System.in);
	}
	public int main() {
		System.out.println("\n----------회원 관리 프로그램v4-----------\n");
		System.out.println("1.회원 정보 등록");
		System.out.println("2.전체 회원 출력");
		System.out.println("3.회원 1명 출력");
		System.out.println("4.회원 정보 수정");
		System.out.println("5.회원 정보 삭제");
		System.out.println("0.프로그램 종료");
		System.out.print("선택>");
		int select = sc.nextInt();
		return select;
		
	}
	public Grade insertMember() {
		System.out.println("\n---------회원 정보 등록---------\n");
		System.out.print("회원 등급 입력[Silver,Gold,Vip] :");
		String grade = sc.next();
		
		System.out.print("이름 입력 :");
		String name = sc.next();
		
		System.out.print("포인트 입력 :");
		int point = sc.nextInt();
		
		switch(grade) {
		case "Silver" :
			Grade v = new Silver(grade,name,point);
			return v;
		case "Gold" :
			Grade v1 = new Gold(grade,name,point);
			return v1;
		case "Vip" :
			Grade v2 = new Vip(grade,name,point);
			return v2;
		/*default :
			return null;*///디폴트 쓸거면 스위치문 안에서 사용가능
		}
		return null;//디폴트 안쓸거면 스위치문 나와서 리턴
	}	
	public void printAllMember(ArrayList<Grade>members) {
		System.out.println("\n-----------전체 회원 정보 출력-----------\n");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("----------------------------");
		/*for(int i=0; i<members.size(); i++) {
			Grade v = members.get(i);
			System.out.println(v.getGrade()+"\t"+v.getName()+"\t"+v.getPoint()+"\t"+v.getBonus());
		}*/
		for(Grade v : members) {
			System.out.println(v.getGrade()+"\t"+v.getName()+"\t"+v.getPoint()+"\t"+v.getBonus());
		}
	}	
	public String getName(String str) {
		System.out.println("\n----------회원 정보"+str+" ---------\n");
		System.out.println(str+" 할 회원 이름 입력 :");
		String name = sc.next();
		return name;
	}
	public void noSearchMember() { 
		System.out.println("회원 정보를 찾을 수 없습니다.");
	
	}
	public void printOneMember(Grade v) {
		System.out.println("등급 :"+v.getGrade());
		System.out.println("이름 :"+v.getName());
		System.out.println("포인트 :"+v.getPoint());
		System.out.println("보너스 :"+v.getBonus());
	}

	public Grade updateMember() {
		System.out.println("수정 할 등급 입력[Silver,Gold,Vip] :");
		String grade = sc.next();
		System.out.println("수정 할 이름 입력 :");
		String name = sc.next();
		System.out.println("수정 할 포인트 입력 :");
		int point = sc.nextInt();
		Grade v =null;
		switch(grade) {
		case "Silver" :
			v = new Silver(grade,name,point);
			break;
		case "Gold" :
			v = new Gold(grade,name,point);
			break;
		case "Vip" :
			v = new Vip(grade,name,point);
			break;
	}
		return v;
}

	public void completeMessage(String str) {
		System.out.println("회원 정보 "+str+"완료!");
	
	}
}