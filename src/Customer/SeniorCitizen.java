package Customer;

public class SeniorCitizen implements DiscountStrategy {
	@Override
	public double calculateDiscount(Double amount) {
		return amount * 0.10;
	}
}
