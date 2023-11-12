package demo.patterns.dp_01_intro.quacking.impl;

import demo.patterns.dp_01_intro.quacking.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I am squeaking...");
    }
}
