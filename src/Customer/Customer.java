package Customer;

public record Customer(String name, DiscountStrategy discountStrategy) {
	public double applyDiscount(double amount) {
		return amount - discountStrategy.calculateDiscount(amount);
	}
}
