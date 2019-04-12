package com.asc.lab.perftest.product.api.assemblers;

import com.asc.lab.perftest.product.Category;
import com.asc.lab.perftest.product.api.CategoryDto;
import org.springframework.stereotype.Component;

@Component
public class CategoryDtoAssembler {
    public CategoryDto toDto(Category category){
        return new CategoryDto(category.getCode(),category.getName());
    }
}
