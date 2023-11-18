package demo.patterns.dp_01_strategy_pattern.characters;

import demo.patterns.dp_01_strategy_pattern.characters.behaviours.BareHandsBehaviourImpl;

public abstract class Character {
    private WeaponBehaviour weaponBehaviour;

    abstract void fight();

    void performWeapon() {
        if (this.weaponBehaviour == null) {
            this.setWeaponBehaviour(new BareHandsBehaviourImpl());
        }
        this.weaponBehaviour.useWeapon();
    }
    
    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
