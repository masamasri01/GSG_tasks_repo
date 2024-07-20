
public abstract class Payment {
	public Payment(String senderCardSerial, String recieverCardSerial, int amount) {
		super();
		this.senderCardSerial = senderCardSerial;
		this.recieverCardSerial = recieverCardSerial;
		this.amount = amount;
	}

	private String senderCardSerial;
	private String recieverCardSerial;
	private int amount;
	
	// abstract method
	public abstract void pay();
	
	//getters & setters
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getRecieverCardSerial() {
		return recieverCardSerial;
	}

	public void setRecieverCardSerial(String recieverCardSerial) {
		this.recieverCardSerial = recieverCardSerial;
	}

	public String getSenderCardSerial() {
		return senderCardSerial;
	}

	public void setSenderCardSerial(String senderCardSerial) {
		this.senderCardSerial = senderCardSerial;
	}
}
