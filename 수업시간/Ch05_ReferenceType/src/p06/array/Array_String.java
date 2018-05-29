package p06.array;

public class Array_String {
	public static void main(String[] args) {

		String s[] = { "홍길동", "알파고", "베타고" };

		// 일반 for
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println();
		// 향상 for
		for (String str : s) {
			System.out.println(str);
		}

		// 배열형태2
		String[] s2 = new String[3];
		s2[0] = "홍길동";
		s2[1] = "홍길동";
		s2[2] = "홍길동";
		
		//배열형태3
		@SuppressWarnings("unused")
		String[] s3 = new String[] {"홍길동", "알파고", "베타고"};
	}
}
