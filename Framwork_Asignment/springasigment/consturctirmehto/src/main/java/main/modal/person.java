package main.modal;

public class person
{

	int id;
	String name;
	
	
	
	public person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
