package p06.array;

public class PersonMain {
	public static void main(String[] args) {
		Person[] pa = new Person[10];
		
		for(int i=0; i<pa.length; i++) {
			pa[i] = new Person("아무개" + i);
			pa[i].age = 30+i;
			System.out.println(pa[i].getName());
			System.out.println("pa[" + i + "].age = " + pa[i].age);
		}
	}
}
