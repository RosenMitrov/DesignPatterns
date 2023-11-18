package demo.patterns.dp_01_strategy_pattern.authenticator.auth;

import demo.patterns.dp_01_strategy_pattern.authenticator.AuthenticationStrategy;

public class OAuth2Auth implements AuthenticationStrategy {

    @Override
    public void authenticate() {
        System.out.println("OAuth2 Authentication.");
    }
}
