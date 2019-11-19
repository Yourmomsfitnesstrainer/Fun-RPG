package classes.character;

import classes.CharacterClass;

public class Mage  extends CharacterClass {
    public Mage(String name) {
        this.setLevel(1);
        this.setMaxManaPoints(400);
        this.setMaxHealthPoints(300);
        this.setHealtPoints(50);
        this.setManaPoints(120);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAtackAmount(5);
    }
}
