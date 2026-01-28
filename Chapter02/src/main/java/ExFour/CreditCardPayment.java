package ExFour;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng");
    }
}
