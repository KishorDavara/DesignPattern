package strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        cart.setPaymentStrategy(new PaypalPayment());
        cart.checkout(300);
    }
}
