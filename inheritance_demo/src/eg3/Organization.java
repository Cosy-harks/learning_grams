package eg3;

public class Organization {
	private int oid;
	private String orgName;
	public Organization() {
		// TODO Auto-generated constructor stub
	}
	public Organization(int oid, String orgName) {
		super();
		this.oid = oid;
		this.orgName = orgName;
	}
	
	public void printOrgDetails() {
		System.out.println("Organization Details");
		System.out.println("Org id: " + oid);
		System.out.println("Org name: " + orgName);
	}
}
