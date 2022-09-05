package com.acl.test.application.usecases;

import com.acl.test.application.port.input.PriceCommand;
import com.acl.test.application.port.output.PriceRepository;
import com.acl.test.domain.Price;
import com.acl.test.domain.PriceQuery;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
public class PriceUseCase implements PriceCommand {

    private final PriceRepository priceRepository;

    public PriceUseCase(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public Price queryPrices(PriceQuery priceQuery) {
        return priceRepository.queryPrices(priceQuery).stream().findFirst().orElseThrow(
                NoSuchElementException::new);
    }
}
