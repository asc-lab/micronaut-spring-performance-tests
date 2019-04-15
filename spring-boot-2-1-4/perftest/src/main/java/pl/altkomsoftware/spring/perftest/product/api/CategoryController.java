package pl.altkomsoftware.spring.perftest.product.api;

import pl.altkomsoftware.spring.perftest.product.CreateCategoryHandler;
import pl.altkomsoftware.spring.perftest.product.ListCategoriesHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category/")
@RequiredArgsConstructor
public class CategoryController {
    private final CreateCategoryHandler createCategory;
    private final ListCategoriesHandler listCategories;

    @PostMapping
    public CategoryDto create(@RequestBody CreateCategoryCommand cmd){
        return createCategory.handle(cmd);
    }

    @GetMapping("all")
    public List<CategoryDto> listAll(){
        return listCategories.handle(new ListCategoriesQuery());
    }
}
