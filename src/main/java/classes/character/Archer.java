package classes.character;

import classes.CharacterClass;

public class Archer extends CharacterClass {
    public Archer(String name){
        this.setLevel(1);
        this.setMaxManaPoints(200);
        this.setMaxHealthPoints(200);
        this.setHealtPoints(70);
        this.setManaPoints(90);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGE);
        this.setAtackAmount(7);
    }
}
