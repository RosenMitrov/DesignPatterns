package demo.patterns.dp_01_strategy_pattern;

import demo.patterns.dp_01_strategy_pattern.flying.impl.FlyNoWay;
import demo.patterns.dp_01_strategy_pattern.quacking.impl.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.setFlyBehaviour(new FlyNoWay());
        this.setQuackBehaviour(new MuteQuack());
    }

    @Override
    protected void display() {
        System.out.println("I am decoy duck :)");
    }
}
