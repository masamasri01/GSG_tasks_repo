
public class Customer extends AppUser {

	private int budget;
	Customer(String uname, String password, int budget) {
		super(uname, password);
		this.setBudget(budget);
	}
	@Override
	public void goToHomePage() {
		System.out.println("Customer Home Page");
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	
}
