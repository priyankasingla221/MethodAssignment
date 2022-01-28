/**There is Product class which has 3 variables that are already initialized, productName , product description  and price.
Write methods which just prints these values and call it from main class. 
NOTE : no sysout should be present in main class.**/

package methodAssignmentQuestion3;

public class Product {
	
	String productName = "Apple Watch";
	String productDescription ="Apple Watch can do what your other devices can’t because it’s"
			+ " on your wrist.";
	
	double price = 529.37;
	 void productInformation() {
		 System.out.println("Product Name: " +productName);
		 System.out.println("Product Description: "+productDescription);
		 System.out.println("Price: " +price);
	 }

}
