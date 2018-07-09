package ChildProductAndStorageExample;

public class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	public M getModel() {
		return this.model;
	}
	
	public void setKind(T t) {
		this.kind = t;
	}
	public void setModel(M m) {
		this.model = m;
	}
}

class Tv{}