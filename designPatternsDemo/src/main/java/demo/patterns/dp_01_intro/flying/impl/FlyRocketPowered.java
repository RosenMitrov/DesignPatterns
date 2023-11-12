package demo.patterns.dp_01_intro.flying.impl;

import demo.patterns.dp_01_intro.flying.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Now I am flying with a rocket!");
    }
}
