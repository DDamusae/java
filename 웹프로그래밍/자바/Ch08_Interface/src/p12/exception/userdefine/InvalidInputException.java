package p12.exception.userdefine;

public class InvalidInputException extends Exception{
	//버전관리(SVN): 프로그램 개발 시 변동 이력 구분하기 위한 것
	private static final long serialVersionUID = 1L;

	public InvalidInputException() {
		super("잘못된 명령 입니다.");
	}

	
	
}
