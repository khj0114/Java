package kr.java.func;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {
	private Scanner sc;

	public ByteStreamTest() {
		super();
		sc = new Scanner(System.in);
	}
	public void primaryStream() {
		//1.스트림 생성 
		//2.메소드를 통한 입력 or 출력
		//3.자원 반환
		System.out.print("저장할 파일 이름 입력 :");
		String filename = sc.nextLine();
		//0.자원 반환할 객체를 미리 선언
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filename);//1.스트림 생성
			System.out.println("["+filename+"]에 파일을 저장할 내용을 입력하세요.");
			System.out.println("exit를 입력하면 종료됩니다.");
			while(true) {
				System.out.print("내용 입력 :");
				String str = sc.nextLine()+"\r\n"; //<- 엔터
				if(str.equals("exit\r\n")) {
					break;
				}
				//FileOutputStream은 Byte스트림으로 데이터를 내보낼때 byte단위 내보내야함
				//문자열을 바이트 스트림으로 내보내기에는 너무 큼 -> byte단위로 쪼갬
				byte[] arr = str.getBytes();
				fos.write(arr);//스트림을 통해서 파일레 데이터 내보내기 ->2.메소드를 통한 출력
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				//3.자원반환
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
