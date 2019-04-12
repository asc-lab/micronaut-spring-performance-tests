package com.asc.lab.perftest.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    private final EntityManager em;

    public void save(Product product){
        em.persist(product);
    }

    public Product findByCode(String code){
        return em.createQuery("from Product p where p.code=:code", Product.class)
                .setParameter("code",code)
                .getSingleResult();
    }

    public List<Product> findByCategory(String categoryCode) {
        return em.createQuery("from Product p where p.category.code=:code", Product.class)
                .setParameter("code", categoryCode)
                .getResultList();
    }
}
