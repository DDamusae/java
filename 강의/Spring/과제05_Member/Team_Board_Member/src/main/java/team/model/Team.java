package team.model;

public class Team {
	private Integer id; //team table: team_id
	private String name; //team table: name
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
