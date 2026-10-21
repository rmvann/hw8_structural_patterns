package Bridge;

public class BitcoinPayment extends PaymentNotification {

    public BitcoinPayment(Channel channel) {
        super(channel);
    }

    @Override
    public void sendNotification() {
        String message = "Bitcoin Payment Success";
        channel.send(message);
    }
}
