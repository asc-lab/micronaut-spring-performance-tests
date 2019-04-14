package perftest.product.api.assemblers;

import perftest.product.Category;
import perftest.product.api.CategoryDto;

import javax.inject.Singleton;

@Singleton
public class CategoryDtoAssembler {
    public CategoryDto toDto(Category category){
        return new CategoryDto(category.getCode(),category.getName());
    }
}
