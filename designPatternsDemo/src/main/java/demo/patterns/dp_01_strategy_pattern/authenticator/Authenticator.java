package demo.patterns.dp_01_strategy_pattern.authenticator;

public class Authenticator {

    private AuthenticationStrategy authenticationStrategy;

    public Authenticator() {
    }

    public void setAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    public void auth() {
        if (this.authenticationStrategy != null) {
            this.authenticationStrategy.authenticate();
        } else {
            System.out.println("Authentication strategy should be set.");
        }
    }
}
