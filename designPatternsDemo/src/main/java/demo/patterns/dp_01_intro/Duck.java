package demo.patterns.dp_01_intro;

import demo.patterns.dp_01_intro.flying.FlyBehaviour;
import demo.patterns.dp_01_intro.quacking.QuackBehaviour;

public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck() {
    }

    protected abstract void display();

    protected void swim() {
        System.out.println("Every duck can swim, even decoys!");
    }

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performQuack() {
        this.quackBehaviour.quack();
    }

    protected void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    protected void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
