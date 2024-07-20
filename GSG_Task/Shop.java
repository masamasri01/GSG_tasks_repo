
public class Shop extends Building {
	
	public Shop(int size, String name, String address, int price) {
		super(size, name, address, price);
	}
	//overriding abstract methods
	@Override
	public void build() {
		System.out.println("Building shop.");

	}

	@Override
	public void decorate() {
		System.out.println("Decorating shop.");
	}

}
