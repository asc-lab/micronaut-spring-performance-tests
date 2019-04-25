package pl.altkomsoftware.spring.perftest.product;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    private final MongoTemplate mongoOps;

    public void save(Product product){
        mongoOps.save(product);
    }

    public Product findByCode(String code){
        return mongoOps
                .findOne(query(where("code").is(code)), Product.class);
    }

    public List<Product> findByCategory(String categoryCode) {
        return mongoOps.find(query(where("category").is(categoryCode)), Product.class);
    }
}
