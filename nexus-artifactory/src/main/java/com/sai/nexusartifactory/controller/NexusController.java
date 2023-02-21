package com.sai.nexusartifactory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NexusController {

    @GetMapping("/")
    public String nexusMapping(){
        return "NEXUS MAPPING";
    }

}
