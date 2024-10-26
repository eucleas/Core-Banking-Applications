package core;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


public class Customer {

    private String name;
    private Optional<String> email;
    private List<CreditCard> creditcards;

    public Customer(String name, Optional<String> email, List<CreditCard> creditcards) {
        this.name = name;
        this.email = email;
        this.creditcards = creditcards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public List<CreditCard> getCreditcards() {
        return creditcards;
    }

    public void setCreditcards(List<CreditCard> creditcards) {
        this.creditcards = creditcards;
    }

    public BigDecimal getTotalCardLimit(){
        return creditcards.stream().map(CreditCard::getLimitAmount).reduce(BigDecimal.ZERO,BigDecimal::add);
    }
}
