package perftest.customer;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import io.micronaut.spring.tx.annotation.Transactional;

@Singleton
public class CustomerRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public CustomerRepository(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void save(Customer customer){
        entityManager.persist(customer);
    }

    @Transactional(readOnly = true)
    public Customer findByName(String name){
        TypedQuery<Customer> query = entityManager.createQuery("select c from Customer c where c.name = :name", Customer.class);
        return query
                .setParameter("name",name)
                .getSingleResult();
    }
}
