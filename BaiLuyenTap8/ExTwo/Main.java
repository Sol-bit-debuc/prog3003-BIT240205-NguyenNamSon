package ExTwo;

interface Payment {

    void pay(double amount);
}

class CreditCardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng Credit Card.");
    }
}

class PayPalPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng PayPal.");
    }
}

class CashPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng tiền mặt.");
    }
}

abstract class PaymentFactory {

    public abstract Payment createPayment();
}

class CreditCardFactory extends PaymentFactory {

    public Payment createPayment() {
        return new CreditCardPayment();
    }
}

class PayPalFactory extends PaymentFactory {

    public Payment createPayment() {
        return new PayPalPayment();
    }
}

class CashFactory extends PaymentFactory {

    public Payment createPayment() {
        return new CashPayment();
    }
}

public class Main {

    public static void main(String[] args) {
        PaymentFactory factory;

        factory = new CreditCardFactory();
        Payment p1 = factory.createPayment();
        p1.pay(100);

        factory = new PayPalFactory();
        Payment p2 = factory.createPayment();
        p2.pay(200);

        factory = new CashFactory();
        Payment p3 = factory.createPayment();
        p3.pay(50);
    }
}
