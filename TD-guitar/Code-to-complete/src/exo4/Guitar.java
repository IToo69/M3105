package exo4;

public class Guitar {

	private String serialNumber;
	private double price;
	GuitarSpec guitarSpec;

	public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = guitarSpec;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

}
