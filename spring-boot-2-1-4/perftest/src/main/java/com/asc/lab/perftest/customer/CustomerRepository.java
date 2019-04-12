package com.asc.lab.perftest.customer;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Repository
@Transactional
@RequiredArgsConstructor
public class CustomerRepository {
    private final EntityManager em;

    public void save(Customer customer){
        em.persist(customer);
    }

    public Customer findByName(String name){
        TypedQuery<Customer> query = em.createQuery("select c from Customer c where c.name = :name", Customer.class);
        return query
                .setParameter("name",name)
                .getSingleResult();
    }
}
