package demo.patterns.dp_01_strategy_pattern.characters.behaviours;

import demo.patterns.dp_01_strategy_pattern.characters.WeaponBehaviour;

public class BareHandsBehaviourImpl implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("I am fighting with bare hands.");
    }
}
