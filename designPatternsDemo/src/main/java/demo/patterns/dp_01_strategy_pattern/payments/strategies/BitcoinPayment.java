package demo.patterns.dp_01_strategy_pattern.payments.strategies;

import demo.patterns.dp_01_strategy_pattern.payments.PaymentStrategy;

public class BitcoinPayment implements PaymentStrategy {

    @Override
    public void payAmount(int amount) {
        System.out.println("Payment method -> Bitcoin -> amount: " + amount);
    }
}
