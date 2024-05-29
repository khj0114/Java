package kr.co.iei.point.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

import kr.co.iei.point.model.vo.Grade;
import kr.co.iei.point.view.PointView;

public class PointMgr {
	private PointView view;
	
	public PointMgr() {
		super();
		view = new PointView();
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
				deleteMember();
				break;
			case 0:
				return;
			}
		}
	}	
	public void insertMember() {
		Grade g = view.insertMember();
		ArrayList<Grade> list = loadAllMembers();
		list.add(g);
		saveMembers(list);
		view.completeMessage("등록");
	}
	public void printAllMember() {
		ArrayList<Grade> list = loadAllMembers();
		view.printAllMember(list);
	}
	public void printOneMember() {
		String name = view.getName("조회");
		ArrayList<Grade> list = loadAllMembers();
		int searchIndex = searchMember(name, list);
		if(searchIndex == -1) {
			view.noSearchMember();
		}else {
			Grade g = list.get(searchIndex);
			view.printOneMember(g);
		}
	}
	public void updateMember() {
		String name = view.getName("수정");
		ArrayList<Grade> list = loadAllMembers();
		int searchIndex = searchMember(name, list);
		if(searchIndex == -1) {
			view.noSearchMember();
		}else {
			Grade g = view.updateMember();
			list.set(searchIndex, g);
			saveMembers(list);
			view.completeMessage("수정");
		}
	}
	public void deleteMember() {
		String name = view.getName("삭제");
		ArrayList<Grade> list = loadAllMembers();
		int searchIndex = searchMember(name, list);
		if(searchIndex == -1) {
			view.noSearchMember();
		}else {
			list.remove(searchIndex);
			saveMembers(list);
			view.completeMessage("삭제");
		}
	}
	public int searchMember(String name, ArrayList<Grade> list) {
		for(int i=0; i<list.size(); i++) {
			Grade g = list.get(i);
			String searchName = g.getName();
			if(name.equals(searchName)); {				
				return i;
			}
		}
		return -1;
	}
	
	public ArrayList<Grade> loadAllMembers() {
		ArrayList<Grade> list = null;
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("backup.txt");
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			list = (ArrayList<Grade>)obj;
		} catch (FileNotFoundException e) {
			list = new ArrayList<Grade>();
			saveMembers(list);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ois != null) {
					ois.close();
				}					
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public void saveMembers(ArrayList<Grade> list) {
		ObjectOutputStream oos =null;
		try {
			FileOutputStream fos = new FileOutputStream("backup.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
