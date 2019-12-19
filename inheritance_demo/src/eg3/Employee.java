package eg3;

public class Employee extends Person {
	private Organization org;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Organization org, double salary) {
		super(id, name);
		this.org = org;
		this.salary = salary;
	}
	
	public void printEmployee() {
		super.printPerson();
		org.printOrgDetails();
		System.out.println("Salary: " + salary);
	}
}
