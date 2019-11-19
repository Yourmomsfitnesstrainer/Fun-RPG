package classes.dungeons;

import mainpackage.Party;

public class DungeonOfCrabs implements BasicDungeon {
    private boolean isOpened = false;

    public boolean open(Party party) {
        if (party.getPartyMembers().length < 3) {
            System.out.println("Набери ещё ребят");
            isOpened = false;

        }
        else {
            System.out.println("Добрейший вечерочек, гости мои");
            isOpened = true;
        }
        return isOpened;
    }

}
