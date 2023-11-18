package demo.patterns.dp_01_strategy_pattern.characters;

public abstract class Character {
    protected WeaponBehaviour weaponBehaviour;

    abstract void fight();
    
    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
