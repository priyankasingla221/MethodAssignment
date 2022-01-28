
/**. Create a class CustomerService which has 3 variables update name, 
 * email and address. Initialize these variables with the value gives below. 

Name = John 
Email = john@gmail.com
Address = 100 queen street

Write code to update these values from main class. 

**/
package methodAssignmentQuestion2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainClassName ="";
		String mainClassEmail = "";
		String mainClassAddress="";
		//Creating object of class
		CustomerService obj = new CustomerService();
		
		//Below is option if value is not intialized on class level then we can call here and give it a value or we can take it from class directly.
		/**obj.name= "john";
		obj.email ="john@gmail.com";
		obj.address="100 queen street"; 
		**/
		
		mainClassName = obj.getName();
		mainClassEmail= obj.getEmail();
		mainClassAddress=obj.getAddress();
		
		System.out.println("Name = " +mainClassName );
		System.out.println("Email= " +mainClassEmail);
		System.out.println("Address= " +mainClassAddress);
		
		obj.setName("johnathan");
		mainClassName = obj.getName();
		System.out.println("Updated Name: "+mainClassName);
		
		obj.setEmail("Johnathan@gmail.com");
		mainClassEmail=obj.getEmail();
		System.out.println("Updated Email:" +mainClassEmail);
		
		obj.setAddress("22 Edwards street");
		mainClassAddress= obj.getAddress();
		System.out.println("Updated Address:"+mainClassAddress);
		
		
		
	}

}
