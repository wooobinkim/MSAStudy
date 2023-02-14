package com.compnay.msaservice1.controller;

import com.compnay.msaservice1.service.DiscoveryService;
import com.compnay.msaservice1.service.rest.RibbonClientCommunication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscoveryController {
    @Autowired
    DiscoveryService discoveryService;

    @Autowired
    RibbonClientCommunication ribbonClientCommunication;

    @GetMapping(value = "/services")
    public List<String> services() {
        return discoveryService.getServices();
    }

    @GetMapping(value = "/ribbon/{id}")
    public String ribbonServices(@PathVariable("id") String id) {
        return ribbonClientCommunication.getName(id);
    }
}
