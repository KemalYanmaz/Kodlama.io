package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerService;
import Abstract.IPersonCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckManager customerCheckManager;
    @Override
    public void save(Customer customer) throws Exception {
        if(customerCheckManager.checkIfRealPerson(customer)){
            super.save(customer );
        }
        else{
            throw new Exception("Not a valid person");
        }
    }

}
