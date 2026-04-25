/*📌 Interview Question

Write a Java program using a class and methods to input and display details of multiple students.

The program should:

Create a class with attributes:
Name, Age, Register Number, Department
Create methods:
getDetails() → to take input
display() → to print details
Create multiple objects and use the same methods for each */
import java.lang.System;
import java.util.Scanner;
class IQ23
{
    
    int age;
    int reg_no;
    String department;
    String name;
    void getdetails(Scanner scan)
    {
        
        System.out.print("Enter Student name : ");
        name = scan.nextLine();
        System.out.print("Enter Student Reister Number : ");
        reg_no = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Student Department : ");
        department = scan.nextLine();
        System.out.print("Enter Student age : ");
        age = scan.nextInt();
        scan.nextLine();
    }
    void display()
    {
        System.out.println("Student Name            : "+name);
        System.out.println("Student Age             : "+age);
        System.out.println("Student Register Number : "+reg_no);
        System.out.println("Student Department      : "+department);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        IQ23 a = new IQ23();
        IQ23 b = new IQ23();
        a.getdetails(scan);
        b.getdetails(scan);
        a.display();
        b.display();
    }
}
