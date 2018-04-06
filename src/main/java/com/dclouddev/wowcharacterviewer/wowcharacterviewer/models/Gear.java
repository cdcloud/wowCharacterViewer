package com.dclouddev.wowcharacterviewer.wowcharacterviewer.models;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by Cloud on 3/20/2018
 **/
public class Gear {

    private String gearType;
    private int id;
    private String name;
    private String icon;
    private String quality;
    private int ilvl;
    // TODO toolTipParams
    // TODO stats
    // TODO armor
    // TODO contex
    private JSONArray bonusLists;
    private int artifactId;
    // TODO displayInfoId
    private int artifactAppearanceId;
    // TODO artifactTraits
    // TODO relics
    // TODO appearance


//    public Gear(String gearType, int id, String name, String icon, int quality, int ilvl, List<Integer> bonusLists, int artifactId, int artifactAppearanceId)
//    {
//        this.gearType = gearType;
//        this.id = id;
//        this.name = name;
//        this.icon = icon;
//        this.quality = quality;
//        this.ilvl = ilvl;
////        this.bonusLists = bonusLists;
//        this.artifactId = artifactId;
//        this.artifactAppearanceId = artifactAppearanceId;
//    }

    public Gear(String gearType, JSONObject gear)
    {
        this.gearType = gearType;
        this.id = gear.getInt("id");
        this.name = gear.getString("name");
        this.icon = gear.getString("icon");
        switch(gear.getInt("quality"))
        {
            case 0: this.quality = "Trash"; break;
            case 1: this.quality = "Common"; break;
            case 2: this.quality = "Uncommon"; break;
            case 3: this.quality = "Rare"; break;
            case 4: this.quality = "Epic"; break;
            case 5: this.quality = "Legendary"; break;
            default: this.quality = "Could Not Determine"; break;
        }
        this.ilvl = gear.getInt("itemLevel");
        this.bonusLists = gear.getJSONArray("bonusLists");
        this.artifactId = gear.getInt("artifactId");
        this.artifactAppearanceId = gear.getInt("artifactAppearanceId");
    }

    public String getGearType() { return gearType; }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getIcon() { return icon; }

    public String getQuality() { return quality; }

    public int getIlvl() { return ilvl; }

    public JSONArray getBonusLists() { return bonusLists; }

    public int getArtifactId() { return artifactId; }

    public int getArtifactAppearanceID() { return artifactAppearanceId; }

}
