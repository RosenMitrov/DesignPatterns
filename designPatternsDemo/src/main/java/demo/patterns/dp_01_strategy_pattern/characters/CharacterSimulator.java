package demo.patterns.dp_01_strategy_pattern.characters;

import demo.patterns.dp_01_strategy_pattern.characters.behaviours.AxeBehaviourImpl;
import demo.patterns.dp_01_strategy_pattern.characters.behaviours.KnifeBehaviourImpl;
import demo.patterns.dp_01_strategy_pattern.characters.behaviours.SwordBehaviourImpl;

public class CharacterSimulator {
    public static void main(String[] args) {
        Character king = new King();
        Queen queen = new Queen();
        Troll troll = new Troll();
        System.out.println("Perform default strategy");
        king.fight();
        queen.fight();
        troll.fight();
        System.out.println("Perform strategy changed ar runtime.");
        king.setWeaponBehaviour(new KnifeBehaviourImpl());
        queen.setWeaponBehaviour(new SwordBehaviourImpl());
        troll.setWeaponBehaviour(new AxeBehaviourImpl());
        king.fight();
        queen.fight();
        troll.fight();
    }
}
