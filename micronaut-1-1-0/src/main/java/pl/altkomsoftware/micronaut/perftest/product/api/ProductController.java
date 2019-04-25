package pl.altkomsoftware.micronaut.perftest.product.api;

import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.product.*;

import java.util.List;

@Controller("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final CreateProductHandler createProduct;
    private final ChangeProductPriceHandler changeProductPrice;
    private final ChangeProductCategoryHandler changeProductCategory;
    private final GetProductHandler getProduct;
    private final ListProductsByCategoryHandler listProductsByCategory;

    @Post
    public ProductDto create(@Body CreateProductCommand cmd){
        return createProduct.handle(cmd);
    }

    @Post("/changePrice")
    public ProductDto changePrice(@Body ChangeProductPriceCommand cmd){
        return changeProductPrice.handle(cmd);
    }

    @Post("/changeCategory")
    public ProductDto changeCategory(@Body ChangeProductCategoryCommand cmd){
        return changeProductCategory.handle(cmd);
    }

    @Get("/{code}")
    public ProductDto getProduct(String code){
        return getProduct.handle(new GetProductQuery(code));
    }

    @Get("/byCategory/{category}")
    public List<ProductDto> getByCategory(String category){
        return listProductsByCategory.handle(new ListProductsByCategoryQuery(category));
    }
}
