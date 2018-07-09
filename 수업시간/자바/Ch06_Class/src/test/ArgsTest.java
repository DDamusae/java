package test;

class Args{
	int x;
	void add(int x) {
		x += 50;
	}
	void add(Args args) {
		args.x += 40;
	}
	void addNew(Args args) {
		args = new Args();
	}
	void add(int[] arr) {
		arr[0]++;
	}
}

public class ArgsTest {
	//인수 전달 방식 테스트
	public static void main(String[] args) {
		//
		Args arg = new Args();
		
		arg.x = 100;
		
		//
		int[] arr = {0,1,2,3,4,5,6};
		
		arg.add(arg.x);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arg);
		System.out.println("arg.x = " + arg.x);
		
		arg.addNew(arg);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arr);
		System.out.println("arr[0] = " + arr[0]);

	}
}
