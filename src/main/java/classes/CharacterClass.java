package classes;

import classes.character.AttackType;

public abstract class CharacterClass implements BaseClass {
    private int healtPoints;
    private int manaPoints;
    private int level;
    private AttackType attackType;
    private int atackAmount;
    private String name;
    private int maxHealthPoints;
    private int maxManaPoints;


    public void attack() {

    }

    public void restoreHealth(int amount) {
        setHealtPoints(this.healtPoints + amount);
    }

    public void loseHealth(int amount) {
        setHealtPoints(this.healtPoints - amount);
    }

    public void restoreMana(int amount) {
        setManaPoints(this.manaPoints - amount);
    }

    public void loseMana(int amount) {
        setManaPoints(this.manaPoints - amount);
    }

    public void levelUp() {

    }

    public void info() {
        System.out.println("Name:   " + this.name + "\nCurrentHp:" + this.healtPoints +
                "\nCurrentMP: " + this.manaPoints + "\nCurrentLVL:" + this.level);
    }

    public int getHealtPoints() {
        return healtPoints;
    }

    public void setHealtPoints(int healt) {
        if (healtPoints < 0) this.healtPoints = 0;
        else if (healtPoints > this.maxHealthPoints) this.healtPoints = this.maxHealthPoints;
        else this.healtPoints = healt;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        if (manaPoints < 0) this.manaPoints = 0;
        else if (manaPoints > this.maxManaPoints) this.manaPoints = this.maxManaPoints;
        else this.manaPoints = manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 0) System.out.println("Нельзя деградировать настолько сильно! ");
        this.level = level;
    }

    public int getAtackAmount() {
        return atackAmount;
    }

    public void setAtackAmount(int atackAmount) {
        if(atackAmount < 0) System.out.println("Ты не можешь хилить атакой");
        else this.atackAmount = atackAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }
}

