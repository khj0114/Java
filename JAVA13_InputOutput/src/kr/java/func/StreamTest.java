package kr.java.func;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StreamTest {
	//quiz.txt파일을 읽어서 quiz.gif로 내보내기
	public void test1() {
		//보조 스트림을 사용하는 버전
		//quiz.txt파일을 읽어옴
		//읽어온다 -> InputStream, Reader -> 읽어올 데이터가 긴 문자열 -> Reader
		//파일을 읽어올 보조 스트림 선언
		BufferedReader br = null;
		//quiz.gif파일로 내보냄
		//내보냄 -> OutputStream, Writer -> 내보낼 데이터가 이미지 -> OutputStream
		//파일을 내보낼 보조 스트림 선언
		BufferedOutputStream bos = null;
		
		try {
			//파일 내용을 읽어오기위한 주 스트림 생성
			FileReader fr = new FileReader("quiz.txt");
			//생성된 주 스트림을 이용해서 보조 스트림 객체 생성
			br = new BufferedReader(fr);
			//quiz.txt는 긴 1줄짜리 문자열 -> 1줄만 읽어오면 전체 파일을 다 읽어옴
			System.out.println("파일 읽어오기 시작");
			String str = br.readLine();
			System.out.println("파일 읽어오기 끝");
			//읽어온 문자열 형태 -> 10진수 공백 10진수 공백 10진수 공백.......
			//공백을 제거한 문자열을 byte타입의 형태로 변경
			//데이터를 저장할 ArrayList<Byte> 타입으로 저장
			ArrayList<Byte> list = new ArrayList<Byte>();
			//긴 문자열에서 공백을 기준으로 잘라줄 객체 사용
			StringTokenizer sT = new StringTokenizer(str," ");
			while(sT.hasMoreTokens()) {
				String num = sT.nextToken();
				int iNum = Integer.parseInt(num);
				list.add((byte)iNum);
			}
			System.out.println("리스트로 변환 완료");
			System.out.println("리스트 길이 :"+list.size());
			
			//파일 내보내기
			//파일을 내보내기위한 주 스트림 생성
			FileOutputStream fos = new FileOutputStream("quiz.gif");
			//생성된 주 스트림을 이용해서 보조 스트림 생성
			bos = new BufferedOutputStream(fos);
			System.out.println("파일 내보내기 시작");
			//보조 스트림 통해서 파일 내보내기
			for(byte b : list) {
				bos.write(b);
			}
			System.out.println("파일 내보내기 끝");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void test2() {
		//동일한 로직이지만 주 스트림만 사용해서 구현
		//quiz.txt를 읽어오기위한 주 스트림 선언
		FileReader fr = null;
		//quiz.gif로 내보내기위한 주 스트림 선언
		FileOutputStream fos = null;
		
		try {
			//파일을 읽어오기 위한 주 스트림 객체 생성
			fr = new FileReader("quiz.txt");
			StringBuilder sb = new StringBuilder();
			System.out.println("파일 읽어오기 시작");
			while(true) {
				//read() : 문자 1개를 읽어옴
				//read()는 더 이상 읽어올 데이터가 없으면 -1을 리턴
				int data = fr.read();
				if(data == -1) {
					break;
				}
				char ch = (char)data;
				sb.append(ch);
			}
			System.out.println("파일 읽어오기 끝");
			ArrayList<Byte> list = new ArrayList<Byte>();
			StringTokenizer sT = new StringTokenizer(sb.toString()," ");
			while(sT.hasMoreTokens()) {
				String num = sT.nextToken();
				int iNum = Integer.parseInt(num);
				list.add((byte)iNum);
			}
			System.out.println("리스트 변환 완료");
			System.out.println("리스트 길이 :"+list.size());
			//내보내기 시작
			//파일 내보내기 위한 주 스트림 생성
			fos = new FileOutputStream("quiz.gif");
			System.out.println("내보내기 시작");
			for(byte b : list) {
				fos.write(b);
			}
			System.out.println("내보내기 끝");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fos.close();			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}		
}
