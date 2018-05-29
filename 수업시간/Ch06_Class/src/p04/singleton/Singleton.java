package p04.singleton;

public class Singleton {
	private static Singleton one;
	
	public Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(one == null) {
			one = new Singleton();
		}
		return one;
	}
	
}
