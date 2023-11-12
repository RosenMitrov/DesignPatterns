package demo.patterns.dp_01_intro.quacking.impl;

import demo.patterns.dp_01_intro.quacking.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Silence...");
    }
}
