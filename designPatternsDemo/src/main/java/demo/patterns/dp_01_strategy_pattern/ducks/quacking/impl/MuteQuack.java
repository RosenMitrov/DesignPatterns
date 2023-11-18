package demo.patterns.dp_01_strategy_pattern.ducks.quacking.impl;

import demo.patterns.dp_01_strategy_pattern.ducks.quacking.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Silence...");
    }
}
