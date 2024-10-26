package services;

import core.Customer;

import java.math.BigDecimal;

public class CustomerLimitServiceImp implements CustomerLimitService {

    @Override
    public BigDecimal getTotalLimit(Customer customer) {
        return customer.getTotalCardLimit();
    }
}
