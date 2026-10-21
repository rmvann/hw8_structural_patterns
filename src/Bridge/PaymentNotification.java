package Bridge;

public abstract class PaymentNotification {
    protected Channel channel;

    public PaymentNotification(Channel channel) {
        this.channel = channel;
    }

    public abstract void sendNotification();
}
