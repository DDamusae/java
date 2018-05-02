
public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = "신민철";
		String str2 = "신민철";
		String str3 = new String("신민철");
		
		
		//string 과 string을 비교할때는 값이 아닌 참조값을 비교한다. str2는 str1에서 이미 만들어진
		//객체를 참조하기 때문에 같은 참조값을 갖는다.
		//str3는 새로운 객체를 생성했기 때문에 str1과 str2와 다른 참조값을 갖는다.
		System.out.println(str1 == str2);
		System.out.println(str1 == str3); 
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}
}
