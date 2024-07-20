
public abstract class AppUser {
	private String uname;
	private String password;
	private String phone;
	private String email;
	private String cardSerial;
	AppUser(String uname, String password){ //constructor
		this.uname = uname;
		this.password = password;
	}
	//getters & setters. achieving Encapsulation principle
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	//methods
	void login(String uname, String password) {
		//process uname and password match with database
		System.out.println(this.uname+" logging in ...");
	}
	void logout() {
		System.out.println(this.uname+" logging out ...");
	}
	public abstract void goToHomePage();
	public String getCardSerial() {
		return cardSerial;
	}
	public void setCardSerial(String cardSerial) {
		this.cardSerial = cardSerial;
	}
}
