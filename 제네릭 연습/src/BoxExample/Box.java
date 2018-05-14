package BoxExample;

public class Box<T> {
	//제네릭 사용하지 않은 코드
//	private Object object;
//	
//	public void set(Object object ) { 
//		this.object = object; 
//	}
//	
//	public Object get() { 
//		return object; 
//	}
	private T t;
	
	public void set(T t) {
		this.t= t;
	}
	
	public T get() {
		return t;
	}
	
}
