package ui;

import org.apache.commons.lang.NumberUtils;
import org.apache.commons.lang.StringUtils;

public abstract class AbstractUiTemplate extends AbstractUi {

	@Override
	public void show() {
		//메뉴 표시
		showMenu();
		//콘솔에 입력된 값 취득
		String inputedString = getInputedString();
		//입력 문자열이 숫자인지 확인
		if(isValidNumber(inputedString)) {
			execute(NumberUtils.createInteger(inputedString));
		}
	}
	abstract protected void showMenu();
	abstract protected int getMaxMenuNumber();
	abstract protected int getMinMenuNumber();
	abstract protected void execute(int number);
	//protected: 상속 관계에서만 사용
	
	private boolean isValidNumber(String str) { 
		
		//문자열이 입력이 되고(비어)있는지?
		if(StringUtils.isEmpty(str)) {
			return false;
		} else if(!StringUtils.isNumeric(str)) { //숫자인지?
			return false;
		}
		
		//문자열이 숫자이므로 int로 변환
		int number = NumberUtils.createInteger(str);
		//숫자가 메뉴에 표시되고 있는 번호의 범위인지?
		if(getMinMenuNumber() <= number && number <= getMaxMenuNumber()) {
			return true;
		}
		return false;
	}
}
