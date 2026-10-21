package Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PaymentTest {
    private String captureOutput(Runnable action) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output =
                new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(output));
            action.run();
        } finally {
            System.setOut(originalOut);
        }

        return output.toString().trim();
    }

    @Test
    void testEmailChannel(){
        String expected = "Test Message - sent via email";
        String actual = captureOutput(() -> {new EmailChannel().send("Test Message");});
        assertEquals(expected, actual);
    }

    @Test
    void testSmsChannel(){
        String expected = "Test Message - sent via sms";
        String actual = captureOutput(() -> {new SmsChannel().send("Test Message");});
        assertEquals(expected, actual);
    }

    @Test
    void testPushChannel(){
        String expected = "Test Message - sent via push notification";
        String actual = captureOutput(() -> {new PushChannel().send("Test Message");});
        assertEquals(expected, actual);
    }

    @Test
    void testOnlinePayment(){
        String expected = "Online Payment Success - sent via email";
        String actual = captureOutput(() -> {new OnlinePaymentNotification(new EmailChannel()).sendNotification();});
        assertEquals(expected, actual);
    }

    @Test
    void testCashOnDeliveryPayment(){
        String expected = "Cash On Delivery Payment Success - sent via email";
        String actual = captureOutput(() -> {new CashOnDeliveryPayment(new EmailChannel()).sendNotification();});
        assertEquals(expected, actual);
    }

    @Test
    void testBitcoinPayment(){
        String expected = "Bitcoin Payment Success - sent via email";
        String actual = captureOutput(() -> {new BitcoinPayment(new EmailChannel()).sendNotification();});
        assertEquals(expected, actual);
    }
}
