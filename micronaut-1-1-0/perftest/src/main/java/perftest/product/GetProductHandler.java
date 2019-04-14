package perftest.product;


import io.micronaut.spring.tx.annotation.Transactional;
import perftest.product.api.GetProductQuery;
import perftest.product.api.ProductDto;
import perftest.product.api.assemblers.ProductDtoAssembler;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class GetProductHandler {
    private final ProductRepository productRepository;
    private final ProductDtoAssembler productDtoAssembler;

    public ProductDto handle(GetProductQuery query){
        return productDtoAssembler.toDto(productRepository.findByCode(query.getCode()));
    }
}
