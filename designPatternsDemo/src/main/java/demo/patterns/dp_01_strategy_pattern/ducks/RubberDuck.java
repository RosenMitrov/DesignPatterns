package demo.patterns.dp_01_strategy_pattern.ducks;

import demo.patterns.dp_01_strategy_pattern.ducks.flying.impl.FlyNoWay;
import demo.patterns.dp_01_strategy_pattern.ducks.quacking.impl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.setFlyBehaviour(new FlyNoWay());
        this.setQuackBehaviour(new Squeak());
    }

    @Override
    protected void display() {
        System.out.println("I am rubber duck :)");
    }
}
