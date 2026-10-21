package Bridge;

public class OnlinePaymentNotification extends PaymentNotification {

    public OnlinePaymentNotification(Channel channel) {
        super(channel);
    }

    @Override
    public void sendNotification() {
        channel.send("Online Payment Success");
    }
}
