package GoF;

import payment.CreditCardPayment;
import payment.Payment;

public class CreditCardPaymentCreator extends PaymentCreator {

    @Override
    protected Payment createPayment() {
        return new CreditCardPayment();
    }
}
