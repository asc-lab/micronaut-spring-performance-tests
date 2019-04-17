package pl.altkomsoftware.spring.perftest.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.altkomsoftware.spring.perftest.product.api.ChangeProductPriceCommand;
import pl.altkomsoftware.spring.perftest.product.api.ProductDto;
import pl.altkomsoftware.spring.perftest.product.api.assemblers.ProductDtoAssembler;

@Service
@RequiredArgsConstructor
public class ChangeProductPriceHandler {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final ProductDtoAssembler productDtoAssembler;

    public ProductDto handle(ChangeProductPriceCommand cmd){
        Product p = productRepository.findByCode(cmd.getProductCode());
        p.changePrice(cmd.getNewPrice());
        productRepository.save(p);
        return productDtoAssembler.toDto(p);
    }
}
