package ex4;

public class Util {
	
	public static <K, V> Integer getValue(Pair<?, V> pair, K k) {
		if(pair.getKey().equals(k)) {
			return (Integer) pair.getValue();
		}
		return null;
	}
}
