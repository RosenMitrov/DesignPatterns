package demo.patterns.dp_01_strategy_pattern.ducks.flying.impl;

import demo.patterns.dp_01_strategy_pattern.ducks.flying.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Now I am flying with a rocket!");
    }
}
