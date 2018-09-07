package p05.reference.polymorphism;

public class Cricket extends Game{
	
	@Override
	public void type() {
		System.out.println("Inherit Cricket Game");
	}
	
	public void write() {
		System.out.println("Cricket Method");
	}

	public static void main(String[] args) {
		Game gm = new Game();
		gm.type();
		
		Cricket ck = new Cricket();
		ck.type();
		ck.write();
//		Cricket ck2 = (Cricket) new Cricket(); //이런 형식은 불가능
		
		Game gc = new Cricket();
		gc.type();
		((Cricket)gc).write();
		
		Cricket ck3 = (Cricket) gc;
		ck3.type();
		ck3.write();
		
//		Cricket ck4 = (Cricket) gm;
//		ck4.type();
//		ck4.write();
	}
}
