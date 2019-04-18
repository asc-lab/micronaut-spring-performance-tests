package pl.altkomsoftware.micronaut.perftest.product;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Singleton
public class ProductRepository {
    private MongoClient mongoClient;

    public ProductRepository(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public void save(Product product){
        getProductCollection().insertOne(product);
    }

    public Product findByCode(String code){
        return getProductCollection()
                .find(Filters.eq("code",code))
                .first();
    }

    public List<Product> findByCategory(String categoryCode) {
        List<Product> results = new ArrayList<>();
        getProductCollection()
                .find(Filters.eq("category",categoryCode))
                .forEach(new Consumer<Product>() {
                    @Override
                    public void accept(Product product) {
                        results.add(product);
                    }
                });

        return results;
    }


    private MongoCollection<Product> getProductCollection() {
        return mongoClient.getDatabase("perftestpolicy").getCollection("product", Product.class);
    }
}
