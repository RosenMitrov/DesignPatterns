package demo.patterns.dp_01_strategy_pattern.characters;

public abstract class Character {
    protected WeaponBehaviour weaponBehaviour;
    abstract void fight();
}
