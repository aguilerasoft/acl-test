package com.acl.test.infrastructure.db.mapper;

import com.acl.test.domain.Product;
import com.acl.test.infrastructure.db.model.ProductDao;
import org.mapstruct.Mapper;

import java.util.Map;

@Mapper(componentModel = "spring")
public interface ProductMapperDB {

    default Map<String, Object> toMap(Product product) {
        return Map.of(
                "id", product.getId(),
                "product", product.getProduct()
        );
    }

    Product toDomain(ProductDao productDao);
}
