package pl.altkomsoftware.micronaut.perftest.product.api;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.product.CreateCategoryHandler;
import pl.altkomsoftware.micronaut.perftest.product.ListCategoriesHandler;

import java.util.List;

@Controller("/api/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CreateCategoryHandler createCategory;
    private final ListCategoriesHandler listCategories;

    @Post
    public CategoryDto create(@Body CreateCategoryCommand cmd){
        return createCategory.handle(cmd);
    }

    @Get("/all")
    public List<CategoryDto> listAll(){
        return listCategories.handle(new ListCategoriesQuery());
    }
}
