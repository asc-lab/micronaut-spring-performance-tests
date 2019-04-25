package pl.altkomsoftware.spring.perftest.product;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.altkomsoftware.spring.perftest.product.api.CategoryDto;
import pl.altkomsoftware.spring.perftest.product.api.ListCategoriesQuery;
import pl.altkomsoftware.spring.perftest.product.api.assemblers.CategoryDtoAssembler;

import java.util.List;
import java.util.stream.Collectors;

@Service
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
