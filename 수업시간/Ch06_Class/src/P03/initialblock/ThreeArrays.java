package P03.initialblock;

public class ThreeArrays {
	static int arr1[];

	// static initialize
	static {
		arr1 = new int[10];
		for (int i = 0; i < 10; i++) {
			arr1[i] = i + 1;
		}
	}

	static int arr2[]; // 10000~100000
	// static initialize
	static {
		arr2 = new int[10];
		for (int i = 0; i < 10; i++) {
			arr2[i] = (i + 1) * 10000;
		}
	}
	
	static int arr3[]; // arr1 + arr2;
	// static initialize
	static {
		arr3 = new int[10];
		for (int i = 0; i < 10; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
	}
}
