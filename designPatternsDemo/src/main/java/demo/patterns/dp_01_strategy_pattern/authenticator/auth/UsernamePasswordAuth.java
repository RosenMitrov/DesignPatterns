package demo.patterns.dp_01_strategy_pattern.authenticator.auth;

import demo.patterns.dp_01_strategy_pattern.authenticator.AuthenticationStrategy;

public class UsernamePasswordAuth implements AuthenticationStrategy {

    @Override
    public void authenticate() {
        System.out.println("Authentication with username and password.");
    }
}
