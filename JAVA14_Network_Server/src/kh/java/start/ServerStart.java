package kh.java.start;

import kh.java.func.DNSServer;
import kh.java.func.FileServer;
import kh.java.func.TcpServer;
import kh.java.func.UdpServer;

public class ServerStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UdpServer us = new UdpServer();
		//us.udpServerTest();
		//DNSServer ds = new DNSServer();
		//ds.DNSServerTest();
		FileServer fs = new FileServer();
		fs.server2();
	}

}
