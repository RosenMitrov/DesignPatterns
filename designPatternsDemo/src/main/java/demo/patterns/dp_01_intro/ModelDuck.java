package demo.patterns.dp_01_intro;

import demo.patterns.dp_01_intro.flying.impl.FlyNoWay;
import demo.patterns.dp_01_intro.quacking.impl.Quack;

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
