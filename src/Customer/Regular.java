package Customer;

public class Regular implements DiscountStrategy {
	@Override
	public double calculateDiscount(Double amount) {
		return amount * 0.0;
	}
}
