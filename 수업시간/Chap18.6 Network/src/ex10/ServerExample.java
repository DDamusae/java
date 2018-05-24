package ex10;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.1.28", 5001));
		
		System.out.println("[서버 시작]");
		
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				InputStream is = socket.getInputStream();
				
				byte[] bytes = new byte[1000];
				int readByteCount = -1;
				//파일 이름
				readByteCount = is.read(bytes);
				String fileName = new String(bytes, 0, readByteCount, "UTF-8");
				//
				fileName = fileName.trim();
				
				System.out.println("[파일 받기 시작] " + fileName);
				//파일 받기
				String targetName = "C:/Temp/" + fileName;
				FileOutputStream fos = new FileOutputStream(targetName);
				byte[] readBytes = new byte[1000];
				while((readByteCount = is.read(readBytes)) != -1) {
					fos.write(readBytes, 0, readByteCount);
				}
				//
				System.out.println("[파일 받기 완료]");
				
				
				fos.close();
				is.close();
				socket.close();
				
			} catch (Exception e) {
				break;
			}
		}
		
		serverSocket.close();
		System.out.println("[서버 종료]");
	}
}
