package mainpackage;

import classes.character.Archer;
import classes.character.Healer;
import classes.character.Mage;
import classes.character.Warrior;
import classes.dungeons.DungeonOfCrabs;

public class Main {

    public static void main(String[] args) {
        Party party = new Party(new Mage("Gey"), new Warrior("Jopa"),
                new Archer("Lovkach"), new Healer("Бесполезная залупа"));
        party.info();
        DungeonOfCrabs dungeonOfCrabs = new DungeonOfCrabs();
        System.out.println(" ");
        party.enterDungeon(dungeonOfCrabs);

    }
}
