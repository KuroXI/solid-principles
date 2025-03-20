package Phone;

import Phone.interfaces.Browser;
import Phone.interfaces.Call;
import Phone.interfaces.Camera;
import Phone.interfaces.Message;

public class Samsung implements Browser, Call, Camera, Message {
	@Override
	public void browseWeb(String url) {
		System.out.println("Browsing " + url);
	}

	@Override
	public void makeCall(String number) {
		System.out.println("Calling " + number);
	}

	@Override
	public void takePicture() {
		System.out.println("Taking a photo");
	}

	@Override
	public void sendSMS(String number, String message) {
		System.out.println("Texting " + number + " with a message: " + message);
	}
}
