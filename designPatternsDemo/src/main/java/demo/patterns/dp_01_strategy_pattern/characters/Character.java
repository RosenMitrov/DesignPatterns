package demo.patterns.dp_01_strategy_pattern.characters;

public abstract class Character {
    private WeaponBehaviour weaponBehaviour;
    abstract void fight();
}
