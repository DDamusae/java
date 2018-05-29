package p02.classes;

public class GoodStock {
	String goodsCode; //상품 코드
	int stockNum; //재고 수량

	//기본 생성자 : 자동으로 객체 생성시 JVM 컴파일 시 자동 생성하기 때문에 만들지 않아도 된다.
	public GoodStock() {
		super();
	}
	
	//
	public GoodStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	

	//재고 메소드
	//재고+
	void addStock(int amount) {
		stockNum += amount;
	}
	//재고-
	int subStock(int amount) {
		if(stockNum<amount) {
			return 0;
		}
		stockNum -= amount;
		return stockNum;
	}
	
	
	//getter setter
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public int getStockNum() {
		return stockNum;
	}
	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	
	
	//Nested Class : static class 표현 가능
	static class aaa{
		
	}
	// => Anonymous Class or Interface
}
