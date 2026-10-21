package Bridge;

public class CashOnDeliveryPayment extends PaymentNotification{

    public CashOnDeliveryPayment(Channel channel) {
        super(channel);
    }

    @Override
    public void sendNotification() {
        String message = "Cash On Delivery Payment Success";
        channel.send(message);
    }
}
