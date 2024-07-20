
public class Paypal extends Payment {

	public Paypal(String senderCardSerial, String recieverCardSerial, int amount) {
		super(senderCardSerial, recieverCardSerial, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		System.out.println("Paying "+ this.getAmount()+"$ from card "+ this.getSenderCardSerial()+" by Paypal.");

	}

}
