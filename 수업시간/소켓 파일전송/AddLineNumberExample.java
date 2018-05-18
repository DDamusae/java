package ex7;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\중앙\\eclipse-workspace\\Chap18\\src\\DataInputStreamExample\\DataInputStreamExample.java";
		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String str = "";
		int line = 1;
		
		while((str = br.readLine()) != null) {
			System.out.println(line + ": " + str);
			line++;
		}
		
		fr.close();
	}
}
