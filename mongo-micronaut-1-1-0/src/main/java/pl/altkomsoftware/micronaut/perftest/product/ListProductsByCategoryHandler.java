package pl.altkomsoftware.micronaut.perftest.product;

import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.product.api.ListProductsByCategoryQuery;
import pl.altkomsoftware.micronaut.perftest.product.api.ProductDto;
import pl.altkomsoftware.micronaut.perftest.product.api.assemblers.ProductDtoAssembler;

import javax.inject.Singleton;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
@RequiredArgsConstructor
public class ListProductsByCategoryHandler {
    private final ProductRepository productRepository;
    private final ProductDtoAssembler productDtoAssembler;

    public List<ProductDto> handle(ListProductsByCategoryQuery query){
        return productRepository
                .findByCategory(query.getCategoryCode())
                .stream()
                .map(productDtoAssembler::toDto)
                .collect(Collectors.toList());
    }
}
