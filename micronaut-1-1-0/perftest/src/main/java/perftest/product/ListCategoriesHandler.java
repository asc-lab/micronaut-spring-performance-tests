package perftest.product;


import io.micronaut.spring.tx.annotation.Transactional;
import perftest.product.api.CategoryDto;
import perftest.product.api.ListCategoriesQuery;
import perftest.product.api.assemblers.CategoryDtoAssembler;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ListCategoriesHandler {
    private final CategoryRepository categoryRepository;
    private final CategoryDtoAssembler categoryDtoAssembler;

    public List<CategoryDto> handle(ListCategoriesQuery query){
        return categoryRepository
                .findAll()
                .stream()
                .map(categoryDtoAssembler::toDto)
                .collect(Collectors.toList());
    }
}
