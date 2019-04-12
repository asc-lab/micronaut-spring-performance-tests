package com.asc.lab.perftest.order;

import com.asc.lab.perftest.customer.Customer;
import com.asc.lab.perftest.product.Product;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "PURCHASE_ORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Customer customer;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;

    @ElementCollection
    private List<OrderLine> lines;

    public Order(Customer customer) {
        this.customer = customer;
        this.status = OrderStatus.NEW;
        this.lines = new ArrayList<>();
    }

    public void addProduct(Product product, Integer quantity){
        if (status!=OrderStatus.NEW){
            throw new IllegalStateException("Cannot modify orders in state other than NEW");
        }
        this.lines.add(new OrderLine(product,quantity));
    }

    public void sumbit(){
        if (status!=OrderStatus.NEW){
            throw new IllegalStateException("Cannot submit orders in state other than NEW");
        }
        this.status = OrderStatus.SUBMITTED;
    }

    public void approve(){
        if (status!=OrderStatus.SUBMITTED){
            throw new IllegalStateException("Cannot approve orders in state other than SUBMITTED");
        }
        this.status = OrderStatus.APPROVED;
    }


    public void reject(){
        if (status!=OrderStatus.SUBMITTED){
            throw new IllegalStateException("Cannot approve orders in state other than SUBMITTED");
        }
        this.status = OrderStatus.REJECETED;
    }

}
