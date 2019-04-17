package pl.altkomsoftware.spring.perftest.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.altkomsoftware.spring.perftest.product.api.CategoryDto;
import pl.altkomsoftware.spring.perftest.product.api.CreateCategoryCommand;
import pl.altkomsoftware.spring.perftest.product.api.assemblers.CategoryDtoAssembler;

@Service
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
