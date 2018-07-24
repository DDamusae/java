package p02.reference.type;

public class CheckingAccount extends Account{
	String cardNo; //체크카드 번호
	
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	//체크카드 지불
	int pay(String cardNo, int amount) throws Exception {
		if(cardNo.equals(this.cardNo) || balance < amount) {
			throw new Exception("지불이 불가능합니다."); //1
		}
		return withdraw(amount); //인출 가능
	}
	
	
}
