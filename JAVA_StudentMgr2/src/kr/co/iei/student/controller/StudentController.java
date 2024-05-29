package kr.co.iei.student.controller;

import java.util.Scanner;
import java.util.ArrayList;
import kr.co.iei.student.vo.Student;

public class StudentController {

	private Scanner sc;
	private ArrayList<Student> students;
	//private Student[] students;
	//private int index;
	public StudentController() {
	super();
	sc = new Scanner(System.in);
	students = new ArrayList<Student>();
	Student s1 = new Student("학생1",20,"서울");
	Student s2 = new Student("학생2",30,"부산");
	
	students.add(s1);
	//students[index++] = s2;
	students.add(s2);
	//students[index++] = new Student("학생3",40,"경기");
	Student s3 = new Student("학생3",40,"경기");
	
	}
	public void main() {
		while(true)  {
			System.out.println("\n---------학생 관리 프로그램----------\n");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 정보 출력(전체)");
			System.out.println("3. 학생 정보 출력");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 >>");
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
		System.out.println("\n-------------학생 정보 등록-------------\n");
		System.out.print("등록 할 학생 이름 입력 :");
		String name = sc.next();
		System.out.print("등록 할 학생 나이 입력 :");
		int age = sc.nextInt();
		System.out.print("등록 할 학생 주소 입력 :");
		sc.nextLine();
		String addr = sc.nextLine();
		//1) 빈 student 객체 생성한 후 setter로 값을 대입
		/*
		  student s = new student();
		s.setName(name);
		s.setAge(age);
		s.setAddr(addr);
		*/
		//2) 매개변수 있는 생성자를 통해서 student 객체를 만들면서 값을 바로 대입
		Student s = new Student (name, age, addr);
		
		//배열사용 코드
		//students[index] = s;		//배열의 학생객체를 저장
		//index++;					//다음에 넣을 배열 위치 조정
		students.add(s);
		System.out.println("학생 정보 등록 완료!");
	}
	
	public void printAllStudent() {
		System.out.println("\n----------전체 학생 출력--------------\n");
		System.out.println("이름\t나이\t주소");
		System.out.println("--------------------------------------");
		//배열사용 코드
		/*for(int i=0; i<index;i++) {
			Student s = students[i];
			System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getAddr());
		
		for(int i=0; i<students.size();i++) {
			Student s = students.get(i);
			System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getAddr());
		*/
		for(Student s:students) {
			System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getAddr());
		}
	}

		
	public void printOneStudent() {
		System.out.println("--------학생 1명 출력---------");
		System.out.print("조회 할 학생 이름 입력 :");
		String name = sc.next();
			int searchIndex = searchStudent(name);
			if(searchIndex == -1) {
				System.out.println("학생 정보를 조회할 수 없습니다.");
			}else {
				Student s = students.get(searchIndex);
				System.out.println("학생 이름 :"+s.getName());
				System.out.println("학생 나이 :"+s.getAge());
				System.out.println("학생 주소 :"+s.getAddr());
			}
		}
	

	public void updateStudent() {
		System.out.println("\n-----------학생 정보 수정------------\n");
		System.out.print("정보를수정할 학생 이름 입력 :");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			System.out.println("학생 정보를 수정할 수 없습니다.");
		}else {
			System.out.println("수정 할 이름 입력 :");
			String modiftName = sc.next();
			System.out.println("수정 할 나이 입력 :");
			int modifyAge = sc.nextInt();
			System.out.println("수정 할 주소 입력 :");
			sc.nextLine();
			String modifyAddr = sc.nextLine();
			//1) 해당 인덱스에 있는 객체 정보를 수정
			/*
			  Student s = students[searchIndex];
			s.setName(modifyName);//변수에 직접 수정은 불가능하고 setter 이용해서 수정
			s.setAge(modifyAge);
			s.setAddr(modifyAddr);
			 */
			//2) 수정정보로 새로 만든 Student 객체를 해당 인덱스에 새로 대입
			students.add(new Student(modiftName, modifyAge, modifyAddr));
			//students[searchIndex] = s;
			students.remove(searchIndex);
			System.out.println("정보 수정 완료");
		}	
	}	
	public void deleteStudent() {
		System.out.println("\n---------학생 정보 삭제 ----------\n");
		System.out.print("삭제 할 학생 이름 입력 :");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			System.out.println("학생 정보를 조회할 수 없습니다.");
		}else {
			//배열인경우 삭제 로직
			/*
			for(int i=searchIndex;i<index-1;i++) {
				students[i] = students[i+1];			
			}
			students[index-1] = null;
			index--;*/
			students.remove(searchIndex);
			System.out.println("삭제 완료");
		}
	}
	public int searchStudent(String name) {	
		//int searchIndex = -1;
		for(int i=0; i<students.size(); i++) {
			//Student s = students[i];
			Student s =students.get(i);
			String searchName = s.getName();
			if(name.equals(searchName)) {		
				//searchIndex = i;
				//break;
				return i;
			}
		}
		//return searchIndex;
		return -1;	
	}
}