package core;

import java.math.BigDecimal;
import java.util.Optional;

public class CreditCard {

    private String cardNumber;
    private BigDecimal limitAmount;

    public CreditCard(String cardNumber, BigDecimal limitAmount) {
        this.cardNumber = cardNumber;
        this.limitAmount = limitAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = validateCreditCard(Optional.of(cardNumber));
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    private String validateCreditCard(Optional<String> cardNumber){
        String pattern="\\d{4}-\\d{4}-\\d{4}-\\d{4}";
        return cardNumber.filter(c->c.matches(pattern)).orElseThrow(()->new IllegalArgumentException());
    }
}
