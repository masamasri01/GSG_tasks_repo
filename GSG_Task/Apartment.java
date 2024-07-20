
public class Apartment extends Building {
	

	public Apartment(int size, String name, String address, int price, int floorNumber) {
		super(size, name, address, price);
		this.floorNumber = floorNumber;
	}

	private int floorNumber;
	//overriding abstract methods
	@Override
	public void build() {
		System.out.println("Building Apartment.");

	}

	@Override
	public void decorate() {
		System.out.println("Decorating Apartment.");
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

}
