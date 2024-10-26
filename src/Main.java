import core.CreditCard;
import core.Customer;
import services.CustomerLimitServiceImp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        CreditCard c1=new CreditCard("1111-1111-1111-1111",new BigDecimal(5000));
        CreditCard c2=new CreditCard("2222-2222-2222-2222",new BigDecimal(1000));
        ArrayList<CreditCard> creditCardList=new ArrayList<CreditCard>();
        creditCardList.add(c1);
        creditCardList.add(c2);


        Customer cust1=new Customer("ozge", Optional.of("atasevenoz@gmail.com"),creditCardList);

        CustomerLimitServiceImp custService=new CustomerLimitServiceImp();

        System.out.println(cust1.getName()+"-"+cust1.getEmail().orElse("N/A")+"-"+custService.getTotalLimit(cust1));

    }
}