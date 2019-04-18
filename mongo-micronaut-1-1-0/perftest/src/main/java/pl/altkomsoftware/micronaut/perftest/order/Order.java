package pl.altkomsoftware.micronaut.perftest.order;

import lombok.Getter;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonProperty;
import pl.altkomsoftware.micronaut.perftest.customer.Customer;
import pl.altkomsoftware.micronaut.perftest.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class Order {
    private UUID id;

    private String customer;

    private OrderStatus status;

    private List<OrderLine> lines;

    @BsonCreator
    public Order(
            @BsonProperty("id") UUID id,
            @BsonProperty("customer") String customer,
            @BsonProperty("status") OrderStatus status,
            @BsonProperty("lines") List<OrderLine> lines) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.lines = lines;
    }

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
