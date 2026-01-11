package simple;

import java.util.Objects;

public class PaymentFactory {

    public static Payment getPaymentMethod(String type) {
        if(Objects.isNull(type)) {
            throw new IllegalArgumentException("simple.Payment type can not be null or empty");
        }

        return switch (type.toUpperCase()) {
            case "CREDIT" -> new CreditCardPayment();
            case "PAYPAL" -> new PaypalPayment();
            default -> throw new IllegalArgumentException("Invalid payment method");
        };
    }
}
