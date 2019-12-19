package eg2;

public class Validator {
	public boolean isValidUsNumber(String contact) throws InvalidMobileException {
		// TODO Auto-generated method stub
		if(!contact.matches("\\+1-[0-9]{10}")) {
			throw new InvalidMobileException("Entered Contact "+contact+" It Is Bad");
		}
		return true;
	}
	
	public boolean isAgeValid(int Age) {
		if(Age<0) {
			throw new InvalidAgeException("age -tive");
		}
		
		if(Age<20) {
			throw new InvalidAgeException("too young");
		}
		
		return true;
	}
	
}
