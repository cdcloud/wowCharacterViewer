package com.dclouddev.wowcharacterviewer.wowcharacterviewer.controllers;

import com.dclouddev.wowcharacterviewer.wowcharacterviewer.service.WowGearService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public String getGear() {
        return this.gearService.getGear("bleeding-hollow", "Draxkal", "8rh2jpnqadv5j3s83yfrthb6kmsrjjse");
    }
}
