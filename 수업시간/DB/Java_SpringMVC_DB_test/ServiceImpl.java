package test07;

import java.util.Scanner;
import java.util.Vector;

public class ServiceImpl implements Service {
	Scanner sc = new Scanner(System.in);
	OracleDao od = new OracleDao();
	
	@Override
	public void addProduct() {
		System.out.println("제품이름: ");
		String name = sc.next();
		System.out.println("제품가격: ");
		int price = sc.nextInt();
		Product p = new Product(name, price);
		od.insert(p);
	}

	@Override
	public void editProduct() {
		System.out.print("수정할 제품 번호: ");
		int num = sc.nextInt();
		Product p = od.select(num);
		System.out.println(p.toString());
		System.out.print("새 제품 이름: ");
		String name = sc.next();
		System.out.print("새 제품 가격: ");
		int price = sc.nextInt();
		p.setName(name);
		p.setPrice(price);
		od.update(num, p);
	}

	@Override
	public void delProduct() {
		System.out.print("삭제할 제품번호: ");
		int num = sc.nextInt();
		od.delete(num);
	}

	@Override
	public Product getProduct() {
		System.out.print("검색할 제품 번호: ");
		int num = sc.nextInt();
		Product p = od.select(num);
		return p;
	}

	@Override
	public Vector<Product> getProducts() {
		System.out.println("Oracle selectAll");
		Vector<Product> v = od.selectAll();
		return v;
	}

}
