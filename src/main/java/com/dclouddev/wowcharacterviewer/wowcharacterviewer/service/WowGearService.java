package com.dclouddev.wowcharacterviewer.wowcharacterviewer.service;
import com.dclouddev.wowcharacterviewer.wowcharacterviewer.model.Character;

import java.io.IOException;

/**
 * Created by Cloud on 3/20/2018
 **/
public interface WowGearService {

    Character getGear(String server, String character, String apiKey) throws IOException;
}
