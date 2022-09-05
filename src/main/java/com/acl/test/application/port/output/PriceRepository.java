package com.acl.test.application.port.output;

import com.acl.test.domain.Price;
import com.acl.test.domain.PriceQuery;

import java.util.List;

public interface PriceRepository {
    List<Price> queryPrices(PriceQuery priceQuery);
}

