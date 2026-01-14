package factory.simple;

import factory.payment.CreditCardPayment;
import factory.payment.Payment;
import factory.payment.PaypalPayment;

import java.util.Objects;

public class PaymentFactory {

    public static Payment getPaymentMethod(String type) {
        if(Objects.isNull(type)) {
            throw new IllegalArgumentException("payment.Payment type can not be null or empty");
        }

        return switch (type.toUpperCase()) {
            case "CREDIT" -> new CreditCardPayment();
            case "PAYPAL" -> new PaypalPayment();
            default -> throw new IllegalArgumentException("Invalid payment method");
        };
    }
}
