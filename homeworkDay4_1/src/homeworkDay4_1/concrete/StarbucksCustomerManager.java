package homeworkDay4_1.concrete;

import homeworkDay4_1.abstracts.BaseCustomerManager;
import homeworkDay4_1.abstracts.CustomerCheckService;
import homeworkDay4_1.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)==true) {
			super.save(customer);
		}else {
			System.out.println("not a valid person ");
		}
			
			
	}
	
	 
}
