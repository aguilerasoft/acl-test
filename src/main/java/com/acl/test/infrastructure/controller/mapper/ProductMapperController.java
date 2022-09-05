package com.acl.test.infrastructure.controller.mapper;

import com.acl.test.domain.Product;
import com.acl.test.infrastructure.controller.model.ProductRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapperController {

    ProductRequest toRequest(Product product);

    Product toDomain(ProductRequest productRequest);
}
