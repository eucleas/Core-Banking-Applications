package services;

import core.Customer;

import java.math.BigDecimal;

public interface CustomerLimitService {
    public BigDecimal getTotalLimit(Customer customer);
}
