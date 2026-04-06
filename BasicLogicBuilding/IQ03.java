📌 Interview Question

Design a user access validation system that checks whether a user is allowed to enter based on the following conditions:

Username must be at least 5 characters
Password must be at least 8 characters
Age must be 18 or above
User must have a valid ID

If all conditions are satisfied → allow access
Otherwise → deny access with appropriate messages

import java.lang.System;
import java.util.Scanner;
class IQ03
{
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);
    boolean allow = true;
    System.out.print("Enter Your User name : ");
    String u_name = scan.nextLine();
    System.out.print("Enter your password  : ");
    String password = scan.nextLine();
    System.out.print("Enter your Age : ");
    int age = scan.nextInt();
    System.out.print("Enter '0' if you have id or '1' if you don't have : ");
    int id = scan.nextInt();
    if(u_name.length()<5)
    {
        System.out.println("The user name must contains more than 5 characters : ");
        allow= false;
        
    }
    if(password.length()<8)
    {
        System.out.println("The Password must contains more than 8 characters : ");
        allow = false;
        
    }
    if(age<18)
    {
        System.out.println("Your age must be greater than 18");
        allow= false;
        
    }
    if(id==1)
    {
        allow=false;
        
    }
    if(allow)
    {
        System.out.println("You can enter now!!!");
        
    }
    else
    {
        System.out.println("Access denined!!!");
        
    }
    }
}
