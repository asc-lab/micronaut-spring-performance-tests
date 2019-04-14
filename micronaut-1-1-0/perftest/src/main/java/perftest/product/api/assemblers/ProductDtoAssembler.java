package perftest.product.api.assemblers;

import perftest.product.Product;
import perftest.product.api.ProductDto;

import javax.inject.Singleton;

@Singleton
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
