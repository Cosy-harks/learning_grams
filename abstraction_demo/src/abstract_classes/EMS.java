package abstract_classes;

public abstract class EMS {
	
	public EMS() {
		
	}
	
	public abstract void addEmployee();
	public abstract void updateEmployee();
	public abstract void calcEmployeeSalary();
	public abstract void searchEmployee();
	
	public void commonEmployeeFetures() {
		System.out.println("An employee as per ILL should be payed");
	}
	
}
