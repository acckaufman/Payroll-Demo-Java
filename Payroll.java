package chapter7;

/*Amanda Kaufman
Chapter 7
Programming Challenge 2
PayrollDemo Class
This class stores employee pay information and calculates employee gross pay.
*/

public class Payroll {
	//Constant for the number of employees
	public final int NUM_EMPLOYEES = 7;
	
	//Array of employee ID numbers
	private int[] employeeID = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
	
	//Array to hold hours worked
	private int[] hours = new int[NUM_EMPLOYEES];
	
	//Array to hold pay rates
	private double[] payRate = new double[NUM_EMPLOYEES];
	
	//Array to hold wages earned
	private double[] wages = new double[NUM_EMPLOYEES];
	
	//Accessor method for hours.  Returns the employee ID of the employee at index location passed to the method.
	public int getEmployeeID(int index)
	{
		return employeeID[index];
	}
	
	//Accessor method for hours.  Returns the hours worked by the employee at index location passed to the method.
	public int getHours(int index)
	{
		return hours[index];
	}
	
	//Accessor method for hours.  Returns the pay rate of the employee at index location passed to the method.
	public double getPayRate(int index)
	{
		return payRate[index];
	}
	
	//Accessor method for hours.  Returns the wages earned by the employee at index location passed to the method.
	public double getWages(int index)
	{
		return wages[index];
	}
	
	//Mutator method for employee ID.  Manually assigns the num argument to the employee ID
	//of the employee stored at the index location passed to the method.
	public void setEmployeeID(int index, int num)
	{
		employeeID[index] = num;
	}
	
	//Mutator method for hours.  Manually assigns the num argument to the hours worked
	//by the employee stored at the index location passed to the method.
	public void setHours(int index, int num)
	{
		hours[index] = num;
	}
	
	//Mutator method for pay rate.  Manually assigns the num argument to the pay rate
	//of the employee stored at the index location passed to the method.
	public void setPayRate(int index, double num)
	{
		payRate[index] = num;
	}
	
	//Mutator method for wages.  Manually assigns the num argument to the wages earned
	//by the employee stored at the index location passed to the method.
	public void setwages(int index, double num)
	{
		wages[index] = num;
	}
	
	//Calculates and stores the total gross pay earned by the employee stored at
	//the index passed to the method.
	public double calcGrossPay(int index)
	{
		return (hours[index] * payRate[index]);
	}
	
	//Finds an employee number passed to the method in the employeeID array, then displays
	//gross pay for the employee at that index.
	public void displayGrossPay(int num)
	{
		boolean found = false;	//Flag to indicate when employee passed to function is found.
		
		for (int count = 0; count < NUM_EMPLOYEES; count++)
		{
			//If the employee ID number is found, display the employee number and gross pay.
			if (employeeID[count] == num)
			{
				found = true;	//Set the found flag to true.
				System.out.print("Employee ID: " + num + "\n");	//Print the employee ID
				System.out.printf("Gross pay: $%.2f", wages[count]);	//Print the gross pay
				System.out.print("\n\n");	//Print a couple endlines to separate employees
			}
		}
		
		//If the found flag is still false, display an error message.
		if (found == false)
		{
			System.out.print("Error: Employee " + num + " not found.\n\n");
		}
	}
}
