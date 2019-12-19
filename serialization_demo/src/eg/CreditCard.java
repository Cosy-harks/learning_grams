package eg;

import java.io.Serializable;

public class CreditCard implements Serializable {
	private long ccNumber;
	private String cardHolderName;
	private String bankName;
	private transient int cvs;
	
	public CreditCard(long ccNumber, String cardHolderName, String bankName, int cvs) {
		super();
		this.ccNumber = ccNumber;
		this.cardHolderName = cardHolderName;
		this.bankName = bankName;
		this.cvs = cvs;
	}
	
	public long getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(long ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "CreditCard [ccNumber=" + ccNumber + ", cardHolderName=" + cardHolderName + ", bankName=" + bankName
				+ ", cvs="+cvs+"]";
	}

	public int getCvs() {
		return cvs;
	}

	public void setCvs(int cvs) {
		this.cvs = cvs;
	}
	
	
}
