package demo.patterns.dp_01_strategy_pattern.characters;

public class Troll extends Character {

    @Override
    void fight() {
        this.weaponBehaviour.useWeapon();
    }
}
