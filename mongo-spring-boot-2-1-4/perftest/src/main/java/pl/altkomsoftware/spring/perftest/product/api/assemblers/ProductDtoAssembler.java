package pl.altkomsoftware.spring.perftest.product.api.assemblers;

import org.springframework.stereotype.Component;
import pl.altkomsoftware.spring.perftest.product.Product;
import pl.altkomsoftware.spring.perftest.product.api.ProductDto;

@Component
public class ProductDtoAssembler {
    public ProductDto toDto(Product product){
        return new ProductDto(
                product.getCode(),
                product.getName(),
                product.getCategory(),
                product.getPrice()
        );
    }
}
