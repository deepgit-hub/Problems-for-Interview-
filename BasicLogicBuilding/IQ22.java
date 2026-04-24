/* 📌 Interview Question

Write a Java program using a class and object to store and display student details by taking input from the user.

The program should:

Create a class with attributes:
Name
Roll Number
Register Number
Department
Take input using Scanner
Store values in an object
Display the student details */
import java.lang.System;
import java.util.Scanner;
class IQ22
{
    String name;
    int roll_no;
    int reg_no;
    String department;
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        IQ22 a = new IQ22();
        System.out.print("Enter Student Name : ");
        a.name=scan.nextLine();
        System.out.print("Enter Roll number : ");
        a.roll_no = scan.nextInt();
        System.out.print("Enter Reg Number : ");
        a.reg_no=scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Department : ");
        a.department=scan.nextLine();
        System.out.println("Student Details");
        System.out.println("Name        : "+a.name);
        System.out.println("Roll no     : "+a.roll_no);
        System.out.println("Reg no      : "+a.reg_no);
        System.out.println("Department  : "+a.department);

    }
}
