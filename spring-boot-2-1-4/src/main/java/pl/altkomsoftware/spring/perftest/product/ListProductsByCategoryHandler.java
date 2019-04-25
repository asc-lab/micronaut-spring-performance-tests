package pl.altkomsoftware.spring.perftest.product;

import pl.altkomsoftware.spring.perftest.product.api.ListProductsByCategoryQuery;
import pl.altkomsoftware.spring.perftest.product.api.ProductDto;
import pl.altkomsoftware.spring.perftest.product.api.assemblers.ProductDtoAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
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
