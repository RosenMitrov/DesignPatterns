package demo.patterns.dp_01_intro.flying.impl;

import demo.patterns.dp_01_intro.flying.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am duck and I can fly.");
    }
}
