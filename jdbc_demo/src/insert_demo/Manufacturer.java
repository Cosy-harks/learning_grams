package insert_demo;

public class Manufacturer {
	private int mid;
	private String mname;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "Manufacturer [mid=" + mid + ", mname=" + mname + "]";
	}
	public Manufacturer(int mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
}
