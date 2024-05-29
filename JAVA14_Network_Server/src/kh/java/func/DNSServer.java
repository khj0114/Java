package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class DNSServer {
	public void DNSServerTest() {
		Scanner sc = new Scanner(System.in);
		int port = 8888;
		
		ServerSocket server = null;		
		DataInputStream dis =null;
		DataOutputStream dos = null;
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("www.naver.com","125.209.222.142");
		map.put("www.google.com","172.217.175.4");
		map.put("www.iei.co.kr","99.83.248.72");
		
		try {
				server = new ServerSocket(port);
				System.out.println("DNS 서버 준비 완료");
				
				while(true) {
				System.out.println("클라이언트 요청 대기......");			
				Socket socket = server.accept();
				
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				dis = new DataInputStream(in);
				dos = new DataOutputStream(out);
				
				String domain = dis.readUTF();
				
				String ipAddress = map.get(domain);
				if(ipAddress != null) {
					dos.writeUTF("["+domain+"]의 주소는 "+ipAddress+"입니다.");
				}else { 
					dos.writeUTF("주소가 없습니다.");
				}
				
				dis.close();
				dos.close();
				
				System.out.println("서버를 종료하시겠습니까[Y/N] ?");
				String select = sc.next();
				if(select.equals("Y")) {
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				server.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
