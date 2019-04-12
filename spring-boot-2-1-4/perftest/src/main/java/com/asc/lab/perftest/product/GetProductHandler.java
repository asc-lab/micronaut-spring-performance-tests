package com.asc.lab.perftest.product;


import com.asc.lab.perftest.product.api.GetProductQuery;
import com.asc.lab.perftest.product.api.ProductDto;
import com.asc.lab.perftest.product.api.assemblers.ProductDtoAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class GetProductHandler {
    private final ProductRepository productRepository;
    private final ProductDtoAssembler productDtoAssembler;

    public ProductDto handle(GetProductQuery query){
        return productDtoAssembler.toDto(productRepository.findByCode(query.getCode()));
    }
}
