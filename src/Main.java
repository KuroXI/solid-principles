import Customer.*;
import Payment.*;
import Pet.*;
import Phone.*;

public class Main {
	public static void main(String[] args) {
		// Single Responsibility Principle
		Pet pet = new Pet("Itchi", "Victor");
		Food food = new Food(pet);
		Sound sound = new Sound(pet);

		food.eat("bone");
		sound.makeSound("arf! arf!");
		System.out.println();

		// Open/Close Principle
		Customer student = new Customer("Alice", new Student());
		Customer senior = new Customer("Bob", new SeniorCitizen());
		Customer regular = new Customer("Charlie", new Regular());

		double amount = 100.0;

		System.out.println("Student pays: " + student.applyDiscount(amount));
		System.out.println("Senior Citizen pays: " + senior.applyDiscount(amount));
		System.out.println("Regular customer pays: " + regular.applyDiscount(amount));
		System.out.println();

		// Interface Segregation
		BasicPhone basicPhone = new BasicPhone();
		basicPhone.makeCall("09123456789");
		basicPhone.sendSMS("09234567891", "I'm using basic phone");

		System.out.println();

		IPhone iPhone = new IPhone();
		iPhone.browseWeb("https://www.google.com");
		iPhone.makeCall("09345678912");
		iPhone.sendSMS("09456789123", "I'm using iPhone");
		iPhone.takePicture();

		System.out.println();

		Samsung samsung = new Samsung();
		samsung.browseWeb("https://www.duckduckgo.com");
		samsung.makeCall("09567891234");
		samsung.sendSMS("09678912345", "I'm using Samsung");
		samsung.takePicture();

		System.out.println();

		// Dependency Inversion Principle
		Order cashOrder = new Order(new Cash(), 100.0);
		Order creditCardOrder = new Order(new CreditCard(), 250.0);
		Order eWalletOrder = new Order(new EWallet(), 500.0);

		cashOrder.paymentMethod().pay(cashOrder.amount());
		creditCardOrder.paymentMethod().pay(creditCardOrder.amount());
		eWalletOrder.paymentMethod().pay(eWalletOrder.amount());
	}
}
