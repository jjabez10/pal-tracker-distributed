package io.pivotal.pal.tracker.restsupport;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
=======
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
>>>>>>> 0f15115229d33da45dbe67a7a84e86214360e5b0


@Configuration
public class RestConfig {

<<<<<<< HEAD
//    @LoadBalanced
//    @Bean
//    public RestOperations restOperations() {
//        return new RestTemplate();
//    }
=======
    @LoadBalanced
    @Bean
    public RestOperations restOperations() {
        return new RestTemplate();
    }
>>>>>>> 0f15115229d33da45dbe67a7a84e86214360e5b0

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 0f15115229d33da45dbe67a7a84e86214360e5b0
