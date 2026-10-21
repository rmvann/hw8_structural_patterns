package Bridge;

public class SmsChannel implements Channel {
    @Override
    public void send(String message) {
        String notif = message + " - sent via sms";
        System.out.println(notif);
    }
}
