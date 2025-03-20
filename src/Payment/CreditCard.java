package Payment;

public class CreditCard implements PaymentMethod {
	@Override
	public void pay(double amount) {
		System.out.println("You paid " + amount + " using credit card");
	}
}
