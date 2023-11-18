package demo.patterns.dp_01_strategy_pattern.characters;

public class King extends Character {

    @Override
    void fight() {
        System.out.print("Im am King and ");
        performWeapon();
    }
}
