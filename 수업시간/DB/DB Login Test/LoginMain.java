package javalogintest;

import java.util.Scanner;

public class LoginMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		
		User u = null;
		String user = null;
		LoginSVC ls = new LoginSVC();
		ls.connect();
		do{
			System.out.println("로그인 화면입니다.");
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			u = ls.login(id, pw);
			if(u == null){
				System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
			}
			else{
				user = u.toString();
				System.out.println("로그인한 사용자 정보");
				System.out.println(user);
				isStop = true;
			}
		} while(!isStop);
		sc.close();
	}
}
