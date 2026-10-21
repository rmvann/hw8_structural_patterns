package Bridge;

public class EmailChannel implements Channel {
    @Override
    public void send(String message) {
        String notif = message + " - sent via email";
        System.out.println(notif);
    }
}
