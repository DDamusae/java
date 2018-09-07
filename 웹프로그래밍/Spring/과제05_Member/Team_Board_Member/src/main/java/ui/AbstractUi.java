package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractUi {
	protected String getInputedString() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try { //콘솔에 입력된 값을 취득
			return input.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	abstract public void show();
}
