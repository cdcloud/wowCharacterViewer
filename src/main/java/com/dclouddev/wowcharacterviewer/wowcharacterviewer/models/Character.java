package com.dclouddev.wowcharacterviewer.wowcharacterviewer.models;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Map;

public class Character
{
    private String name;
    private String realm;
    private String gameClass;
    private String race;
    private String gender;
    private int level;
    private String thumbnail;
    private String faction;
    private int averageIlvl;
    private int averageIlvlEquipped;
    private Gear head;
    private Gear neck;
    private Gear shoulder;
    private Gear back;
    private Gear chest;
    private Gear shirt;
    private Gear wrist;
    private Gear hands;
    private Gear waist;
    private Gear legs;
    private Gear feet;
    private Gear finger1;
    private Gear finger2;
    private Gear trinket1;
    private Gear trinket2;
    private Gear mainHand;
    private Gear offHand;

//    public Character(String name, String realm, int gameClass, int race, int gender, int level, String thumbnail, int faction, int averageIlvl, int averageIlvlEquipped, Gear head, Gear neck, Gear shoulder, Gear back, Gear chest, Gear shirt, Gear wrist, Gear hands, Gear waist, Gear legs, Gear feet, Gear finger1, Gear finger2, Gear trinket1, Gear trinket2, Gear mainHand, Gear offHand)
//    {
//        this.name = name;
//        this.realm = realm;
//        switch(gameClass)
//        {
//            case 1: this.gameClass = "Warrior"; break;
//            case 2: this.gameClass = "Paladin"; break;
//            case 3: this.gameClass = "Hunter"; break;
//            case 4: this.gameClass = "Rogue"; break;
//            case 5: this.gameClass = "Priest"; break;
//            case 6: this.gameClass = "Death Knight"; break;
//            case 7: this.gameClass = "Shaman"; break;
//            case 8: this.gameClass = "Mage"; break;
//            case 9: this.gameClass = "Warlock"; break;
//            case 10: this.gameClass = "Monk"; break;
//            case 11: this.gameClass = "Druid"; break;
//            case 12: this.gameClass = "Demon Hunter"; break;
//            default: this.gameClass = "Could Not Determine"; break;
//
//        }
//        switch (race)
//        {
//            case 1: this.race = "Human"; break;
//            case 2: this.race = "Orc"; break;
//            case 3: this.race = "Dwarf"; break;
//            case 4: this.race = "Night Elf"; break;
//            case 5: this.race = "Undead"; break;
//            case 6: this.race = "Tauren"; break;
//            case 7: this.race = "Gnome"; break;
//            case 8: this.race = "Troll"; break;
//            case 9: this.race = "Goblin"; break;
//            case 10: this.race = "Blood Elf"; break;
//            case 11: this.race = "Draenei"; break;
//            case 22: this.race = "Worgen"; break;
//            case 24: this.race = "Pandaren"; break;
//            case 25: this.race = "Pandaren"; break;
//            case 26: this.race = "Pandaren"; break;
//            case 27: this.race = "Nightborne"; break;
//            case 28: this.race = "Highmountain Tauren"; break;
//            case 29: this.race = "Void Elf"; break;
//            case 30: this.race = "Lightforged Draenei"; break;
//            default: this.race = "Could Not Determine"; break;
//        }
//        switch (gender)
//        {
//            case 0: this.gender = "Male"; break;
//            case 1: this.gender = "Female"; break;
//            default: this.gender = "Could Not Determine"; break;
//        }
//        this.level = level;
//        this.thumbnail = thumbnail;
//        switch (faction)
//        {
//            case 0: this.faction = "Alliance"; break;
//            case 1: this.faction = "Horde"; break;
//            default: this.faction = "Could Not Determine"; break;
//        }
//        this.averageIlvl = averageIlvl;
//        this.averageIlvlEquipped = averageIlvlEquipped;
//        this.head = head;
//        this.neck = neck;
//        this.shoulder = shoulder;
//        this.back = back;
//        this.chest = chest;
//        this.shirt = shirt;
//        this.wrist = wrist;
//        this.hands = hands;
//        this.waist = waist;
//        this.legs = legs;
//        this.feet = feet;
//        this.finger1 = finger1;
//        this.finger2 = finger2;
//        this.trinket1 = trinket1;
//        this.trinket2 = trinket2;
//        this.mainHand = mainHand;
//        this.offHand = offHand;
//    }

    public Character(JSONObject character, Map<String, Gear> gearList)
    {
        this.name = character.getString("name");
        this.realm = character.getString("realm");
        switch(character.getInt("class"))
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
        switch (character.getInt("race"))
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
        switch (character.getInt("gender"))
        {
            case 0: this.gender = "Male"; break;
            case 1: this.gender = "Female"; break;
            default: this.gender = "Could Not Determine"; break;
        }
        this.level = character.getInt("level");
        this.thumbnail = character.getString("thumbnail");
        switch (character.getInt("faction"))
        {
            case 0: this.faction = "Alliance"; break;
            case 1: this.faction = "Horde"; break;
            default: this.faction = "Could Not Determine"; break;
        }
        this.averageIlvl = character.getJSONObject("items").getInt("averageItemLevel");
        this.averageIlvlEquipped = character.getJSONObject("items").getInt("averageItemLevelEquipped");
        this.head = gearList.get("head");
        this.neck = gearList.get("neck");
        this.shoulder = gearList.get("shoulder");
        this.back = gearList.get("back");
        this.chest = gearList.get("chest");
        this.shirt = gearList.get("shirt");
        this.wrist = gearList.get("wrist");
        this.hands = gearList.get("hands");
        this.waist = gearList.get("waist");
        this.legs = gearList.get("legs");
        this.feet = gearList.get("feet");
        this.finger1 = gearList.get("finger1");
        this.finger2 = gearList.get("finger2");
        this.trinket1 = gearList.get("trinket1");
        this.trinket2 = gearList.get("trinket2");
        this.mainHand = gearList.get("mainHand");
        this.offHand = gearList.get("offHand");
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
