package kr.java.func;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamTest {
	private Scanner sc;

	public CharStreamTest() {
		super();
		sc = new Scanner(System.in);
	}
	public void primaryStream() {
		System.out.print("저장 할 파일명 입력 :");
		String filename = sc.nextLine();
		FileWriter fw = null;
		try {
			//1.파일이 연결되고 (없으면 새로 생성) 스트림이 연결
			fw = new FileWriter(filename);
			System.out.print("["+filename+"]파일에 작성할 내용 입력 :");
			System.out.print("종료는 exit");
			while(true) {
				System.out.print("입력 :");
				String str = sc.nextLine()+"\r\n";
				if(str.equals("exit\r\n")) {
					break;
				}
				//2. 출력메소드 사용
				//문자스트림은 1문자단위로 전송 -> byte배열로 변환할 필요 x 
				fw.write(str);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//3. 자원반환
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void subStream() {
		System.out.print("저장 할 파일명 입력 :");
		String filename = sc.nextLine();
		//보조스트림 사용 시에는 자원반납도 보조스트림으로 수정
		BufferedWriter bw = null;
		try {
			FileWriter  fw = new FileWriter(filename);// 실제 데이터가 전송 될 주 스트림 생성
			bw = new BufferedWriter(fw);//생성된 주 스트림을 이용해서 보조스트림 생성 (주 스트림에 기능 추)
			System.out.println("["+filename+"]에 저장할 내용 입력 :");
			System.out.println("종료는 exit");
			while(true) {
				System.out.print("입력 :");
				String str = sc.nextLine();
				if(str.equals("exit")) {
				break;
				}
				bw.write(str);
				bw.newLine();//보조 스트림에는 개행을 처리해주는 메소드가 존재
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//자원반환도 보조 스트림을 close해서 자동으로 주 스트림도 close
				bw.close();//자원 반환
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void readerTest() {
		System.out.print("로드 할 파일명 입력 :");
		String filename = sc.nextLine();
		//데이터를 읽어 올 보조 스트림 선언
		BufferedReader br = null;
		
		try {
			//파일의 내용을 읽어올 주 스트림 생성
			FileReader fr = new FileReader(filename);//해당 파일이 존재하지 않으면 파일을 생성하지 않고 예외로 빠짐
			//생성된 주 스트림을 이용해서 보조 스트림 생성
			br = new BufferedReader(fr);
			
		
			while(true) {
				//메소드를 통해서 연결된 파일에서 데이터를 읽어옴
				//readLine() : 스트림이 연결된 파일에서 1줄 읽어옴
				//readLine() 을 한번 호출 할때마다 한줄 읽어오고 다음 줄로 이동
				//더이상 읽어올 데이터가 없으면 readLine()은 null을 리턴
				String str = br.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
