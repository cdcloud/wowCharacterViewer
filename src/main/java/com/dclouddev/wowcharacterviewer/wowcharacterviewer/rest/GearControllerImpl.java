package com.dclouddev.wowcharacterviewer.wowcharacterviewer.rest;

import com.dclouddev.wowcharacterviewer.wowcharacterviewer.service.WowGearService;
import com.dclouddev.wowcharacterviewer.wowcharacterviewer.models.Character;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by Cloud on 3/20/2018
 **/
@RestController
public class GearControllerImpl implements GearController {

    private WowGearService gearService;

    public GearControllerImpl(WowGearService gearService) {
        this.gearService = gearService;
    }

    @Override
    @RequestMapping(value = "/gear", method = RequestMethod.GET)
    public Character getGear() throws IOException
    {
        return this.gearService.getGear("bleeding-hollow", "Draxkal", "b3w7fetmveeuwber2m772cef78d4du87");
    }
}
