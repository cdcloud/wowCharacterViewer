package com.dclouddev.wowcharacterviewer.wowcharacterviewer.service;

import com.dclouddev.wowcharacterviewer.wowcharacterviewer.model.Gear;
import com.dclouddev.wowcharacterviewer.wowcharacterviewer.model.Character;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.*;

import java.io.IOException;
import java.util.*;

/**
 * Created by Cloud on 3/20/2018
 **/
@Service
public class WoWGearServiceImpl implements WowGearService {

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public Character getGear(String server, String characterName, String apiKey) throws IOException
    {
        ResponseEntity<String> response = restTemplate.getForEntity(
                "https://us.api.battle.net/wow/character/" + server + "/" + characterName + "?fields=items&locale=en_US&apikey=" + apiKey,
                String.class);

        JSONObject obj = new JSONObject(response.getBody());

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

        return new Character(obj, gearList);
    }
}
