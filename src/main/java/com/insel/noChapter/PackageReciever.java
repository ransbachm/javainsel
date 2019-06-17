package com.insel.noChapter;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class PackageReciever {
	public static void main(String [] args) {
		int port = 80;
		new PackageReciever().run(port);
	}
	
	public void run(int port) {
		DatagramSocket serverSocket = null;
		try {
			serverSocket = new DatagramSocket(port);
			byte [] recieveData = new byte[1024];
			String sendString = "YoiYoi Konkon";
			byte [] sendData = sendString.getBytes("UTF-8");
			
			
			String localAddress = InetAddress.getLocalHost().getHostAddress();
			System.out.printf("Server running on UDP :%s:%d%n", localAddress, port);
			DatagramPacket recievePacket = new DatagramPacket(recieveData, recieveData.length);
			
			while(true) {
				serverSocket.receive(recievePacket);
				String sentence = new String(recievePacket.getData(), 0, recievePacket.getLength());
				if(sentence.equals("Kimi no")) {
					System.exit(0);
				}
				System.out.println("Recieved: " + sentence);
				InetAddress ipAddress = recievePacket.getAddress();
				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, recievePacket.getPort());
				serverSocket.send(sendPacket); 
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			serverSocket.close();
		}
	}
}
