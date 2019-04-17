package pl.altkomsoftware.spring.perftest.order;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
@RequiredArgsConstructor
public class OrderRepository {
    private final MongoTemplate mongoOps;

    public void save(Order order){
        mongoOps.save(order);
    }

    public Order findById(UUID id){
        return mongoOps.findById(id, Order.class);
    }
}
