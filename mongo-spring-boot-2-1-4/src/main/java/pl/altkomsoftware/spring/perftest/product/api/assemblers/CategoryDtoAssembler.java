package pl.altkomsoftware.spring.perftest.product.api.assemblers;

import org.springframework.stereotype.Component;
import pl.altkomsoftware.spring.perftest.product.Category;
import pl.altkomsoftware.spring.perftest.product.api.CategoryDto;

@Component
public class CategoryDtoAssembler {
    public CategoryDto toDto(Category category){
        return new CategoryDto(category.getCode(),category.getName());
    }
}
