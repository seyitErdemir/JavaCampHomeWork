package homeworkDay4_1.abstracts;

import homeworkDay4_1.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
@Override
public void save(Customer customer) {
	System.out.println("save to db "+customer.getFirstName());
	
}
}
