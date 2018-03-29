package com.dclouddev.wowcharacterviewer.wowcharacterviewer.service;

import com.dclouddev.wowcharacterviewer.wowcharacterviewer.models.Gear;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.*;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Cloud on 3/20/2018
 **/
@Service
public class WoWGearServiceImpl implements WowGearService {

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public String getGear(String server, String character, String apiKey) throws IOException
    {
        ResponseEntity<String> response = restTemplate.getForEntity(
                "https://us.api.battle.net/wow/character/" + server + "/" + character + "?fields=items&locale=en_US&apikey=" + apiKey,
                String.class);

        JSONObject obj = new JSONObject(response.getBody());


//        ObjectMapper mapper = new ObjectMapper();
//        JsonNode root = mapper.readValue(response.getBody(), JsonNode.class);
//        JsonNode items = root.path("items");

//        int averageIlvl = items.get("averageItemLevel").asInt();
//        int averageIlvlEquipped = items.get("averageItemLevelEquipped").asInt();
//
//
//        for (JsonNode node : items)
//        {
//            System.out.println(node.toString());
//        }
//
//        JsonNode headNode = items.path("head");

//        String name = headNode.get("name").toString();

        return response.getBody();
    }
}
