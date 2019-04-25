package pl.altkomsoftware.spring.perftest.product;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
@RequiredArgsConstructor
public class CategoryRepository {
    private final MongoTemplate mongoOps;

    public void save(Category category){
        mongoOps.save(category);
    }

    public Category findByCode(String code){
        return mongoOps.findOne(query(where("code").is(code)),Category.class);
    }

    public List<Category> findAll() {
        return mongoOps.findAll(Category.class);
    }
}
