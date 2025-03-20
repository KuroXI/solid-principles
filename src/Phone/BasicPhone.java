package Phone;

import Phone.interfaces.Call;
import Phone.interfaces.Message;

public class BasicPhone implements Call, Message {
	@Override
	public void makeCall(String number) {
		System.out.println("Calling " + number);
	}

	@Override
	public void sendSMS(String number, String message) {
		System.out.println("Texting " + number + " with a message: " + message);
	}
}
