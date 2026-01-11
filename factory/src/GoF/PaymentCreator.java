package GoF;

import payment.Payment;

public abstract class PaymentCreator {
    //Factory Method
    protected abstract Payment createPayment();

    //Business logic that uses the product
    public void processPayment() {
        Payment payment = createPayment();
        payment.process();
    }
}
