package com.dclouddev.wowcharacterviewer.wowcharacterviewer.service;

import java.io.IOException;

/**
 * Created by Cloud on 3/20/2018
 **/
public interface WowGearService {

    String getGear(String server, String character, String apiKey) throws IOException;
}
