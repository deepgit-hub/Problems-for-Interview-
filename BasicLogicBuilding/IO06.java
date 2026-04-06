/* 📌 Interview Question

Design a user access level system based on the following conditions:

If the user does not have an ID → Access Denied
If the user has:
Experience ≥ 5 years and Age ≥ 25 → Admin Access
Experience ≥ 2 years → User Access
Otherwise → Limited Access

Display the user’s access level.
*/  
import java.util.Scanner;
import java.lang.System;
class IO06
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = scan.nextInt();
        System.out.print("Enter 0 if you have i'd or 1 if you don't have i'd");
        int id = scan.nextInt();
        System.out.print("Enter your experience : ");
        int experience = scan.nextInt();
        String result = (id==1) ? "access denied" : (experience>=5 && age>=25) ? "Admin access " : (experience>=2) ? "User access" : "limited access";
        System.out.println("You access level is : "+result); 
    }
}
