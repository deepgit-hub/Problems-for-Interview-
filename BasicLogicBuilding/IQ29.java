/* 📌 Interview Question

Design an employee management system using inheritance and method overriding.

The system should:

Create a base class "Employee" with:
    - name (String)
    - id (int)
    - salary (double)

Include methods in Employee:
    - Constructor to initialize employee details
    - Method to display employee details
    - Method to calculate bonus (10% of salary)

Create a subclass "Manager" that extends Employee:
    - Additional attribute: team size (int)

Override the bonus calculation method in Manager:
    - Bonus should be 20% of salary

Finally:
    - Accept input for both Employee and Manager
    - Create objects for each
    - Display manager details and calculate their bonus
*/
package practice;
import java.lang.System;
import java.util.Scanner;
class Employee
{
	String name;
	int id;
	double salary;
	double bonus;
	Employee(String name,int id,double salary) // Constructor 
	{

		this.name = name; 
		this.id = id;
		this.salary = salary;
	}
	void displaydetails()
	{
		System.out.println("Name of the Employee : "+this.name);
		System.out.println("Employee id : "+this.id);
		System.out.println("Emplyee Salary : "+this.salary);
		
	}
	double calculatebonus()
	{
		return salary*0.10;
	}
}
class Manager extends Employee
{
	int teamsize;
	Manager(String name,int id,double salary,int teamsize)
	{
		super(name,id,salary);
		this.teamsize = teamsize;
		
	}
	@Override
	double calculatebonus()
	{
		
		return salary *0.20;
	}
}
class IQ29
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter Employee Name : ");
	String ename = scan.nextLine();
	System.out.print("Enter Employee I'd : ");
	int eid= scan.nextInt();
	System.out.print("Enter Employee Salary : ");
	double esalary = scan.nextDouble();
	Employee e1 = new Employee(ename,eid,esalary);
	scan.nextLine();
	System.out.print("Enter Manager Name : ");
	String mname = scan.nextLine();
	System.out.print("Enter Manager I'd : ");
	int mid = scan.nextInt();
	System.out.print("Enter Manager Salary : ");
	double msalary = scan.nextDouble();
	System.out.print("Enter Team size : ");
	int teamsize = scan.nextInt();
	Manager m1 = new Manager(mname,mid,msalary,teamsize);
	m1.displaydetails();
	System.out.print("Manager Bonus : "+m1.calculatebonus());
	}
}
