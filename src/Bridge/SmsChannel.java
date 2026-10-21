package Bridge;

public class SmsChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println(message + " - sent via sms");
    }
}
