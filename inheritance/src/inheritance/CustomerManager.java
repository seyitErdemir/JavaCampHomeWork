package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println("---------------------------");
		System.out.println(customer.id + "  id kaydedildi");
		System.out.println(customer.customerNumber + " numara  kaydedildi");
		System.out.println("---------------------------");
		
	}
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers) {
			add(customer);
			
		}
		
	}

}
