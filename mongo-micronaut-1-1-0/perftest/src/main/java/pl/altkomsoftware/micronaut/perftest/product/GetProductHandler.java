package pl.altkomsoftware.micronaut.perftest.product;


import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.product.api.GetProductQuery;
import pl.altkomsoftware.micronaut.perftest.product.api.ProductDto;
import pl.altkomsoftware.micronaut.perftest.product.api.assemblers.ProductDtoAssembler;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class GetProductHandler {
    private final ProductRepository productRepository;
    private final ProductDtoAssembler productDtoAssembler;

    public ProductDto handle(GetProductQuery query){
        return productDtoAssembler.toDto(productRepository.findByCode(query.getCode()));
    }
}
