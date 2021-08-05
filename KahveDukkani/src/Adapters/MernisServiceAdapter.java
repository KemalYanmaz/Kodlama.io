package Adapters;

import Abstract.IPersonCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements IPersonCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {

        return false;
    }
}
