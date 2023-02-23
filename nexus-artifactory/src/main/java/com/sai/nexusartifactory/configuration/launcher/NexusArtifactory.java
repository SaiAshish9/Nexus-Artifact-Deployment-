package com.sai.nexusartifactory.configuration.launcher;

import com.sai.nexusartifactory.NexusArtifactoryClient;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.*;

@ComponentScan(basePackages = {"com.sai.*"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com\\.sai\\..*launcher\\..*")
        })
@EnableAutoConfiguration(
        exclude = {
                WebMvcAutoConfiguration.class
        })
@Configuration
public class NexusArtifactory {

    @Bean
    public NexusArtifactoryClient nexusArtifactoryClient() {
        return NexusArtifactoryClient.createClient();
    }

}
