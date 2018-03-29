package com.dclouddev.wowcharacterviewer.wowcharacterviewer.models;

public class Character
{
    String name;
    String realm;
    String gameClass;
    String race;
    String gender;
    int level;
    String thumbnail;
    String faction;
    int averageIlvl;
    int averageIlvlEquipped;
    Gear head;
    Gear neck;
    Gear shoulder;
    Gear back;
    Gear chest;
    Gear shirt;
    Gear wrist;
    Gear hands;
    Gear waist;
    Gear legs;
    Gear feet;
    Gear finger1;
    Gear finger2;
    Gear trinket1;
    Gear trinket2;
    Gear mainHand;
    Gear offHand;

    public Character(String name, String realm, int gameClass, int race, int gender, int level, String thumbnail, int faction, int averageIlvl, int averageIlvlEquipped, Gear head, Gear neck, Gear shoulder, Gear back, Gear chest, Gear shirt, Gear wrist, Gear hands, Gear waist, Gear legs, Gear feet, Gear finger1, Gear finger2, Gear trinket1, Gear trinket2, Gear mainHand, Gear offHand)
    {
        this.name = name;
        this.realm = realm;
        switch(gameClass)
        {
            case 1: this.gameClass = "Warrior"; break;
            case 2: this.gameClass = "Paladin"; break;
            case 3: this.gameClass = "Hunter"; break;
            case 4: this.gameClass = "Rogue"; break;
            case 5: this.gameClass = "Priest"; break;
            case 6: this.gameClass = "Death Knight"; break;
            case 7: this.gameClass = "Shaman"; break;
            case 8: this.gameClass = "Mage"; break;
            case 9: this.gameClass = "Warlock"; break;
            case 10: this.gameClass = "Monk"; break;
            case 11: this.gameClass = "Druid"; break;
            case 12: this.gameClass = "Demon Hunter"; break;
            default: this.gameClass = "Could Not Determine"; break;

        }
        switch (race)
        {
            case 1: this.race = "Human"; break;
            case 2: this.race = "Orc"; break;
            case 3: this.race = "Dwarf"; break;
            case 4: this.race = "Night Elf"; break;
            case 5: this.race = "Undead"; break;
            case 6: this.race = "Tauren"; break;
            case 7: this.race = "Gnome"; break;
            case 8: this.race = "Troll"; break;
            case 9: this.race = "Goblin"; break;
            case 10: this.race = "Blood Elf"; break;
            case 11: this.race = "Draenei"; break;
            case 22: this.race = "Worgen"; break;
            case 24: this.race = "Pandaren"; break;
            case 25: this.race = "Pandaren"; break;
            case 26: this.race = "Pandaren"; break;
            case 27: this.race = "Nightborne"; break;
            case 28: this.race = "Highmountain Tauren"; break;
            case 29: this.race = "Void Elf"; break;
            case 30: this.race = "Lightforged Draenei"; break;
            default: this.race = "Could Not Determine"; break;
        }
        switch (gender)
        {
            case 0: this.gender = "Male"; break;
            case 1: this.gender = "Female"; break;
            default: this.gender = "Could Not Determine"; break;
        }
        this.level = level;
        this.thumbnail = thumbnail;
        switch (faction)
        {
            case 0: this.faction = "Alliance"; break;
            case 1: this.faction = "Horde"; break;
            default: this.faction = "Could Not Determine"; break;
        }
        this.averageIlvl = averageIlvl;
        this.averageIlvlEquipped = averageIlvlEquipped;
        this.head = head;
        this.neck = neck;
        this.shoulder = shoulder;
        this.back = back;
        this.chest = chest;
        this.shirt = shirt;
        this.wrist = wrist;
        this.hands = hands;
        this.waist = waist;
        this.legs = legs;
        this.feet = feet;
        this.finger1 = finger1;
        this.finger2 = finger2;
        this.trinket1 = trinket1;
        this.trinket2 = trinket2;
        this.mainHand = mainHand;
        this.offHand = offHand;
    }

    public String getName() { return name; }

    public String getRealm() { return realm; }

    public String getGameClass() { return gameClass; }

    public String getRace() { return race; }

    public String getGender() { return gender; }

    public int getLevel() { return level; }

    public String getThumbnail() { return thumbnail; }

    public String getFaction() { return faction; }

    public int getAverageIlvl() { return averageIlvl; }

    public int getAverageIlvlEquipped() { return averageIlvlEquipped; }

    public Gear getHead() { return head; }

    public Gear getNeck() { return neck; }

    public Gear getShoulder() { return shoulder; }

    public Gear getBack() { return back; }

    public Gear getChest() { return chest; }

    public Gear getShirt() { return shirt; }

    public Gear getWrist() { return wrist; }

    public Gear getHands() { return hands; }

    public Gear getWaist() { return waist; }

    public Gear getLegs() { return legs; }

    public Gear getFeet() { return feet; }

    public Gear getFinger1() { return finger1; }

    public Gear getFinger2() { return finger2; }

    public Gear getTrinket1() { return trinket1; }

    public Gear getTrinket2() { return trinket2; }

    public Gear getMainHand() { return mainHand; }

    public Gear getOffHand() { return offHand; }
}
