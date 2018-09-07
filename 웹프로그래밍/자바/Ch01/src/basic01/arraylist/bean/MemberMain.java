package basic01.arraylist.bean;

public class MemberMain {
	public static void main(String[] args) {
		MemberSetData ms = new MemberSetData();
		MemberPrint mp = new MemberPrint();
		mp.printData(ms.setData());
		
		mp.printDatas(ms.setDatas());
		mp.printDatas2(ms.setDatas());
	}
}
