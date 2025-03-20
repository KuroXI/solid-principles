package Payment;

public class Cash implements PaymentMethod {
	@Override
	public void pay(double amount) {
		System.out.println("You paid " + amount + " using cash");
	}
}
