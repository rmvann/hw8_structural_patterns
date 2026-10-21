package Bridge;

public class PushChannel implements Channel {

    @Override
    public void send(String message) {
        System.out.println(message + " - sent via push notification");
    }
}
