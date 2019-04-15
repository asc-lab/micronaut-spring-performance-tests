package pl.altkomsoftware.spring.perftest.product.api.assemblers;

import pl.altkomsoftware.spring.perftest.product.Category;
import pl.altkomsoftware.spring.perftest.product.api.CategoryDto;
import org.springframework.stereotype.Component;

@Component
public class CategoryDtoAssembler {
    public CategoryDto toDto(Category category){
        return new CategoryDto(category.getCode(),category.getName());
    }
}
