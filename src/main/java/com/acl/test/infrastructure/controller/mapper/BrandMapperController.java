package com.acl.test.infrastructure.controller.mapper;

import com.acl.test.domain.Brand;
import com.acl.test.infrastructure.controller.model.BrandRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BrandMapperController {

    BrandRequest toRequest(Brand brand);

    Brand toDomain(BrandRequest brandRequest);
}
