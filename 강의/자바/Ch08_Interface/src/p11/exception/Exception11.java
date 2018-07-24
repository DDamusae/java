package p11.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//Checked Exception
public class Exception11 {
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("some.txt");
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch(IOException e){
			System.out.println("입출력 예외 발생");
		}
		System.out.println("done");
	}
}
