package free_money;


public class AccountCheck {
	public static boolean isNum(String num) {
		if(num.matches("[^0-9.]")) {
			return false;
		}
		if(num.matches("\\.[0-9]*\\.")) {//lastIndexOf(".")!=num.indexOf(".")) {
			return false;
		}
		return true;
	}
}
