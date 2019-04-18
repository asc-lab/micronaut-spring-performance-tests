package pl.altkomsoftware.micronaut.perftest.product;

import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.product.api.ChangeProductCategoryCommand;
import pl.altkomsoftware.micronaut.perftest.product.api.ProductDto;
import pl.altkomsoftware.micronaut.perftest.product.api.assemblers.ProductDtoAssembler;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class ChangeProductCategoryHandler {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final ProductDtoAssembler productDtoAssembler;

    public ProductDto handle(ChangeProductCategoryCommand cmd){
        Category cat = categoryRepository.findByCode(cmd.getNewCategoryCode());
        Product p = productRepository.findByCode(cmd.getProductCode());
        p.changeCategory(cat);
        return productDtoAssembler.toDto(p);
    }
}
