package com.acl.test.application.port.input;

import com.acl.test.domain.Price;
import com.acl.test.domain.PriceQuery;

public interface PriceCommand {
    Price queryPrices(PriceQuery priceQuery);
}

