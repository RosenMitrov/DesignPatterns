package demo.patterns.dp_01_strategy_pattern.characters;

public class Queen extends Character {

    @Override
    void fight() {
        System.out.print("Im am Queen and ");
        performWeapon();
    }
}
