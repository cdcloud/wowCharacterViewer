package com.dclouddev.wowcharacterviewer.wowcharacterviewer.model;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharacterTest
{


    private Character Female_Human_Warlock;
    private Character Male_Orc_Warrior;
    private Character Male_Dwarf_Hunter;
    private Character Female_NightElf_Druid;
    private Character Male_Undead_Priest;
    private Character Male_Tauren_Paladin;
    private Character Female_Gnome_Mage;
    private Character Male_Troll_Shaman;
    private Character Female_Goblin_Rogue;
    private Character Female_BloodElf_DeathKnight;
    private Character Female_Draenei_Paladin;
    private Character Male_Worgen_Druid;
    private Character Female_NeutralPandaren_Monk;
    private Character Male_AlliancePandaren_Monk;
    private Character Female_HordePandaren_Monk;
    private Character Female_Nightborne_Mage;
    private Character Male_HighmountainTauren_DemonHunter;
    private Character NA_VoidElf_NA;
    private Character NA_LightforgedDraenei_NA;


    @Before
    public void setUp() throws JSONException
    {
        System.out.println("Character Setup");
        JSONObject obj = new JSONObject("{\"totalHonorableKills\":6483,\"battlegroup\":\"Ruin\",\"thumbnail\":\"bleeding-hollow/174/182881454-avatar.jpg\",\"race\":2,\"gender\":0,\"level\":110,\"achievementPoints\":14235,\"faction\":1,\"name\":\"Draxkal\",\"realm\":\"Bleeding Hollow\",\"lastModified\":1523155907000,\"class\":1,\"items\":{\"trinket2\":{\"artifactTraits\":[],\"icon\":\"inv_antorus_red\",\"relics\":[],\"quality\":4,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{},\"stats\":[{\"stat\":4,\"amount\":5238}],\"bonusLists\":[3984,3997],\"name\":\"Khaz'goroth's Courage\",\"context\":\"raid-normal\",\"artifactId\":0,\"id\":154176,\"tooltipParams\":{\"timewalkerLevel\":110},\"itemLevel\":1000},\"feet\":{\"artifactTraits\":[],\"icon\":\"inv_boot_plate_legiondungeon_c_03\",\"relics\":[],\"quality\":4,\"displayInfoId\":163854,\"artifactAppearanceId\":0,\"armor\":612,\"appearance\":{\"transmogItemAppearanceModId\":0,\"itemId\":147059,\"itemAppearanceModId\":0},\"stats\":[{\"stat\":40,\"amount\":943},{\"stat\":49,\"amount\":667},{\"stat\":74,\"amount\":3124},{\"stat\":7,\"amount\":4687}],\"bonusLists\":[3536,1622,3337],\"name\":\"Trap Jammers\",\"context\":\"challenge-mode-jackpot\",\"artifactId\":0,\"id\":151330,\"tooltipParams\":{\"transmogItem\":147059,\"timewalkerLevel\":110},\"itemLevel\":970},\"trinket1\":{\"artifactTraits\":[],\"icon\":\"ability_bossmagistrix_timewarp1\",\"relics\":[],\"quality\":4,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{},\"stats\":[{\"stat\":72,\"amount\":2242}],\"bonusLists\":[3573,1482,3336],\"name\":\"Convergence of Fates\",\"context\":\"world-quest-10\",\"artifactId\":0,\"id\":140806,\"tooltipParams\":{\"timewalkerLevel\":110},\"itemLevel\":885},\"chest\":{\"artifactTraits\":[],\"icon\":\"inv_plate_raidwarrior_s_01chest\",\"relics\":[],\"quality\":4,\"displayInfoId\":167439,\"artifactAppearanceId\":0,\"armor\":842,\"appearance\":{\"transmogItemAppearanceModId\":0,\"itemId\":147068,\"itemAppearanceModId\":1},\"stats\":[{\"stat\":49,\"amount\":1173},{\"stat\":74,\"amount\":3300},{\"stat\":36,\"amount\":782},{\"stat\":7,\"amount\":4950}],\"bonusLists\":[3611,1487,3528],\"name\":\"Juggernaut Breastplate\",\"context\":\"raid-heroic\",\"artifactId\":0,\"id\":152178,\"tooltipParams\":{\"set\":[152179,152183,152178,152180],\"transmogItem\":147068,\"timewalkerLevel\":110},\"itemLevel\":945},\"hands\":{\"artifactTraits\":[],\"icon\":\"inv_plate_raidwarrior_s_01gloves\",\"relics\":[],\"quality\":4,\"displayInfoId\":162209,\"artifactAppearanceId\":0,\"armor\":532,\"appearance\":{\"transmogItemAppearanceModId\":0,\"itemId\":147189,\"itemAppearanceModId\":1},\"stats\":[{\"stat\":49,\"amount\":662},{\"stat\":74,\"amount\":2593},{\"stat\":36,\"amount\":832},{\"stat\":7,\"amount\":3890}],\"bonusLists\":[3611,1492,3336],\"name\":\"Juggernaut Gauntlets\",\"context\":\"raid-heroic\",\"artifactId\":0,\"id\":152180,\"tooltipParams\":{\"set\":[152179,152183,152178,152180],\"transmogItem\":147189,\"timewalkerLevel\":110},\"itemLevel\":950},\"back\":{\"artifactTraits\":[],\"icon\":\"inv_plate_raidwarrior_s_01cape\",\"relics\":[],\"quality\":4,\"displayInfoId\":164344,\"artifactAppearanceId\":0,\"armor\":173,\"appearance\":{\"transmogItemAppearanceModId\":4,\"itemId\":147188,\"enchantDisplayInfoId\":5434,\"itemAppearanceModId\":0},\"stats\":[{\"stat\":40,\"amount\":498},{\"stat\":36,\"amount\":332},{\"stat\":7,\"amount\":1385},{\"stat\":71,\"amount\":923}],\"bonusLists\":[3610,1472,3528],\"name\":\"Juggernaut Cloak\",\"context\":\"raid-normal\",\"artifactId\":0,\"id\":152179,\"tooltipParams\":{\"set\":[152179,152183,152178,152180],\"enchant\":5434,\"transmogItem\":147188,\"timewalkerLevel\":110},\"itemLevel\":930},\"neck\":{\"artifactTraits\":[],\"icon\":\"inv_7_0raid_necklace_04b\",\"relics\":[],\"quality\":4,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{\"enchantDisplayInfoId\":5439},\"stats\":[{\"stat\":36,\"amount\":2177},{\"stat\":49,\"amount\":1451},{\"stat\":7,\"amount\":2537}],\"bonusLists\":[3610,1477,3336],\"name\":\"Riveted Choker of Delirium\",\"context\":\"raid-normal\",\"artifactId\":0,\"id\":151966,\"tooltipParams\":{\"enchant\":5439,\"timewalkerLevel\":110},\"itemLevel\":935},\"wrist\":{\"artifactTraits\":[],\"icon\":\"inv_bracer_plate_raidpaladin_s_01\",\"relics\":[],\"quality\":4,\"displayInfoId\":162314,\"artifactAppearanceId\":0,\"armor\":368,\"appearance\":{\"transmogItemAppearanceModId\":0,\"itemId\":39449,\"itemAppearanceModId\":1},\"stats\":[{\"stat\":49,\"amount\":471},{\"stat\":74,\"amount\":1856},{\"stat\":36,\"amount\":628},{\"stat\":7,\"amount\":2785}],\"bonusLists\":[3611,1487,3528],\"name\":\"Vambraces of Life's Assurance\",\"context\":\"raid-heroic\",\"artifactId\":0,\"id\":152023,\"tooltipParams\":{\"transmogItem\":39449,\"timewalkerLevel\":110},\"itemLevel\":945},\"averageItemLevelEquipped\":960,\"finger1\":{\"artifactTraits\":[],\"icon\":\"inv_misc_ring_4\",\"relics\":[],\"quality\":5,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{\"enchantDisplayInfoId\":5428,\"itemAppearanceModId\":0},\"stats\":[{\"stat\":32,\"amount\":922},{\"stat\":49,\"amount\":1538},{\"stat\":36,\"amount\":1230},{\"stat\":7,\"amount\":4649}],\"bonusLists\":[3459,3630],\"name\":\"Soul of the Battlelord\",\"context\":\"\",\"artifactId\":0,\"id\":151650,\"tooltipParams\":{\"gem0\":151583,\"enchant\":5428,\"timewalkerLevel\":110},\"itemLevel\":1000},\"finger2\":{\"artifactTraits\":[],\"icon\":\"inv_70_raid_ring3a\",\"relics\":[],\"quality\":4,\"displayInfoId\":0,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{\"enchantDisplayInfoId\":5428},\"stats\":[{\"stat\":40,\"amount\":1922},{\"stat\":49,\"amount\":2563},{\"stat\":7,\"amount\":3515}],\"bonusLists\":[3611,1502,3337],\"name\":\"Sullied Seal of the Pantheon\",\"context\":\"raid-heroic\",\"artifactId\":0,\"id\":151972,\"tooltipParams\":{\"enchant\":5428,\"timewalkerLevel\":110},\"itemLevel\":970},\"head\":{\"artifactTraits\":[],\"icon\":\"inv_helm_plate_legiondungeon_c_01\",\"relics\":[],\"quality\":4,\"displayInfoId\":145932,\"artifactAppearanceId\":0,\"armor\":707,\"appearance\":{\"transmogItemAppearanceModId\":0,\"itemId\":147190,\"itemAppearanceModId\":0},\"stats\":[{\"stat\":40,\"amount\":1300},{\"stat\":74,\"amount\":3795},{\"stat\":36,\"amount\":768},{\"stat\":7,\"amount\":5693}],\"bonusLists\":[3536,1612,3337],\"name\":\"Casque of the Deep\",\"context\":\"challenge-mode-jackpot\",\"artifactId\":0,\"id\":134512,\"tooltipParams\":{\"transmogItem\":147190,\"timewalkerLevel\":110},\"itemLevel\":960},\"mainHand\":{\"weaponInfo\":{\"damage\":{\"exactMin\":21726,\"min\":21726,\"exactMax\":36210,\"max\":36211},\"weaponSpeed\":3.6,\"dps\":8046.667},\"artifactTraits\":[{\"rank\":1,\"id\":1357},{\"rank\":4,\"id\":991},{\"rank\":6,\"id\":995},{\"rank\":4,\"id\":996},{\"rank\":5,\"id\":990},{\"rank\":1,\"id\":985},{\"rank\":1,\"id\":982},{\"rank\":4,\"id\":993},{\"rank\":1,\"id\":981},{\"rank\":4,\"id\":988},{\"rank\":1,\"id\":980},{\"rank\":1,\"id\":987},{\"rank\":1,\"id\":986},{\"rank\":4,\"id\":992},{\"rank\":4,\"id\":994},{\"rank\":4,\"id\":989},{\"rank\":1,\"id\":1394},{\"rank\":1,\"id\":1715},{\"rank\":4,\"id\":1617},{\"rank\":1,\"id\":1618},{\"rank\":1,\"id\":1619},{\"rank\":24,\"id\":1620}],\"icon\":\"inv_axe_1h_artifactvigfus_d_06\",\"relics\":[{\"itemId\":155849,\"bonusLists\":[3610,1482,3528],\"context\":3,\"socket\":0},{\"itemId\":155853,\"bonusLists\":[3611,1497,3528],\"context\":5,\"socket\":1},{\"itemId\":152293,\"bonusLists\":[3611,1497,3336],\"context\":5,\"socket\":2}],\"quality\":6,\"displayInfoId\":158092,\"artifactAppearanceId\":964,\"armor\":0,\"appearance\":{\"transmogItemAppearanceModId\":1,\"itemId\":113979,\"itemAppearanceModId\":32},\"stats\":[{\"stat\":32,\"amount\":1083},{\"stat\":49,\"amount\":1040},{\"stat\":4,\"amount\":4089},{\"stat\":7,\"amount\":6134}],\"bonusLists\":[751,1542,1546,1546],\"name\":\"Warswords of the Valarjar\",\"context\":\"scenario-normal\",\"artifactId\":35,\"id\":128908,\"tooltipParams\":{\"gem0\":155849,\"gem1\":155853,\"gem2\":152293,\"transmogItem\":113979,\"timewalkerLevel\":110},\"itemLevel\":983},\"shirt\":{\"artifactTraits\":[],\"icon\":\"inv_shirt_14\",\"relics\":[],\"quality\":2,\"displayInfoId\":10005,\"artifactAppearanceId\":0,\"armor\":0,\"appearance\":{\"itemAppearanceModId\":0},\"stats\":[],\"bonusLists\":[],\"name\":\"Thug Shirt\",\"context\":\"\",\"artifactId\":0,\"id\":2105,\"tooltipParams\":{\"timewalkerLevel\":110},\"itemLevel\":1},\"legs\":{\"artifactTraits\":[],\"icon\":\"inv_pants_plate_raiddeathknight_i_01\",\"relics\":[],\"quality\":5,\"displayInfoId\":78788,\"artifactAppearanceId\":0,\"armor\":832,\"appearance\":{\"transmogItemAppearanceModId\":0,\"itemId\":147191,\"itemAppearanceModId\":0},\"stats\":[{\"stat\":32,\"amount\":943},{\"stat\":4,\"amount\":5509},{\"stat\":36,\"amount\":1458},{\"stat\":7,\"amount\":8265}],\"bonusLists\":[1811,3630],\"name\":\"Valarjar Berserkers\",\"context\":\"\",\"artifactId\":0,\"id\":151824,\"tooltipParams\":{\"transmogItem\":147191,\"timewalkerLevel\":110},\"itemLevel\":1000},\"averageItemLevel\":965,\"waist\":{\"artifactTraits\":[],\"icon\":\"inv_belt_plate_raidpaladin_s_01\",\"relics\":[],\"quality\":4,\"displayInfoId\":162302,\"artifactAppearanceId\":0,\"armor\":484,\"appearance\":{\"transmogItemAppearanceModId\":0,\"itemId\":147753,\"itemAppearanceModId\":1},\"stats\":[{\"stat\":32,\"amount\":652},{\"stat\":49,\"amount\":870},{\"stat\":74,\"amount\":2717},{\"stat\":7,\"amount\":4076}],\"bonusLists\":[3611,1497,3336],\"name\":\"Nathrezim Battle Girdle\",\"context\":\"raid-heroic\",\"artifactId\":0,\"id\":152020,\"tooltipParams\":{\"transmogItem\":147753,\"timewalkerLevel\":110},\"itemLevel\":955},\"shoulder\":{\"artifactTraits\":[],\"icon\":\"inv_plate_raidwarrior_s_01shoulder\",\"relics\":[],\"quality\":4,\"displayInfoId\":162212,\"artifactAppearanceId\":0,\"armor\":639,\"appearance\":{\"transmogItemAppearanceModId\":0,\"itemId\":147752,\"enchantDisplayInfoId\":5883,\"itemAppearanceModId\":1},\"stats\":[{\"stat\":32,\"amount\":608},{\"stat\":49,\"amount\":885},{\"stat\":74,\"amount\":2593},{\"stat\":7,\"amount\":3890}],\"bonusLists\":[3611,1492,3336],\"name\":\"Juggernaut Pauldrons\",\"context\":\"raid-heroic\",\"artifactId\":0,\"id\":152183,\"tooltipParams\":{\"set\":[152179,152183,152178,152180],\"enchant\":5883,\"transmogItem\":147752,\"timewalkerLevel\":110},\"itemLevel\":950},\"offHand\":{\"weaponInfo\":{\"damage\":{\"exactMin\":21726,\"min\":21726,\"exactMax\":36210,\"max\":36211},\"weaponSpeed\":3.6,\"dps\":8046.667},\"artifactTraits\":[],\"icon\":\"inv_axe_1h_artifactvigfus_d_06\",\"relics\":[],\"quality\":6,\"displayInfoId\":158092,\"artifactAppearanceId\":964,\"armor\":0,\"appearance\":{\"transmogItemAppearanceModId\":0,\"itemId\":152094,\"itemAppearanceModId\":32},\"stats\":[{\"stat\":32,\"amount\":1083},{\"stat\":49,\"amount\":1040},{\"stat\":4,\"amount\":4089},{\"stat\":7,\"amount\":6134}],\"bonusLists\":[],\"name\":\"Warswords of the Valarjar\",\"context\":\"\",\"artifactId\":0,\"id\":134553,\"tooltipParams\":{\"transmogItem\":152094,\"timewalkerLevel\":110},\"itemLevel\":983}},\"calcClass\":\"Z\"}");
        Iterator<String> keys = obj.getJSONObject("items").keys();
        Map<String, Gear> gearList = new HashMap<String, Gear>(17);

        while(keys.hasNext())
        {
            String key = (String)keys.next();
            if (obj.getJSONObject("items").get(key) instanceof JSONObject)
            {
                Gear gear = new Gear(key, obj.getJSONObject("items").getJSONObject(key));
                gearList.put(key, gear);
            }
        }
    }

    @After
    public void tearDown()
    {
        System.out.println("Character Tear Down");
    }

    @Test
    public void canGetName()
    {
        System.out.println("canGetName");
    }

    @Test
    public void canGetRealm()
    {
        System.out.println("canGetRealm");
    }

    @Test
    public void canGetGameClass()
    {
        System.out.println("canGetGameClass");
    }

    @Test
    public void canGetRace()
    {
        System.out.println("canGetRace");
    }

    @Test
    public void canGetGender()
    {
        System.out.println("canGetGender");
    }

    @Test
    public void canGetLevel()
    {
        System.out.println("canGetLevel");
    }

    @Test
    public void canGetThumbnail()
    {
        System.out.println("canGetThumbnail");
    }

    @Test
    public void canGetFaction()
    {
        System.out.println("canGetFaction");
    }

    @Test
    public void canGetAverageIlvl()
    {
        System.out.println("canGetAverageIlvl");
    }

    @Test
    public void canGetAverageIlvlEquipped()
    {
        System.out.println("canGetAverageIlvlEquipped");
    }

    @Test
    public void canGetHead()
    {
        System.out.println("canGetHead");
    }

    @Test
    public void canGetNeck()
    {
        System.out.println("canGetNeck");
    }

    @Test
    public void canGetShoulder()
    {
        System.out.println("canGetShoulder");
    }

    @Test
    public void canGetBack()
    {
        System.out.println("canGetBack");
    }

    @Test
    public void canGetChest()
    {
        System.out.println("canGetChest");
    }

    @Test
    public void canGetShirt()
    {
        System.out.println("canGetShirt");
    }

    @Test
    public void canGetWrist()
    {
        System.out.println("canGetWrist");
    }

    @Test
    public void canGetHands()
    {
        System.out.println("canGetHands");
    }

    @Test
    public void canGetWaist()
    {
        System.out.println("canGetWaist");
    }

    @Test
    public void canGetLegs()
    {
        System.out.println("canGetLegs");
    }

    @Test
    public void canGetFeet()
    {
        System.out.println("canGetFeet");
    }

    @Test
    public void canGetFinger1()
    {
        System.out.println("canGetFinger1");
    }

    @Test
    public void canGetFinger2()
    {
        System.out.println("canGetFinger2");
    }

    @Test
    public void canGetTrinket1()
    {
        System.out.println("canGetTrinket1");
    }

    @Test
    public void canGetTrinket2()
    {
        System.out.println("canGetTrinket2");
    }

    @Test
    public void canGetMainHand()
    {
        System.out.println("canGetMainHand");
    }

    @Test
    public void canGetOffHand()
    {
        System.out.println("canGetOffHand");
    }
}
