package free_money;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable{
	private String userName;
	private int id;
	private boolean loggedIn;
	private static int count = 1;
	private List<Long> acctNums;
	
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public Customer(String userName) {
		super();
		this.userName = userName;
		this.id = count;
		this.loggedIn = false;
		acctNums = new ArrayList<Long>();
		count++;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
//	public void setId(int id) {
//		this.id = id;
//	}
	@Override
	public String toString() {
		return "Customer [userName=" + userName + ", id=" + id + ", loggedIn=" + loggedIn + "]";
	}
	public List<Long> getAcctNums() {
		return acctNums;
	}
	public void addAcct(long acctNum) {
		this.acctNums.add(new Long(acctNum));
	}
	
	
	
	
	
}
