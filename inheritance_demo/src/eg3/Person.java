package eg3;

public class Person {
	private int id;
	private String name;
	
	public Person() {
		System.out.println("duh");
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

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
	
	public void printPerson() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
	}
}