
public class House extends Building {
	public House(int size, String name, String address, int price) {
		super(size, name, address, price);
	} // constructor

	private int numberOfFloors;
	public int getNumberOfFloors() { //getter
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) { //setter
		this.numberOfFloors = numberOfFloors;
	}
	//overriding abstract methods
	@Override
	public void build() {
		System.out.println("Building House.");

	}

	@Override
	public void decorate() {
		System.out.println("Decorating House.");
	}

}
