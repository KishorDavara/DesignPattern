package factory.GoF;

import factory.payment.Payment;
import factory.payment.PaypalPayment;

public class PaypalPaymentCreator extends PaymentCreator {

    @Override
    protected Payment createPayment() {
        return new PaypalPayment();
    }
}
