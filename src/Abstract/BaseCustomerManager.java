package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("saved to db: " + customer.firstName);
		
		
	}

}
