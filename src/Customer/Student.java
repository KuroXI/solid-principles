package Customer;

public class Student implements DiscountStrategy {
	@Override
	public double calculateDiscount(Double amount) {
		return amount * 0.05;
	}
}
