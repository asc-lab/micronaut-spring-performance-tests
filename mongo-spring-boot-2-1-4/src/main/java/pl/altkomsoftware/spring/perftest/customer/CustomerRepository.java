package pl.altkomsoftware.spring.perftest.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;


@Repository
@RequiredArgsConstructor
public class CustomerRepository {
    private final MongoTemplate mongoOps;

    public void save(Customer customer){
        mongoOps.save(customer);
    }

    public Customer findByName(String name){
        return mongoOps
                .findOne(query(where("name").is(name)), Customer.class);
    }
}
