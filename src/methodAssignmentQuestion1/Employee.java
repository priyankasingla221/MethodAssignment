package methodAssignmentQuestion1;

public class Employee {

	String firstName = "";
	String lastName = "";
	int hourlyRate = 0;

	String getFirstName() {
		return firstName;

	}

	String getLastName() {
		return lastName;
	}

	double getHourlyRate() {
		return hourlyRate;

	}

	void setHoursWorked(int hoursWorked) {
		hoursWorked = hourlyRate * hoursWorked;
		System.out.println("Total weekly Salary: " + hoursWorked);

	}

}
