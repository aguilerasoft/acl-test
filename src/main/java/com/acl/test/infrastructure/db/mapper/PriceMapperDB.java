package com.acl.test.infrastructure.db.mapper;

import com.acl.test.domain.PriceQuery;
import org.mapstruct.Mapper;

import java.util.Map;

@Mapper(componentModel = "spring")
public interface PriceMapperDB {

    default Map<String, Object> toMap(PriceQuery priceQuery) {
        return Map.of(
                "productId", priceQuery.getProductId(),
                "brandId", priceQuery.getBrandId(),
                "queryDate", priceQuery.getQueryDate()
        );
    }
}
