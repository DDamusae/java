package test.array;

//system.arraycopy 테스트
public class ArrayTest6 {
	public static void main(String[] args) {
		String cities[] = {"서울","대구","춘천","울산","광주","천안"}; 
		String nations[] = new String[]{"대한민국","미국","영국","일본","프랑스"};
		String newArray[] = new String[cities.length + nations.length];
		
		System.arraycopy(cities, 0, newArray, 0, cities.length);
		System.arraycopy(nations, 0, newArray, cities.length, nations.length);
		
		for(String str:newArray) {
			System.out.println(str);
		}
	}
}
