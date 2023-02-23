package com.sai.nexusartifactory.controller;

import com.sai.nexusartifactory.NexusArtifactoryClient;
import com.sai.nexusartifactory.entity.RequestDto;
import com.sai.nexusartifactory.entity.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
public class NexusController {

    @Autowired
    NexusArtifactoryClient nexusArtifactoryClient;

    @GetMapping("/")
    public String nexusMapping(){
        return "PENDING";
    }

    @PostMapping("/")
    public String postMapping(){
        String status = nexusArtifactoryClient.getNexus();
        return status;
    }

    @PostMapping("/test")
    public ResponseDto postMappingTest(@RequestBody RequestDto requestDto){
        ResponseDto responseDto = new ResponseDto();
        responseDto.setStatus(requestDto.getStatus());
        return responseDto;
    }

}
