package basic01.arraylist.bean;

import java.util.ArrayList;
import java.util.List;

public class MemberSetData {
	public MemberBean setData() {
		MemberBean mb = new MemberBean();
		mb.setId("hong");
		mb.setPassword(1234);
		mb.setName("홍길동");
		return mb;
	}
	
	public List<MemberBean> setDatas() {
		List<MemberBean> list = new ArrayList<>();
		MemberBean mb2 = new MemberBean();
		mb2.setId("alpha");
		mb2.setPassword(3456); 
		mb2.setName("alphago");
		list.add(mb2);
		MemberBean mb3 = new MemberBean();
		mb3.setId("beta");
		mb3.setPassword(5678);
		mb3.setName("betago");
		list.add(mb3);
		
		return list;
	}
}
