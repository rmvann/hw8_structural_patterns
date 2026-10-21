package Bridge;

public class CashOnDeliveryPayment extends PaymentNotification{

    public CashOnDeliveryPayment(Channel channel) {
        super(channel);
    }

    @Override
    public void sendNotification() {
        channel.send("Cash On Delivery Payment Success");
    }
}
