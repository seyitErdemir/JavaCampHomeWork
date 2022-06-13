package homeworkDay4_1.concrete;

import homeworkDay4_1.abstracts.CustomerCheckService;
import homeworkDay4_1.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
@Override
public boolean CheckIfRealPerson(Customer customer) {
	return true;
}
}
