package basic01.arraylist.bean.test;

import java.util.ArrayList;
import java.util.List;

public class MemberSetData {
	MemberBean setData() {
		MemberBean mb = new MemberBean();
		mb.setId("hong");
		mb.setPassword(1234);
		mb.setName("홍길동");
		return mb;
	}
	
	List<MemberBean> setDatas(){
		List<MemberBean> list = new ArrayList<>();
		MemberBean mb2 = new MemberBean();
		mb2.setId("Ronaldo");
		mb2.setPassword(4567);
		mb2.setName("호날두");
		list.add(mb2);
		
		MemberBean mb3 = new MemberBean();
		mb3.setId("Messi");
		mb3.setPassword(5678);
		mb3.setName("메시");
		list.add(mb3);
		
		return list;
	}
}
