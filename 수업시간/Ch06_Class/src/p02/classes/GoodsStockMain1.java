package p02.classes;

public class GoodsStockMain1 {
	public static void main(String[] args) {
		//데이터 저장 1 : 변수
		GoodStock g1 = new GoodStock();
		g1.goodsCode = "1111";
		g1.stockNum = 200;
		System.out.println(g1.goodsCode);
		System.out.println(g1.stockNum);
		
		//데이터 저장 2 : getter() setter()
		GoodStock g2 = new GoodStock();
		g2.setGoodsCode("2222");
		g2.setStockNum(400);
		System.out.println(g2.goodsCode);
		System.out.println(g2.stockNum);
		
		//데이터 저장 3 : 생성자
		GoodStock g3 = new GoodStock("3333", 600);
		System.out.println(g3.goodsCode);
		System.out.println(g3.stockNum);
	}
}
