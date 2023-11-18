package demo.patterns.dp_01_strategy_pattern.ducks;

import demo.patterns.dp_01_strategy_pattern.ducks.flying.impl.FlyWithWings;
import demo.patterns.dp_01_strategy_pattern.ducks.quacking.impl.Quack;

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
