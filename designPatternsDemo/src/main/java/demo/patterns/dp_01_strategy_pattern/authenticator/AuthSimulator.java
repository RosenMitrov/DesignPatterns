package demo.patterns.dp_01_strategy_pattern.authenticator;

import demo.patterns.dp_01_strategy_pattern.authenticator.auth.BiometricAuth;
import demo.patterns.dp_01_strategy_pattern.authenticator.auth.OAuth2Auth;
import demo.patterns.dp_01_strategy_pattern.authenticator.auth.UsernamePasswordAuth;

public class AuthSimulator {
    public static void main(String[] args) {
        Authenticator authenticator = new Authenticator();
        authenticator.auth();
        System.out.println("***");
        authenticator.setAuthenticationStrategy(new UsernamePasswordAuth());
        authenticator.auth();
        System.out.println("***");
        authenticator.setAuthenticationStrategy (new OAuth2Auth());
        authenticator.auth();
        System.out.println("***");
        authenticator.setAuthenticationStrategy(new BiometricAuth());
        authenticator.auth();
    }
}
