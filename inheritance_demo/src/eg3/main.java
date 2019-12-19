package eg3;

public class main {

	public static void main(String[] args) {
		Team ti = new Team(100, "Vinay", "America");
		
		printAnything(ti);
		
		Player p1 = new Player(99, "Cody", ti, 89);
		
		printAnything(p1);
		
		Organization o = new Organization(999, "revature");
		
		printAnything(o);
		
		Employee e = new Employee(90000, "Man", o, 10000.00);
		
		printAnything(e);
	}
	
	public static void printAnything(Object o) {
		if(o instanceof Employee) {
			Employee e = (Employee)o;
			e.printEmployee();
		}else if(o instanceof Player) {
			Player e = (Player)o;
			e.printPlayer();
		}else if(o instanceof Person) {
			Person e = (Person)o;
			e.printPerson();
		}else {
			System.out.println("another object");
		}
	}

}
