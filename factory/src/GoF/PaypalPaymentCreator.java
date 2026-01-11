package GoF;

import payment.Payment;
import payment.PaypalPayment;

public class PaypalPaymentCreator extends PaymentCreator {

    @Override
    protected Payment createPayment() {
        return new PaypalPayment();
    }
}
