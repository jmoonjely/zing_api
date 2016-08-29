package au.com.zing;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mule.el.datetime.DateTime;
import au.com.zing.Customer;

//This class is to test the ZingDBFacade methods

public class ZingDBFacadeTest {

	@BeforeClass
	public static void runOnceBeforeClass() {
		 
	}

	@Test
	public void test_getCustomers() {
		ZingDBFacade zingDBFacade = new ZingDBFacade();
		assertEquals("All customers",2, zingDBFacade.getCustomers().size());
	}
	
	@Test
	public void test_createCustomers() {
		ZingDBFacade zingDBFacade = new ZingDBFacade();
		Customer c= new Customer(null, "Jim", "Moore", "2 2nd Street", "New York", "NY", "10020",
				new DateTime("2016-02-28T16:41:41.090Z"));
		  zingDBFacade.createCustomer( c);
		assertEquals("new added- get  customers",3, zingDBFacade.getCustomers().size());
		
	}
	
	@Test
	public void test_deleteCustomer() {
		ZingDBFacade zingDBFacade = new ZingDBFacade();
		assertEquals("Delete customer failed",true, zingDBFacade.deleteCustomer("c0001"));
	}
	
	@Test
	public void test_deleteInvalidCustomer() {
		ZingDBFacade zingDBFacade = new ZingDBFacade();
		assertEquals("Delete customer failed",false, zingDBFacade.deleteCustomer("c00031"));
	}
	 
	@Test
	public void test_updateCustomer() {
		ZingDBFacade zingDBFacade = new ZingDBFacade();
		Customer c= new Customer("c0001" , "Jim", "Moore", "2 2nd Street", "New York", "KS", "10020",
				new DateTime("2016-02-28T16:41:41.090Z"));
		assertEquals("update  customer failed",true, zingDBFacade.updateCustomer("c0001",c));
	}
	 
	@Test
	public void test_updateInvalidCustomer() {
		ZingDBFacade zingDBFacade = new ZingDBFacade();
		Customer c= new Customer("c00099" , "Jim", "Moore", "2 2nd Street", "New York", "KS", "10020",
				new DateTime("2016-02-28T16:41:41.090Z"));
		assertEquals("update  customer failed",false, zingDBFacade.updateCustomer("c00099",c));
	}
}
