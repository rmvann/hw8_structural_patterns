package Bridge;

public class PushChannel implements Channel {

    @Override
    public void send(String message) {
        String notif = message + " - sent via push notification";
        System.out.println(notif);
    }
}
