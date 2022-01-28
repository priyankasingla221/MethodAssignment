package methodAssignmentQuestion1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mainClassFirstName = "";
		String mainClassLastName = "";
		int mainClassHourlyRate = 0;

		Employee obj = new Employee();

		obj.firstName = "Priyanka";
		obj.lastName = "Singla";
		obj.hourlyRate = 25;

		mainClassFirstName = obj.firstName;
		mainClassLastName = obj.lastName;
		mainClassHourlyRate = obj.hourlyRate;

		System.out.println("First Name of Employee: " + mainClassFirstName);
		System.out.println("Last Name of Emloyee: " + mainClassLastName);
		System.out.println("Hourly Pay rate: " + mainClassHourlyRate);

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of Hours Worked: ");
		int numberOfHourWorkerd = sc.nextInt();
		obj.setHoursWorked(numberOfHourWorkerd);

	}

}
