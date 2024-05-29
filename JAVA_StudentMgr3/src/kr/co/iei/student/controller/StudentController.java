package kr.co.iei.student.controller;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kr.co.iei.student.vo.Student;

public class StudentController {
	private Scanner sc;
	//학생정보를 HashMap으로 관리
	//-> 관리하고 싶은 데이터는 학생의 이름/나이/주소 -> Student -> HashMap Value가 Student
	//->학생을 관리하고싶은 key는 중복되지않는 데이터여야함 -> 학생이름을 key
	private HashMap<String, Student> students;
	public StudentController() {
		super();
		sc = new Scanner(System.in);
		students = new HashMap<String, Student>();
		Student s1 = new Student("학생1", 20, "서울");
		Student s2 = new Student("학생2", 30, "경기");
		students.put(s1.getName(), s1);
		students.put(s2.getName(), s2);
	}
	public void main() {
		while(true) {
			System.out.println("\n----------학생 관리 프로그램 V3----------\n");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 전체 학생 출력");
			System.out.println("3. 학생 1명 출력");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println("선택 >>");
			int select = sc.nextInt();
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
		System.out.println("\n-------------학생 정보 등록---------------\n");
		System.out.print("등록 할 학생 이름 입력 :");
		String name = sc.next();
		System.out.print("등록 할 학생 나이 입력 :");
		int age = sc.nextInt();
		System.out.print("등록 할 학생 주소 입력 :");
		sc.nextLine();
		String addr = sc.nextLine();
		
		Student s = new Student(name, age, addr);
		//map에 추가
		students.put(name, s);// 이름을 키로해서 학생객체를 저장
		System.out.println("학생 등록 완료");		
	}
	public void printAllStudent() {
		System.out.println("\n------------전체 학생 출력-------------\n");
		System.out.println("이름\t나이\t주소");
		//KeySet() : 맵에서 사용하고있는 모든 키값을 Set형태로 리턴
		//-> students map은 학생이름을 key로 사용중 -> keySet()의 결과는 모든 학생의 이름
		Set<String>names = students.keySet();
		for(String name : names) {
			Student s = students.get(name);
			System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getAddr());
		}
	}
	public void printOneStudent() {
		System.out.println("--------학생 1명 출력---------");
		System.out.print("조회 할 학생 이름 입력 :");
		String name = sc.next();
		//이름으로 데이터가 어디있는지 찾는로직 -> 이름이 바로 키로 사용중 -> key를 통해서 판단
		//containsKey(key) : 해당 이름을 키로 사용중인지 체크(이름을 가진 학생이 있는지 조회)
		boolean check = students.containsKey(name);
		if(check) {
			Student s =	students.get(name);
			System.out.println("이름 :"+s.getName());
			System.out.println("나이 :"+s.getAge());
			System.out.println("주소 :"+s.getAddr());		
		}else {
			System.out.println("학생 정보를 조회할 수 없습니다.");
		}
	}
	public void updateStudent() {
		System.out.println("\n--------학생 정보 수정--------\n");
		System.out.println("수정 할 학생 이름 입력 :");
		String name = sc.next();
		Student s = students.get(name);
		if(s != null) {
			System.out.print("수정 학생 이름 입력 :");
			String modifyName = sc.next();
			System.out.print("수정 학생 나이 입력 :");
			int modifyAge = sc.nextInt();
			System.out.print("수정 학생 주소 입력 :");
			sc.nextLine();
			String modifyAddr = sc.nextLine();
			//1) 기존객체에 setter로 변경
			//s.setName(modifyName);
			//s.setAge(modifyAge);
			//s.setAddr(modifyAddr);
			
			//2)새로운 객체를 만들어서 변경
			Student student = new Student(modifyName, modifyAge, modifyAddr);
			students.remove(name);
			students.put(modifyName, student);
			/*
			if(!name.equals(modifyName)) {
				
			}*/
			System.out.println("학생 정보 수정 완료");
		}else {
			System.out.println("학생 정보를 조회할 수 없습니다.");
		}
	}
	public void deleteStudent() {
		System.out.println("\n-----------학생 정보 삭제-----------\n");
		System.out.println("삭제 할 학생 이름 입력 :");
		String name = sc.next();
		//remove(key) : key에 해당하는 데이터를 삭제 삭제된 value를 리턴
		//내부동작순서 : get(key) -> map에서 삭제 -> get한 결과를 리턴
		Student s = students.remove(name);
		if(s == null) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
			}else {
				System.out.println("삭제 완료");
			}
		/*
		if(students.containsKey(name)) {
			
			students.remove(name);
			System.out.println("학생 정보 삭제 완료");
		}else {
			System.out.println("학생 정보를 조회할 수 없습니다.");
		}*/
	}
}
