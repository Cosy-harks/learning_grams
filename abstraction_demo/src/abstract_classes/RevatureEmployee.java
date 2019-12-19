package abstract_classes;

public class RevatureEmployee extends RevatureEmployer {

	@Override
	public void addEmployee() {
		System.out.println("Put in MongoDB");
	}
	
	@Override
	public void updateEmployee() {
		System.out.println("Moved in MongoDB");
	}
	
	@Override
	public void calcEmployeeSalary() {
		System.out.println("Moved in MongoDB");
	}
	
	@Override
	public void searchEmployee() {
		System.out.println("Found in MongoDB");
	}
	
	@Override
	public void requirement1() {
		System.out.println("What?");
	}
}
