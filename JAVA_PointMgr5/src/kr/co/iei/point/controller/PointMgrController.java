package kr.co.iei.point.controller;
 
import java.util.ArrayList;

import kr.co.iei.point.model.vo.Gold;
import kr.co.iei.point.model.vo.Grade;
import kr.co.iei.point.model.vo.Silver;
import kr.co.iei.point.model.vo.Vip;
import kr.co.iei.pointMgr.view.PointMgrView;
public class PointMgrController {

	private ArrayList<Grade> members;
	private PointMgrView view;
	
	public PointMgrController() {
		super();
		view = new PointMgrView();
		members = new ArrayList<Grade>();
		Grade v = new Silver ("silver", "회원1", 1000);
		Grade v1 = new Gold("gold", "회원2", 2000);
		Grade v2 = new Vip("vip", "회원3", 3000);
		members.add(v);
		members.add(v1);
		members.add(v2);
		
	}
	public void main() {
		while(true) { 	
			int select = view.main();
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
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				return;
			
			}
		}
	}
	public void insertMember() {
		Grade v = view.insertMember();
		members.add(v);
		view.completeMessage("등록");
	}
	
	public void printAllMember() {
		view.printAllMember(members);
	}
	
	public void printOneMember() {
		String name = view.getName("조회");
		int searchIndex = searchMembers(name);
		if(searchIndex == -1) {
			view.noSearchMember();
		}else {
			Grade v = members.get(searchIndex);
			view.printOneMember(v);
		}
	}
	public void updateMember() {
		String name = view.getName("수정");
		int searchIndex = searchMembers(name);
		if(searchIndex == -1) {
			view.noSearchMember();
		}else {
			Grade v = view.updateMember();
			//1)setter방식 -> 등급이 변경된 경우 객체가 바뀌어야하는데 바뀌지 않아서 이전 보너스율을 사용
			//-> 객체가 변경되어야 보너스가 정상적용되므로 사용불가능한 방식
			/*
			Grade modifyGrade = members.set(searchIndex, v);
			modifyGrade.setGrade(v.getGrade());
			modifyGrade.setName(v.getName());
			modifyGrade.setPoint(v.getPoint());
			*/
			//2) 리스트의 해당 위치에 새로 받은 객체로 수정
			members.set(searchIndex, v);
			view.completeMessage("수정");
		}
	}
	public void deleteStudent() {
		String name = view.getName("삭제");
		int searchIndex = searchMembers(name);
		if(searchIndex == -1) {
			view.noSearchMember();
		}else {
			members.remove(searchIndex);
			view.completeMessage("삭제");
		}
	}
			
	private int searchMembers(String name) {
		for(int i=0; i<members.size();i++) {
			Grade v = members.get(i);
			String searchName = v.getName();
			if(name.equals(searchName)) {
				return i;
		
			}
		}
		return -1;
	}
}
