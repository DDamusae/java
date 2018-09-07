package P03.initialblock;

public class HundredNumbers {
	static int arr[];
	
	//static initialize
	static {
		arr = new int[100];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
	}
	
	
}
