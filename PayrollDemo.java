package chapter7;

/*Amanda Kaufman
Chapter 7
Programming Challenge 2
PayrollDemo Class
This class demonstrates the Payroll class.
*/

import java.util.Scanner;

public class PayrollDemo {

	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Create an instance of the Payroll class.
		Payroll list = new Payroll();
		
		//Declare variables to collect user input.
		int hoursInput;
		double payRateInput;
		
		//Get the user's data for each employee in the array.
		for (int index = 0; index < list.NUM_EMPLOYEES; index++)
		{
			//Get the hours input.
			System.out.print("Enter the hours worked by employee number " + list.getEmployeeID(index) + ": ");
			hoursInput = keyboard.nextInt();
			
			//Validate the hours input.
			while (hoursInput < 0)
			{
				System.out.print("ERROR: Enter 0 or greater for hours: ");
				hoursInput = keyboard.nextInt();
			}
			
			//Store the hours input.
			list.setHours(index, hoursInput);
			
			//Get the pay rate input.
			System.out.print("Enter the hourly pay rate for employee number " + list.getEmployeeID(index) + ": ");
			payRateInput = keyboard.nextDouble();
			
			//Validate the pay rate input.
			while (payRateInput < 6)
			{
				System.out.print("ERROR: Enter 6.00 or greater for pay rate: ");
				payRateInput = keyboard.nextDouble();
			}
			
			//Store the pay rate input.
			list.setPayRate(index,  payRateInput);
			
			//Calculate and store the employee's gross pay.
			list.setwages(index, list.calcGrossPay(index));
		}
		
		//Display the payroll data for the user.
		System.out.print("\n\nPAYROLL DATA\n============\n");
		for (int count = 0; count < list.NUM_EMPLOYEES; count++)
		{
			list.displayGrossPay(list.getEmployeeID(count));
		}
		
		//Close the Scanner object.
		keyboard.close();
	}

}
