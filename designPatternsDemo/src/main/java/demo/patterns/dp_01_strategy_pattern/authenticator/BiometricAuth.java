package demo.patterns.dp_01_strategy_pattern.authenticator;

public class BiometricAuth implements AuthenticationStrategy {

    @Override
    public void authenticate() {
        System.out.println("Biometric Authentication.");
    }
}
