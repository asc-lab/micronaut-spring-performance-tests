package pl.altkomsoftware.spring.perftest.order;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.altkomsoftware.spring.perftest.customer.Customer;
import pl.altkomsoftware.spring.perftest.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Order {
    private UUID id;

    private String customer;

    private OrderStatus status;

    private List<OrderLine> lines;

    public Order(Customer customer) {
        this.id = UUID.randomUUID();
        this.customer = customer.getName();
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
