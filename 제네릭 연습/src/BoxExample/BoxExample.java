package BoxExample;

public class BoxExample {
	public static void main(String[] args) {
		//제네릭 사용 않은 코드
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get();
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		
		
		//제네릭 사용
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
	}
}
