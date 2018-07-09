package test;

public class Login {
	String userId;
	String userPw;
	String inputId;
	String inputPw;
	
	//
	public Login() {
		userId = "admin";
		userPw = "1111";
	}

	public boolean loginCheck() {
		if(!inputId.equals(userId)) {
			return false;	
		}else {
			if(inputPw.equals(userPw)) {
				System.out.println("로그인 성공!");
				return true;
			}else {
				return false;
			}
		}
		
	}
}
