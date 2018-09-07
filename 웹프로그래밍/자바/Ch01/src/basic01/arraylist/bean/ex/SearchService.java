package basic01.arraylist.bean.ex;

public class SearchService {
	Member[] members = new Member[5];
	public SearchService() {
		members[0] = new Member("홍길동", 167, 77, "대한민국");
		members[1] = new Member("James", 187, 67, "미국");
		members[2] = new Member("가루상", 166, 57, "일본");
		members[3] = new Member("홍금보", 177, 80, "중국");
		members[4] = new Member("인도인", 199, 77, "인도");
	}
	
	boolean searchMember(String name) {
		boolean searchResult = false;
		
		for(int i=0; i<members.length; i++) {
			if(members[i].getName().equals(name)) {
				printInfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
		
	}

	private void printInfo(Member member) {
		System.out.println(member.getName() + "으로 찾은 결과");
		System.out.println("이름: " + member.getName());
		System.out.println("신장: " + member.getHeight());
		System.out.println("몸무게: " + member.getWeight());
		System.out.println("국가: " + member.getNation());
	}
}
