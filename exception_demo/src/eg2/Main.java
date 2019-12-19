package eg2;

public class Main {
	public static void main(String[] args) {
		Validator v=new Validator();
		try {
			v.isValidUsNumber("+11-1234567890");
		} catch (InvalidMobileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
