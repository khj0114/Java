package kr.co.iei.student.comtroller;

import java.util.ArrayList;

import kr.co.iei.student.model.vo.Student;
import kr.co.iei.student.view.StudentView;

public class Studentcontroller {
	private ArrayList<Student> students;
	private StudentView view;
	public Studentcontroller() {
		super();
		view = new StudentView();
		students = new ArrayList<Student>();
		students.add(new Student("학생1", 20, "서울"));
		students.add(new Student("학생2", 21, "경기"));
		students.add(new Student("학생3", 22, "인천"));
	}	
	public void main() {
		while(true) { 	
			int select = view.main();
			switch(select) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				return;
			
			}
		}
	}
	
	public void insertStudent() {
		//view를 통해서 학생정보를 입력받고 결과를 Student타입으로 받아옴
		Student s = view.insertStudent();
		//받아온 데이터를 list에 추가
		students.add(s);
		view.completeMessage("등록");
	}
	public void printAllStudent() {
		//매개변수로 출력할 데이터를 전송
		view.printAllStudent(students);
	}
	public void printOneStudent() {
		String name = view.getName("조회");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.noSearchStudent();
		}else {
			Student s = students.get(searchIndex);
			view.printOneStudent(s);
		}
	}
	public void updateStudent() {
		String name = view.getName("수정");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.noSearchStudent();
		}else {
			Student s = view.updateStudent();
			
			/*1) 기존 객체 정보 수정
			Student student = students.get(searchIndex);
			student.setName(s.getName());
			student.setAge(s.getAge());
			student.setAddr(s.getAddr());
			*/
			//2)새로 입력받은 객체로 리스트
			students.set(searchIndex, s);
			view.completeMessage("수정");
		}
	}
	
	public void deleteStudent() {
		String name = view.getName("삭제");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.noSearchStudent();
		}else {
			students.remove(searchIndex);
			view.completeMessage("수정");
		}
	}
	
	
	public int searchStudent(String name) {
		for(int i=0; i<students.size();i++) {
			Student s = students.get(i);
			String studentName = s.getName();
			if(name.equals(studentName)) {
				return i;
			}
		}
		return -1;
	}

}
