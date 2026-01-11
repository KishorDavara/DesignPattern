package simple;

public class PaypalPayment implements Payment{
    @Override
    public void process() {
        System.out.println("Processing PayPal simple.Payment");
    }
}
