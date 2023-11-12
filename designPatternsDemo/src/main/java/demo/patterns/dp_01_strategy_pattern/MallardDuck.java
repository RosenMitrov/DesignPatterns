package demo.patterns.dp_01_strategy_pattern;

import demo.patterns.dp_01_strategy_pattern.flying.impl.FlyWithWings;
import demo.patterns.dp_01_strategy_pattern.quacking.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.setFlyBehaviour(new FlyWithWings());
        this.setQuackBehaviour(new Quack());
    }

    @Override
    protected void display() {
        System.out.println("I am mallard duck :)");
    }
}
