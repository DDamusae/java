package p12.exception.userdefine;

public class ExceptionMain {
	public static void main(String[] args) {
		try {
			int result = subtract(5, 10);
			System.out.println(result);
		} catch (InvalidInputException e) {
			//에러 메세지
			System.err.println(e.getMessage());
		}
	}
	
	static int subtract(int a, int b) throws InvalidInputException {
		if(a < b) {
			throw new InvalidInputException();
		}else {
			return a-b;
		}
	}
}
