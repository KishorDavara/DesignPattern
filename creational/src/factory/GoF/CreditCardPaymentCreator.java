package factory.GoF;

import factory.payment.CreditCardPayment;
import factory.payment.Payment;

public class CreditCardPaymentCreator extends PaymentCreator {

    @Override
    protected Payment createPayment() {
        return new CreditCardPayment();
    }
}
