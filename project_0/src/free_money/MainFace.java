package free_money;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class MainFace {
	public static void main(String[] args) throws IOException {
		
		final Logger logs = Logger.getLogger(MainFace.class);
		boolean loggedIn = false;
		//User inputer
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Make a user name - at least 4 alphanum's
		String name = "";
		//Make a password - at least 2 special char separated by alphanum's
		String pass = "";
		
		Customer me = null;
		
		logs.info("Anything other than 'yes' will be considered as 'no'\n");
		
		
		

		
		System.out.println("Do you have an account?");
		if(!"yes".equals(br.readLine())) {
			while(true) {
				System.out.println("Enter your desired username");
				name=br.readLine();
				if(CustomerCheck.isName(name)) {
					System.out.println("Acceptable...");
					break;
				}
			}
		
			
			while(true) {
				System.out.println("Enter your desired password");
				pass=br.readLine();
				if(CustomerCheck.isPass(pass)) {
					System.out.println("Acceptable...");
					break;
				}
			}
			//objectify the customer
			CustomerCheck.newUser(name, pass);
		
			System.out.println("A Customer Account has been made by you");
		}
		
		
		
		//forces the user to login after creating the account
		while(!loggedIn) {
			System.out.println("Please Log In");
			System.out.print("Username: ");
			name = br.readLine();
			if(!CustomerCheck.isName(name)) {
				System.out.println("Try again");
				continue;
			}
			System.out.print("Password: ");
			pass = br.readLine();
			if(!CustomerCheck.isPass(pass)) {
				System.out.println("Try again");
				continue;
			}
			me = CustomerCheck.login(name, pass);
			if(me != null) {
				if(me.getUserName().equals(name)) {
					loggedIn = true;
					me.setLoggedIn(true);
				}
			}
		}
		
		
		// user may make an account of money
		while(true) {
			System.out.println("Do you want to make an Account?");
		
	//TODO separate this main into separate functions - much in another class
			if("yes".equals(br.readLine())) {
				System.out.println("How much will you start your account with?");
				logs.info("$");
				String bs = br.readLine();
				if(!AccountCheck.isNum(bs)) {
					logs.info("NaN Account Balance needs to be a positive number\n");
					continue;
				}
				Account acc = new Account(Double.parseDouble(bs));
				System.out.println("Account is made\n"+acc.toString());
				me.addAcct(acc.getAcctNumber());
				//accountMap.get(me).add((Long)acc.getAcctNumber());
				continue;
			}
			break;
		}
//		
//		Serialize.store(me);
//		
//		Customer hell = DeSerialize.data();
//		
//		System.out.println(hell);
	}
}
