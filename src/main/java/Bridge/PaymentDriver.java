package Bridge;

public class PaymentDriver {

    public static void main(String[] args) {

        // part 1
        PaymentNotification onlineEmail = new OnlinePaymentNotification(new EmailChannel());
        onlineEmail.sendNotification();

        PaymentNotification onlineSms = new OnlinePaymentNotification(new SmsChannel());
        onlineSms.sendNotification();

        PaymentNotification cashEmail = new CashOnDeliveryPayment(new EmailChannel());
        cashEmail.sendNotification();

        PaymentNotification cashSms = new CashOnDeliveryPayment(new SmsChannel());
        cashSms.sendNotification();

        // part 2
        PaymentNotification bitcoinEmail = new BitcoinPayment(new EmailChannel());
        bitcoinEmail.sendNotification();
        PaymentNotification bitcoinSms = new BitcoinPayment(new SmsChannel());
        bitcoinSms.sendNotification();

        // part 3
        PaymentNotification onlinePush = new OnlinePaymentNotification(new PushChannel());
        onlinePush.sendNotification();

        PaymentNotification bitcoinPush = new BitcoinPayment(new PushChannel());
        bitcoinPush.sendNotification();
    }
}
