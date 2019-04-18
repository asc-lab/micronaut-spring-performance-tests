package pl.altkomsoftware.micronaut.perftest;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

@Factory
public class MongoConfig {
    @Bean
    CodecRegistry codecRegistry(){
        return fromRegistries(
                MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build())
                );
    }

    @Bean
    MongoClient mongoClient(CodecRegistry codecRegistry){
        return new MongoClient("localhost", MongoClientOptions.builder().codecRegistry(codecRegistry).build());
    }


}
