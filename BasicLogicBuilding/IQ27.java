/* 📌 Interview Question

Design a program to store and display student details using a constructor and a method.

The system should:

Create a class with instance variables:
    - register number (int)
    - department (String)

Use a constructor to:
    - Initialize the register number and department of the student

Create a method to:
    - Display the student's register number and department

Finally:
    - Create an object with sample values
    - Call the display method to show the details
*/
import java.lang.System;
import java.util.Scanner;
class IQ27
{
    int reg_no;
    String department;
    IQ01(int reg_no,String department)
    {
        this.reg_no=reg_no;
        this.department=department;
    }
    void display()
    {
        System.out.print("You register number is "+this.reg_no+" and your department is "+this.department);
    }
    public static void main(String args[])
    {
        IQ27 a = new IQ27(107,"Computer Science");
        a.display();
    }
}
