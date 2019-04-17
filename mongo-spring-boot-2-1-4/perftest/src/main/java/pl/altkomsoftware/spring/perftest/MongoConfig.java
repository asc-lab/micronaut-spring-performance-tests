package pl.altkomsoftware.spring.perftest;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {
    @Bean
    MongoClient mongoClient(){
        return new MongoClient("localhost");
    }

    @Bean
    MongoTemplate mongoOperations(MongoClient mongoClient) {
        return new MongoTemplate(mongoClient, "perftestpolicy");
    }
}
