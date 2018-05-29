package p06.array;

public class Array_Int {
	public static void main(String[] args) {
		//형식1
		int[] arr1 = {10, 20, 30, 40, 50};
		for(int i:arr1) {
			System.out.println(i);
		}
		System.out.println();
		
		//형식2
		int[] arr2 = new int[5];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (i+1)*10;
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		//형식3
		int[] arr3 = new int[] {10, 20, 30, 40, 50};
		for(int i:arr3) {
			System.out.println(i);
		}
	}
}
