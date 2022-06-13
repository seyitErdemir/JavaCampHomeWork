package homeworkDay4_1.adapters;

import homeworkDay4_1.abstracts.CustomerCheckService;
import homeworkDay4_1.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		
	boolean serviceResult=false;
    	
    	try {
    		
    		serviceResult = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()), customer.getFirstName(), customer.getLastName(), customer.getDateofBirth().getYear());
    		
		} catch (Exception e) {
			
			System.out.println("Not a valid person");
		}
    	    
       return serviceResult;
	}
}
