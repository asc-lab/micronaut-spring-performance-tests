package pl.altkomsoftware.spring.perftest.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.altkomsoftware.spring.perftest.product.api.ChangeProductCategoryCommand;
import pl.altkomsoftware.spring.perftest.product.api.ProductDto;
import pl.altkomsoftware.spring.perftest.product.api.assemblers.ProductDtoAssembler;

@Service
@RequiredArgsConstructor
public class ChangeProductCategoryHandler {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final ProductDtoAssembler productDtoAssembler;

    public ProductDto handle(ChangeProductCategoryCommand cmd){
        Category cat = categoryRepository.findByCode(cmd.getNewCategoryCode());
        Product p = productRepository.findByCode(cmd.getProductCode());
        p.changeCategory(cat);
        productRepository.save(p);
        return productDtoAssembler.toDto(p);
    }
}
