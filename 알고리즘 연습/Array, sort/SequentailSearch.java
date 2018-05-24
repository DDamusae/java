
public class Main {
	public static void main(String[] args) {
		// 순차 검색
		// 정렬 안된 경우
		int[] arr = { 4, 9, 11, 23, 2, 18, 7 };
		int search = 2;
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				System.out.println(search + "발견");
			}
		}
		System.out.println("탐색 종료");

		// 정렬 된 경우
		int[] arr2 = { 2, 4, 7, 9, 11, 19, 23 };
		search = 10;
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] == search) {
				System.out.println(search + "발견");
			}
			if(arr2[i]>search) {
				System.out.println(search + "없음");
				break;
			}
		}
		System.out.println("탐색 종료");
	}
}
