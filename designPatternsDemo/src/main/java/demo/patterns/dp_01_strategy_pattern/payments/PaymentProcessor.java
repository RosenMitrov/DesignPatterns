package demo.patterns.dp_01_strategy_pattern.payments;

public class PaymentProcessor {

    private PaymentStrategy paymentStrategy;

    public void pay(int amount) {
        if (this.paymentStrategy != null) {
            this.paymentStrategy.payAmount(amount);
        } else {
            System.out.println("No payment processor.");
        }
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
