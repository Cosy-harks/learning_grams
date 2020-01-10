package free_money;

public class Account {
	private double money;
	private long acctNumber;
	private String named;
	public String getNamed() {
		return named;
	}
	public void setNamed(String named) {
		this.named = named;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public long getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(long acctNumber) {
		this.acctNumber = acctNumber;
	}
	public Account(double money) {
		super();
		this.money = money;
		this.acctNumber = 1594876324876520l;
		this.named = null;
	}
	
	public Account(double money, String named) {
		super();
		this.money = money;
		this.acctNumber = 1594876324876520l;
		this.named = named;
	}
	@Override
	public String toString() {
		return "AccountNumber: " + acctNumber + "\nnamed: " + named + "\nBalance: "
				+ String.format("$%.2f", money);
	}
	
}
