package demo.patterns.dp_01_strategy_pattern.payments;

import demo.patterns.dp_01_strategy_pattern.payments.strategies.BitcoinPayment;
import demo.patterns.dp_01_strategy_pattern.payments.strategies.CreditCardPayment;
import demo.patterns.dp_01_strategy_pattern.payments.strategies.DebitCardPayment;
import demo.patterns.dp_01_strategy_pattern.payments.strategies.PaypalPayment;

public class PaymentSimulator {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentStrategy(new CreditCardPayment());
        processor.pay(10);

        processor.setPaymentStrategy(new DebitCardPayment());
        processor.pay(20);

        processor.setPaymentStrategy(new BitcoinPayment());
        processor.pay(10);

        processor.setPaymentStrategy(new PaypalPayment());
        processor.pay(15);
    }
}
