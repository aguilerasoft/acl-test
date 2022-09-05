package com.acl.test.infrastructure.controller.mapper;

import com.acl.test.domain.Price;
import com.acl.test.domain.PriceQuery;
import com.acl.test.infrastructure.controller.model.PriceQueryRequest;
import com.acl.test.infrastructure.controller.model.PriceQueryResponse;
import org.mapstruct.Mapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Mapper(componentModel = "spring")
public interface PriceQueryMapperController {

    PriceQuery toDomain(PriceQueryRequest priceQueryRequest);

    default PriceQueryResponse toResponse(Price price) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
        return PriceQueryResponse.builder()
                .productId(price.getProductId())
                .brandId(price.getBrandId())
                .priceList(price.getPriceList())
                .startDate(dateFormat.format(price.getStartDate()))
                .endDate(dateFormat.format(price.getEndDate()))
                .price(price.getPrice()).build();
    }
}
