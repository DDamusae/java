package basic01.arraylist.bean.ex;

public class Member {
	//필드
	String name;
	int height;
	int weight;
	String nation;
	
	//생성자
	public Member(String name, int height, int weight, String nation) {
		this.setName(name);
		this.setHeight(height);
		this.setWeight(weight);
		this.setNation(nation);
	}
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
}
