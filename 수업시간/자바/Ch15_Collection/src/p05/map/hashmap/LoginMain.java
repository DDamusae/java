package p05.map.hashmap;

import java.util.Scanner;

public class LoginMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoginSVC lc = new LoginSVC();
		User user = null;
		boolean isStop = false;
		
		do {
			//ID, Password 입력
			System.out.println("Id 입력: ");
			String id = sc.next();
			System.out.println("Password 입력: ");
			String pw = sc.next();
			//로그인 진행
			user = lc.login(id, pw);
			if(user == null) { //아이디가 없거나 비밀번호가 다를 경우
				isStop = true;
			}else { //정상 로그인 했을 경우
				System.out.println(user.toString()); //유저 정보 출력
			}
		}while(!isStop);
		sc.close();
	}
}
