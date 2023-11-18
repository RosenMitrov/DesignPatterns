package demo.patterns.dp_01_strategy_pattern.characters;

public class KnifeBehaviourImpl implements WeaponBehaviour {
    
    @Override
    public void useWeapon() {
        System.out.println("I am using my knife.");
    }
}
