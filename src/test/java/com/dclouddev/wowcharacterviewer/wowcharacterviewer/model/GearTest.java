package com.dclouddev.wowcharacterviewer.wowcharacterviewer.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GearTest
{
    private Gear trashGear;
    private Gear commonGear;
    private Gear uncommonGear;
    private Gear rareGear;
    private Gear epicGear;
    private Gear legendaryGear;
    private Gear artifactGear;
    private Gear notDeterminedGear;

    @Before
    public void setUp() throws JSONException
    {
        System.out.println("Gear Setup");
        String gearType = "trinket2";
        JSONObject trashObject = new JSONObject("{\"artifactTraits\":[],\"icon\":\"inv_antorus_red\",\"relics\":[],\"quality\":0,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{},\"stats\":[{\"stat\":4,\"amount\":5238}],\"bonusLists\":[3984,3997],\"name\":\"Khaz'goroth's Courage\",\"context\":\"raid-normal\",\"artifactId\":0,\"id\":154176,\"tooltipParams\":{\"timewalkerLevel\":110},\"itemLevel\":1000}");
        JSONObject commonObject = new JSONObject("{\"artifactTraits\":[],\"icon\":\"inv_antorus_red\",\"relics\":[],\"quality\":1,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{},\"stats\":[{\"stat\":4,\"amount\":5238}],\"bonusLists\":[3984,3997],\"name\":\"Khaz'goroth's Courage\",\"context\":\"raid-normal\",\"artifactId\":0,\"id\":154176,\"tooltipParams\":{\"timewalkerLevel\":110},\"itemLevel\":1000}");
        JSONObject uncommonObject = new JSONObject("{\"artifactTraits\":[],\"icon\":\"inv_antorus_red\",\"relics\":[],\"quality\":2,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{},\"stats\":[{\"stat\":4,\"amount\":5238}],\"bonusLists\":[3984,3997],\"name\":\"Khaz'goroth's Courage\",\"context\":\"raid-normal\",\"artifactId\":0,\"id\":154176,\"tooltipParams\":{\"timewalkerLevel\":110},\"itemLevel\":1000}");
        JSONObject rareObject = new JSONObject("{\"artifactTraits\":[],\"icon\":\"inv_antorus_red\",\"relics\":[],\"quality\":3,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{},\"stats\":[{\"stat\":4,\"amount\":5238}],\"bonusLists\":[3984,3997],\"name\":\"Khaz'goroth's Courage\",\"context\":\"raid-normal\",\"artifactId\":0,\"id\":154176,\"tooltipParams\":{\"timewalkerLevel\":110},\"itemLevel\":1000}");
        JSONObject epicObject = new JSONObject("{\"artifactTraits\":[],\"icon\":\"inv_antorus_red\",\"relics\":[],\"quality\":4,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{},\"stats\":[{\"stat\":4,\"amount\":5238}],\"bonusLists\":[3984,3997],\"name\":\"Khaz'goroth's Courage\",\"context\":\"raid-normal\",\"artifactId\":0,\"id\":154176,\"tooltipParams\":{\"timewalkerLevel\":110},\"itemLevel\":1000}");
        JSONObject legendaryObject = new JSONObject("{\"artifactTraits\":[],\"icon\":\"inv_antorus_red\",\"relics\":[],\"quality\":5,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{},\"stats\":[{\"stat\":4,\"amount\":5238}],\"bonusLists\":[3984,3997],\"name\":\"Khaz'goroth's Courage\",\"context\":\"raid-normal\",\"artifactId\":0,\"id\":154176,\"tooltipParams\":{\"timewalkerLevel\":110},\"itemLevel\":1000}");
        JSONObject artifactObject = new JSONObject("{\"artifactTraits\":[],\"icon\":\"inv_antorus_red\",\"relics\":[],\"quality\":6,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{},\"stats\":[{\"stat\":4,\"amount\":5238}],\"bonusLists\":[3984,3997],\"name\":\"Khaz'goroth's Courage\",\"context\":\"raid-normal\",\"artifactId\":0,\"id\":154176,\"tooltipParams\":{\"timewalkerLevel\":110},\"itemLevel\":1000}");
        JSONObject notDeterminedObject = new JSONObject("{\"artifactTraits\":[],\"icon\":\"inv_antorus_red\",\"relics\":[],\"quality\":7,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{},\"stats\":[{\"stat\":4,\"amount\":5238}],\"bonusLists\":[3984,3997],\"name\":\"Khaz'goroth's Courage\",\"context\":\"raid-normal\",\"artifactId\":0,\"id\":154176,\"tooltipParams\":{\"timewalkerLevel\":110},\"itemLevel\":1000}");
        this.trashGear = new Gear(gearType, trashObject);
        this.commonGear = new Gear(gearType, commonObject);
        this.uncommonGear = new Gear(gearType, uncommonObject);
        this.rareGear = new Gear(gearType, rareObject);
        this.epicGear = new Gear(gearType, epicObject);
        this.legendaryGear = new Gear(gearType, legendaryObject);
        this.artifactGear = new Gear(gearType, artifactObject);
        this.notDeterminedGear = new Gear(gearType, notDeterminedObject);

    }

    @After
    public void tearDown()
    {
        System.out.println("Gear Tear Down");
        this.trashGear= null;
        this.commonGear= null;
        this.uncommonGear= null;
        this.rareGear= null;
        this.epicGear= null;
        this.legendaryGear= null;
        this.artifactGear= null;
        this.notDeterminedGear= null;
    }

    @Test
    public void canGetGearType()
    {
        System.out.println("canGetGearType");
        String type = epicGear.getGearType();
        assertEquals("trinket2", type);
    }

    @Test
    public void canGetId()
    {
        System.out.println("canGetId");
        int id = epicGear.getId();
        assertEquals(154176, id);
    }

    @Test
    public void canGetName()
    {
        System.out.println("canGetName");
        String name = epicGear.getName();
        assertEquals("Khaz'goroth's Courage", name);
    }

    @Test
    public void canGetIcon()
    {
        System.out.println("canGetIcon");
        String icon = epicGear.getIcon();
        assertEquals("inv_antorus_red", icon);
    }

    @Test
    public void canGetQuality()
    {
        System.out.println("canGetQuality");
        String trash = trashGear.getQuality();
        assertEquals("Trash", trash);

        String common = commonGear.getQuality();
        assertEquals("Common", common);

        String uncommon = uncommonGear.getQuality();
        assertEquals("Uncommon", uncommon);

        String rare = rareGear.getQuality();
        assertEquals("Rare", rare);

        String epic = epicGear.getQuality();
        assertEquals("Epic", epic);

        String legendary = legendaryGear.getQuality();
        assertEquals("Legendary", legendary);

        String artifact = artifactGear.getQuality();
        assertEquals("Artifact", artifact);

        String notDetermined = notDeterminedGear.getQuality();
        assertEquals("Could Not Determine", notDetermined);
    }

    @Test
    public void canGetIlvl()
    {
        System.out.println("canGetIlvl");
        int ilvl = epicGear.getIlvl();
        assertEquals(1000, ilvl);
    }

    @Test
    public void canGetBonusLists()
    {
        System.out.println("canGetBonusLists");
        JSONArray bonusList = epicGear.getBonusLists();
        JSONArray expected = new JSONArray();
        expected.put(3984);
        expected.put(3997);
        assertEquals(expected, bonusList);
    }

    @Test
    public void canGetArtifactId()
    {
        System.out.println("canGetArtifactId");
        int artId = epicGear.getArtifactId();
        assertEquals(0, artId);
    }

    @Test
    public void canGetArtifactAppearanceId()
    {
        System.out.println("canGetArtifactAppearanceId");
        int artAppear = epicGear.getArtifactAppearanceId();
        assertEquals(0, artAppear);
    }
}
