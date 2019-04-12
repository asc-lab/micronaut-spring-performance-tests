package com.asc.lab.perftest.product.api.assemblers;

import com.asc.lab.perftest.product.Product;
import com.asc.lab.perftest.product.api.ProductDto;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoAssembler {
    public ProductDto toDto(Product product){
        return new ProductDto(
                product.getCode(),
                product.getName(),
                product.getCategory().getCode(),
                product.getPrice()
        );
    }
}
