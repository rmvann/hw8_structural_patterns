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
        

        // part 3
    }
}
