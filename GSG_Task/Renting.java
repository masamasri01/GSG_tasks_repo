
public class Renting {
	private Customer customer; //aggregation relationship, the customer and the rest of attributes can exist independently
	private Owner owner; //aggregation relationship
	private Building building;//aggregation relationship
	private Payment payment; //composition relationship
	
	
	public void rent() {
		System.out.println("Customer "+ customer.getUname() + " Wants to rent "+ building.getName()+ " from Owner "+ owner.getUname()+" price = "+ building.getPrice());
		payment.pay();
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Renting(Customer customer, Owner owner, Building building, Payment payment) {
		super();
		this.customer = customer;
		this.owner = owner;
		this.building = building;
		this.payment = payment;
	}
	
	
}
