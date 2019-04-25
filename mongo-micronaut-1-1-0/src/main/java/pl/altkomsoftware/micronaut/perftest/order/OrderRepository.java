package pl.altkomsoftware.micronaut.perftest.order;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.BsonBinarySubType;
import org.bson.UuidRepresentation;
import org.bson.types.Binary;

import javax.inject.Singleton;
import java.util.UUID;

@Singleton
public class OrderRepository {
    private MongoClient mongoClient;

    public OrderRepository(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public void save(Order order){
        getOrderCollection().insertOne(order);
    }


    public void update(Order order) {
        getOrderCollection().replaceOne(Filters.eq("_id", uuidToBinary(order.getId())), order);
    }

    public Order findById(UUID id){
        return getOrderCollection()
                .find(Filters.eq("_id", uuidToBinary(id)))
                .first();
    }

    private MongoCollection<Order> getOrderCollection() {
        return mongoClient.getDatabase("perftestpolicy").getCollection("order", Order.class);
    }

    private static Binary uuidToBinary(UUID uuid){
        byte[] bytes = org.bson.internal.UuidHelper.encodeUuidToBinary(uuid, UuidRepresentation.JAVA_LEGACY);
        return new Binary(BsonBinarySubType.UUID_LEGACY, bytes);
    }

}
