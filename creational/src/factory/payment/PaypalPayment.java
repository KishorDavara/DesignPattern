package factory.payment;

public class PaypalPayment implements Payment{
    @Override
    public void process() {
        System.out.println("Processing PayPal payment.");
    }
}
