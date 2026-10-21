package Bridge;

public class EmailChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println(message + " - sent via email");
    }
}
