package au.com.zing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Random;

import au.com.zing.Customer;

import org.mule.el.datetime.DateTime;

/*
This is a bean class is only used as a facade to hide the DB processing.
This class will take care of all the Database processing operations  */

public class ZingDBFacade {

	private HashMap<String, Customer> customeDBMap;

	public ZingDBFacade() {
		customeDBMap = new HashMap<String, Customer>();
		customeDBMap.put("c0001", new Customer("c0001", "John", "Smith", "1 2nd Street", "New York", "NY", "10021",
				new DateTime("2016-02-28T16:41:41.090Z")));
		customeDBMap.put("c0002", new Customer("c0002", "Jim", "Moore", "2 2nd Street", "New York", "NY", "10020",
				new DateTime("2016-02-28T16:41:41.090Z")));

	}

	public Collection<Customer> getCustomers() {
		return customeDBMap.values();

	}

	public boolean deleteCustomer(String key) {
		return customeDBMap.remove(key) != null;

	}

	public String createCustomer( Customer value) {
		if(null == value.getId())
			value.setId("c"+new Random().nextInt());
		customeDBMap.put(value.getId(), value);
		return value.getId() ;

	}

	public boolean updateCustomer(String key, Customer value) {
		if(customeDBMap.containsKey(key))
		  return customeDBMap.put(key, value) != value;
		else
			return false;

	}

	/*This methods needs to be implemented based on the { "op":"remove","value":"lastname"}
	{ "op":"replace", "path": "/customer/{id}/lastname", "value":"Newtom"}
	Replace is used to set a new value to a member of the object. 
	It is logically equivalent to a remove operation followed by an add operation to the same path or to an add operation to an existing member.
	TODO implement operation as specified in the op on resource*/
	
	public boolean patchCustomers(String key, String jsonString) {
		if(customeDBMap.containsKey(key))
			  return true;
			else
				return false;
	}

	public Customer getCustomer(String key) {
		return customeDBMap.get(key);

	}
}
