package pl.altkomsoftware.spring.perftest.product.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.altkomsoftware.spring.perftest.product.*;

import java.util.List;

@RestController
@RequestMapping("/api/product/")
@RequiredArgsConstructor
public class ProductController {
    private final CreateProductHandler createProduct;
    private final ChangeProductPriceHandler changeProductPrice;
    private final ChangeProductCategoryHandler changeProductCategory;
    private final GetProductHandler getProduct;
    private final ListProductsByCategoryHandler listProductsByCategory;

    @PostMapping
    public ProductDto create(@RequestBody CreateProductCommand cmd) {
        return createProduct.handle(cmd);
    }

    @PostMapping("changePrice")
    public ProductDto changePrice(@RequestBody ChangeProductPriceCommand cmd) {
        return changeProductPrice.handle(cmd);
    }

    @PostMapping("changeCategory")
    public ProductDto changeCategory(@RequestBody ChangeProductCategoryCommand cmd) {
        return changeProductCategory.handle(cmd);
    }

    @GetMapping("{code}")
    public ProductDto getProduct(@PathVariable("code") String code) {
        return getProduct.handle(new GetProductQuery(code));
    }

    @GetMapping("/byCategory/{category}")
    public List<ProductDto> getByCategory(@PathVariable("category") String category) {
        return listProductsByCategory.handle(new ListProductsByCategoryQuery(category));
    }
}
