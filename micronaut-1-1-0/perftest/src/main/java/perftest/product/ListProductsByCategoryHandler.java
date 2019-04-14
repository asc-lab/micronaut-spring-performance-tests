package perftest.product;

import io.micronaut.spring.tx.annotation.Transactional;
import perftest.product.api.ListProductsByCategoryQuery;
import perftest.product.api.ProductDto;
import perftest.product.api.assemblers.ProductDtoAssembler;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
@Transactional(readOnly = true)
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
