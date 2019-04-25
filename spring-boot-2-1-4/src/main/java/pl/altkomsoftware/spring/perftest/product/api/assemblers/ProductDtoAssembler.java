package pl.altkomsoftware.spring.perftest.product.api.assemblers;

import pl.altkomsoftware.spring.perftest.product.Product;
import pl.altkomsoftware.spring.perftest.product.api.ProductDto;
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
