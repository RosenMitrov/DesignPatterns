package demo.patterns.dp_01_strategy_pattern;

import demo.patterns.dp_01_strategy_pattern.flying.impl.FlyNoWay;
import demo.patterns.dp_01_strategy_pattern.quacking.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.setFlyBehaviour(new FlyNoWay());
        this.setQuackBehaviour(new Quack());
    }

    @Override
    protected void display() {
        System.out.println("I am model duck.");
    }
}
