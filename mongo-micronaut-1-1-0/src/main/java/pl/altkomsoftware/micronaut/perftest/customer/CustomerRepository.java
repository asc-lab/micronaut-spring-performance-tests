package pl.altkomsoftware.micronaut.perftest.customer;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import javax.inject.Singleton;

@Singleton
public class CustomerRepository {
    MongoClient mongoClient;

    public CustomerRepository(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public void save(Customer customer){
        getCustomerCollection().insertOne(customer);
    }


    public Customer findByName(String name){
        return getCustomerCollection()
                .find(Filters.eq("name", name))
                .first();
    }

    private MongoCollection<Customer> getCustomerCollection() {
        return mongoClient.getDatabase("perftestpolicy").getCollection("customer", Customer.class);
    }

}
