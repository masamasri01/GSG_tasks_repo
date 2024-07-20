import java.util.ArrayList;

public class Owner extends AppUser {
	private ArrayList <Building> buildings;//composition. The building should have an owner. if we delete the container class (owner) the building wil be deleted.
	
	Owner(String uname, String password) {
		super(uname, password);
		buildings = new ArrayList<Building>();
		// TODO Auto-generated constructor stub
	}
	public  ArrayList <Building> getBuildings() { 
		return this.buildings;
	}
	public void addBuilding(Building b) {//composition 
		 this.buildings.add(b);
	}
	@Override
	public void goToHomePage() { // Polymorphism.
		System.out.println("Owner Home Page");
	}
    
}
