package classes.character;

import classes.CharacterClass;

public class Healer extends CharacterClass {
    public Healer(String name) {
        this.setLevel(1);
        this.setMaxManaPoints(320);
        this.setMaxHealthPoints(120);
        this.setHealtPoints(60);
        this.setManaPoints(100);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGE);
        this.setAtackAmount(2);
    }
}
