package ExFour;

public class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Thanh toán " + amount + " bằng PayPal");
    }
}
