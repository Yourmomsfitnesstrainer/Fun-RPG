package classes.character;

import classes.CharacterClass;

public class Warrior extends CharacterClass {
    public Warrior(String name) {
       this.setLevel(1);
        this.setMaxManaPoints(200);
        this.setMaxHealthPoints(140);
        this.setHealtPoints(100);
        this.setManaPoints(70);
       this.setName(name);
       this.setAttackType(AttackType.PHYSICAL_RANGE);
       this.setAtackAmount(8);
    }
}
