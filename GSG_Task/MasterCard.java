
public class MasterCard extends Payment {

	public MasterCard(String senderCardSerial, String recieverCardSerial, int amount) {
		super(senderCardSerial, recieverCardSerial, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		System.out.println("Paying "+ this.getAmount()+"$ from card "+ this.getSenderCardSerial()+"by MasterCard.");

	}

}
