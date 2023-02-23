package com.sai.nexusartifactory;

import com.sai.nexusartifactory.entity.RequestDto;
import com.sai.nexusartifactory.entity.ResponseDto;
import feign.*;
import feign.form.spring.SpringFormEncoder;
import org.springframework.web.bind.annotation.RequestBody;

public interface NexusArtifactoryClient {

    static NexusArtifactoryClient createClient() {
        return Feign
                .builder()
                .encoder(new SpringFormEncoder())
                .target(NexusArtifactoryClient.class, "http://localhost:8080");
    }

    @RequestLine("GET /")
    @Headers("Content-Type: application/json")
    String getNexus();

    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    ResponseDto postNexus(@RequestBody RequestDto requestDto);

}
