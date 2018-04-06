package com.dclouddev.wowcharacterviewer.wowcharacterviewer.controllers;

import com.dclouddev.wowcharacterviewer.wowcharacterviewer.models.Character;

import java.io.IOException;

/**
 * Created by Cloud on 3/20/2018
 **/
public interface GearController {

    Character getGear() throws IOException;
}
