
public abstract class Building {
	public Building(int size, String name, String address, int price) {
		this.size = size;
		this.name = name;
		this.address = address;
		this.price = price;
	}
	private int size;
	private String name;
	private String address;
	private int price; 
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public abstract void build();
	public abstract void decorate();
}
