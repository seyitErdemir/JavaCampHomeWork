package inheritance;

public class Main {

	public static void main(String[] args) {
		
		
		individualCustomer seyit = new individualCustomer();
		seyit.customerNumber="1231   ";
		seyit.id=5;
	
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="hepsi burada   ";
		
		
		SendikaCustomer sendik=new SendikaCustomer();
		sendik.customerNumber="asd  ";
		
		SendikaCustomer sendik2=new SendikaCustomer();
		sendik2.customerNumber="asd asdd asd as d ";
		
		
		CustomerManager customManager=new CustomerManager();
		
		
		
		Customer [] customers= {seyit,hepsiBurada,sendik,sendik2};
		customManager.add(sendik2);
		customManager.addMultiple(customers);
		
		
		
		
	}

}
