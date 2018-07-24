package p05.map.hashmap;

import java.util.HashMap;

public class LoginSVC {
	HashMap<String, String> loginDatas = new HashMap<>();
	HashMap<String, User> userDatas = new HashMap<>();
	
	public LoginSVC() {
		//id: java, value: java
		loginDatas = new HashMap<String, String>();
		loginDatas.put("java", "java");
		userDatas = new HashMap<String, User>();
		userDatas.put("java", new User("java", "java", "역삼동", 30, "홍길동"));
	}
	
	public User login(String id, String pw) {
		User u = null;
		if(loginDatas.containsKey(id)) {
			if(loginDatas.get(id).equals(pw)) {
				u = userDatas.get(id);
			}else {
				System.out.println("패스워드가 일치하지 않습니다.");
			}
		}else {
			System.out.println("id가 존재하지 않습니다.");
		}
		return u;
	}
}
