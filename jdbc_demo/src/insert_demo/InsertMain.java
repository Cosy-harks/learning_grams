package insert_demo;

public class InsertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manufacturer manufacturer = new Manufacturer(909, "LG");
		ManufacturerDAO manufacturerDao = new ManufacturerDAO();
		try {
			System.out.println(manufacturerDao.registerManufacture(manufacturer));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
