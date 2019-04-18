package pl.altkomsoftware.micronaut.perftest.product;

import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.product.api.CategoryDto;
import pl.altkomsoftware.micronaut.perftest.product.api.CreateCategoryCommand;
import pl.altkomsoftware.micronaut.perftest.product.api.assemblers.CategoryDtoAssembler;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class CreateCategoryHandler {
    private final CategoryRepository categoryRepository;
    private final CategoryDtoAssembler categoryDtoAssembler;

    public CategoryDto handle(CreateCategoryCommand cmd){
        Category c = new Category(cmd.getCode(),cmd.getName());
        categoryRepository.save(c);
        return categoryDtoAssembler.toDto(c);
    }
}
