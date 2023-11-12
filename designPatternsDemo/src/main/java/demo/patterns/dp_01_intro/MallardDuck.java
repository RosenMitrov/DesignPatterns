package demo.patterns.dp_01_intro;

import demo.patterns.dp_01_intro.flying.impl.FlyWithWings;
import demo.patterns.dp_01_intro.quacking.impl.Quack;

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
