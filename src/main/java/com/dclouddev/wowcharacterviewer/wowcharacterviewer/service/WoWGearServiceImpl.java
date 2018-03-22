package com.dclouddev.wowcharacterviewer.wowcharacterviewer.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Cloud on 3/20/2018
 **/
@Service
public class WoWGearServiceImpl implements WowGearService {

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public String getGear(String server, String character, String apiKey) {
        ResponseEntity<String> response = restTemplate.getForEntity(
                "https://us.api.battle.net/wow/character/" + server + "/" + character + "?fields=items&locale=en_US&apikey=" + apiKey,
                String.class);
        return response.getBody();
    }
}
