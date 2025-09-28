package main.model;

public class person 
{

	int id;
	String name;
	address add;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public address getAdd() {
		return add;
	}
	public void setAdd(address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	
	
	
}
