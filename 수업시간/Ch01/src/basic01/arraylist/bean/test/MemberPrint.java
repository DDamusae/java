package basic01.arraylist.bean.test;

import java.util.List;

public class MemberPrint {
	public void printData(MemberBean mb) {
		System.out.println(mb.getId());
		System.out.println(mb.getPassword());
		System.out.println(mb.getName());
	}
	
	void printDatas(List<MemberBean> list) {
		System.out.println("-------------printDatas");
		for(int i=0; i<list.size(); i++) {
			printData(list.get(i));
		}
	}
	
	void printDatas2(List<MemberBean> list) {
		System.out.println("-------------printDatas2");
		for(MemberBean i: list) {
			printData(i);
		}
	}
}
