package perftest.product;

import io.micronaut.spring.tx.annotation.Transactional;
import perftest.product.api.ChangeProductPriceCommand;
import perftest.product.api.ProductDto;
import perftest.product.api.assemblers.ProductDtoAssembler;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@Transactional
@RequiredArgsConstructor
public class ChangeProductPriceHandler {
    private final ProductRepository productRepository;
    private final ProductDtoAssembler productDtoAssembler;

    public ProductDto handle(ChangeProductPriceCommand cmd){
        Product p = productRepository.findByCode(cmd.getProductCode());
        p.changePrice(cmd.getNewPrice());
        return productDtoAssembler.toDto(p);
    }
}
