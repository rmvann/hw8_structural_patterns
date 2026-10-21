package Bridge;

public class BitcoinPayment extends PaymentNotification {

    public BitcoinPayment(Channel channel) {
        super(channel);
    }

    @Override
    public void sendNotification() {
        channel.send("Bitcoin Payment Success");
    }
}
