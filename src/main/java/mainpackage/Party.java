package mainpackage;

import classes.CharacterClass;
import classes.dungeons.DungeonOfCrabs;

public class Party {
    private CharacterClass[] partyMembers;

    public Party(CharacterClass... members) {
        partyMembers = new CharacterClass[members.length];
        for (int i = 0; i < partyMembers.length; i++) {
            partyMembers[i] = members[i];

        }
    }

    public void enterDungeon(DungeonOfCrabs dungeon) {
        dungeon.open(this);
    }

    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }

    public void info() {
        for (CharacterClass partyMember : partyMembers) {
            partyMember.info();
        }
    }
}
