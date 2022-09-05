package com.acl.test.infrastructure.db.mapper;

import com.acl.test.infrastructure.db.model.BrandDao;
import com.acl.test.domain.Brand;
import org.mapstruct.Mapper;

import java.util.Map;

@Mapper(componentModel = "spring")
public interface BrandMapperDB {

    default Map<String, Object> toMap(Brand brand) {
        return Map.of(
                "id", brand.getId(),
                "brand", brand.getBrand()
        );
    }

    Brand toDomain(BrandDao brandDao);
}
