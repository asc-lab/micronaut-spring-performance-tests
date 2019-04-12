package com.asc.lab.perftest.product;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String name;
    @ManyToOne
    private Category category;
    private BigDecimal price;

    public Product(String code, String name, Category category, BigDecimal price) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void changePrice(BigDecimal newPrice){
        price = newPrice;
    }

    public void changeCategory(Category newCategory){
        category = newCategory;
    }
}
