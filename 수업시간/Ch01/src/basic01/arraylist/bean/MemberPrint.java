package basic01.arraylist.bean;

import java.util.List;

public class MemberPrint {
	public void printData(MemberBean mb) {
		System.out.println("ID: " + mb.getId());
		System.out.println("Password: " + mb.getPassword());
		System.out.println("Name: " + mb.getName());
	}
	
	public void printDatas(List<MemberBean> list) {
		System.out.println("-------Print Datas-------");
		for(int i=0; i<list.size(); i++) {
			printData(list.get(i));
		}
	}
	
	public void printDatas2(List<MemberBean> list) {
		System.out.println("-------Print Datas2-------");
		for(MemberBean i:list) {
			printData(i);
		}
	}
}
