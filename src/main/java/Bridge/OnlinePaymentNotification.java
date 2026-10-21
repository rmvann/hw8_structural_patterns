package Bridge;

public class OnlinePaymentNotification extends PaymentNotification {

    public OnlinePaymentNotification(Channel channel) {
        super(channel);
    }

    @Override
    public void sendNotification() {
        String message = "Online Payment Success";
        channel.send(message);
    }
}
