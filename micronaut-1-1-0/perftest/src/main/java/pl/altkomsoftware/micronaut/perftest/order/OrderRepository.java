package pl.altkomsoftware.micronaut.perftest.order;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Transactional
public class OrderRepository {
    @PersistenceContext
    private EntityManager em;

    public OrderRepository(@CurrentSession EntityManager em) {
        this.em = em;
    }

    public void save(Order order){
        em.persist(order);
    }

    public Order findById(Long id){
        return em.find(Order.class, id);
    }
}
