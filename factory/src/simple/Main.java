package simple;

public class Main {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPaymentMethod("credit");
        payment.process();

        payment = PaymentFactory.getPaymentMethod("paypal");
        payment.process();
    }
}