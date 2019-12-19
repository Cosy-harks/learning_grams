package example1;

public class CharApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HeLL)) 123@ _HI ;P";
		int aleph=0,upper=0,lower=0,digit=0,alphanum=0,white=0,special=0;
		
		
		for(int i = 0; i< s.length(); i++) {
			char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {
				aleph++;
			}
			if(Character.isUpperCase(c)) {
				upper++;
			}
			if(Character.isLowerCase(c)) {
				lower++;
			}
			if(Character.isDigit(c)) {
				digit++;
			}
			if(Character.isLetterOrDigit(c)) {
				alphanum++;
			}
			if(Character.isWhitespace(c)) {
				white++;
			}
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
				special++;
			}

		}
		System.out.println("Alpha count: " + aleph);
		System.out.println("upper count: " + upper);
		System.out.println("lower count: " + lower);
		System.out.println("digit count: " + digit);
		System.out.println("alphanum count: " + alphanum);
		System.out.println("white count: " + white);
		System.out.println("special count: " + special);
	}

}
