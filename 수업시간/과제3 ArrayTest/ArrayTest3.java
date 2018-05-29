package test.array;

//배열을 초기화 시키면서 생성하는 기능 테스트
public class ArrayTest3 {
	public static void main(String[] args) {
		String cities[] = {"서울", "대구", "춘천", "울산", "광주", "천안"};
		String nations[] = {"대한민국", "미국", "영국", "일본", "프랑스"};
		
		//배열값 출력
		for(int i=0; i<cities.length; i++) {
			System.out.println("cities[" + i + "] = " + cities[i]);
		}
		for(int i=0; i<nations.length; i++) {
			System.out.println("nations[" + i + "] = " + nations[i]);
		}
	}
}
