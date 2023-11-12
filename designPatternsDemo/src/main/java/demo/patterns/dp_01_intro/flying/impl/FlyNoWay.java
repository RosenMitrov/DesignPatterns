package demo.patterns.dp_01_intro.flying.impl;

import demo.patterns.dp_01_intro.flying.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}
