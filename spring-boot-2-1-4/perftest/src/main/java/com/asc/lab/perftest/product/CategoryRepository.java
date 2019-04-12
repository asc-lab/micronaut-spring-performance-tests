package com.asc.lab.perftest.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CategoryRepository {
    private final EntityManager em;

    public void save(Category category){
        em.persist(category);
    }

    public Category findByCode(String code){
        return em.createQuery("from Category c where c.code = :code", Category.class)
                .setParameter("code", code)
                .getSingleResult();
    }

    public List<Category> findAll() {
        return em.createQuery("from Category c", Category.class)
                .getResultList();
    }
}
