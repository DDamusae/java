package ex10;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.1.28", 5001);
		OutputStream os = socket.getOutputStream();
		
		String path = "C:\\Users\\중앙\\Documents\\myjava\\Hello.java";
		File file = new File(path);
		
		String fileName = file.getName();
		//파일 이름
		byte[] bytes = null;
		
		bytes = fileName.getBytes("UTF-8");
		os.write(bytes);
		os.flush();
		//

		System.out.println("[파일 보내기 시작] " + fileName);
		//파일 보내기
		FileInputStream fis = new FileInputStream(file);
		bytes = new byte[1000];
		int readByteCount;
		while((readByteCount = fis.read(bytes)) != -1) {
			os.write(bytes, 0, readByteCount);
		}
		//
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
