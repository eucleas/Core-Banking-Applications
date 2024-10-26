package test;

import core.CreditCard;
import core.Customer;
import org.junit.Test;
import services.CustomerLimitServiceImp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class CustomerLimitServiceTest {

    @Test
    public void testCalculatelimit(){

        CreditCard c1=new CreditCard("1111-1111-1111-1111",new BigDecimal(5000));
        CreditCard c2=new CreditCard("2222-2222-2222-2222",new BigDecimal(1000.00));
        ArrayList<CreditCard> creditCardList=new ArrayList<CreditCard>();
        creditCardList.add(c1);
        creditCardList.add(c2);


        Customer cust1=new Customer("ozge", Optional.of("atasevenoz@gmail.com"),creditCardList);

        CustomerLimitServiceImp custService=new CustomerLimitServiceImp();

       assertEquals(new BigDecimal(6000),custService.getTotalLimit(cust1));
    }
}
