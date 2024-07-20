
public class ProgramTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("masa", "masa123455@", 350);
		Owner o1 = new Owner("Aseel", "a@345");
		c1.setCardSerial("003444AA");
		o1.setCardSerial("003222AA");
		//composition
		o1.addBuilding(new Apartment(180, "hope apatment", "Rafidia, Nablus", 80000, 4));
		o1.addBuilding(new House(180, "b12", "Beit Wazan, Nablus", 180000));
		o1.addBuilding(new Shop(180, "daraghmeh shop", "Manara, Ramallah", 50000));
		
		// all users log in, regardless of their type.
		AppUser users[]= {c1,o1};
		for (AppUser user: users) {
			user.login(user.getUname(), user.getPassword());
		}
		//customer c1 want to rent daraghmeh shop from owner o1,
		//paying by visa:
		
		for(Building b: o1.getBuildings()) {
			if(b.getName()== "daraghmeh shop") {
				Payment p = new Visa(c1.getCardSerial(), o1.getCardSerial(), b.getPrice());
				Renting r = new Renting(c1, o1, b, p);
				r.rent();
			}
		}
		for (AppUser user: users) {
			user.logout();
		}
	}

}
