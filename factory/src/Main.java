import GoF.CreditCardPaymentCreator;
import GoF.PaymentCreator;
import GoF.PaypalPaymentCreator;
import payment.Payment;
import simple.PaymentFactory;

public class Main {
    public static void main(String[] args) {
        //Simple Way
        Payment payment = PaymentFactory.getPaymentMethod("credit");
        payment.process();

        payment = PaymentFactory.getPaymentMethod("paypal");
        payment.process();

        //GoF Way
        PaymentCreator paymentCreator = new CreditCardPaymentCreator();
        paymentCreator.processPayment();

        paymentCreator = new PaypalPaymentCreator();
        paymentCreator.processPayment();
    }
}