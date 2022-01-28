
/**. Create a class CustomerService which has 3 variables update name, 
 * email and address. Initialize these variables with the value gives below. 

Name = John 
Email = john@gmail.com
Address = 100 queen street

Write code to update these values from main class. 

**/
package methodAssignmentQuestion2;

public class CustomerService {

	String name = "John";
	String email = "John@gmail.com";
	String address = "100 Queen street";

	String getName() {
		return name;
	}

	String getEmail() {
		return email;
	}

	String getAddress() {
		return address;

	}

	void setName(String newname) {
		name = newname;
	}

	void setEmail(String newemail) {
		email = newemail;
	}

	void setAddress(String newaddress) {
		address = newaddress;
	}
}
