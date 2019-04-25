package pl.altkomsoftware.micronaut.perftest.product;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Singleton
public class CategoryRepository {
    private MongoClient mongoClient;

    public CategoryRepository(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public void save(Category category){
        getCategoryCollection().insertOne(category);
    }

    public Category findByCode(String code){
        return getCategoryCollection()
                .find(Filters.eq("code",code))
                .first();
    }

    public List<Category> findAll() {
        List<Category> results = new ArrayList<>();
        getCategoryCollection()
                .find()
                .forEach(new Consumer<Category>() {
                    @Override
                    public void accept(Category category) {
                        results.add(category);
                    }
                });
        return results;
    }

    private MongoCollection<Category> getCategoryCollection() {
        return mongoClient.getDatabase("perftestpolicy").getCollection("category", Category.class);
    }
}
