package test.array;

//개선된 for문 테스트
public class ArrayTest5 {
	public static void main(String[] args) {
		String[] names = new String[]{"홍길동","전우치","이도","세종대왕","이민지","이나라","이민수"};
		for(String name: names) {
			System.out.println(name);
		}
	}
}
