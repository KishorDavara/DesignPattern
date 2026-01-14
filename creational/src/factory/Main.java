package factory;

import factory.GoF.CreditCardPaymentCreator;
import factory.GoF.PaymentCreator;
import factory.GoF.PaypalPaymentCreator;
import factory.payment.Payment;
import factory.simple.PaymentFactory;

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