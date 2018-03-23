package com.dclouddev.wowcharacterviewer.wowcharacterviewer.models;

import java.util.List;

/**
 * Created by Cloud on 3/20/2018
 **/
public class Gear {

    private String gearType;
    private int id;
    private String name;
    private String icon;
    private int quality;
    private int ilvl;
    // TODO toolTipParams
    // TODO stats
    // TODO armor
    // TODO contex
    private List<Integer> bonusLists;
    private int artifactId;
    // TODO displayInfoId
    private int artifactAppearanceId;
    // TODO artifactTraits
    // TODO relics
    // TODO appearance


    public Gear(String gearType, int id, String name, String icon, int quality, int ilvl, List<Integer> bonusLists, int artifactId, int artifactAppearanceId)
    {
        this.gearType = gearType;
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.quality = quality;
        this.ilvl = ilvl;
        this.bonusLists = bonusLists;
        this.artifactId = artifactId;
        this.artifactAppearanceId = artifactAppearanceId;
    }

    public String getGearType() { return gearType; }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getIcon() { return icon; }

    public int getQuality() { return quality; }

    public int getIlvl() { return ilvl; }

    public List<Integer> getBonusLists() { return bonusLists; }

    public int getArtifactId() { return artifactId; }

    public int getArtifactAppearanceID() { return artifactAppearanceId; }

}
