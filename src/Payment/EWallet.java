package Payment;

public class EWallet implements PaymentMethod {
	@Override
	public void pay(double amount) {
		System.out.println("You paid " + amount + " using e-wallet");
	}
}
