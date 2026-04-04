/*
📌 Interview Question

Write a Java program to check the strength of a password.

The program should:

Identify common weak passwords (like "123456", "password", etc.)
Ensure password length is between 8 and 16 characters
Display:
Weak password message
Length validation warning
Strong password message
*/
import java.lang.System;
import java.util.Scanner;
class IQ02
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password Strength Checker!!!");
        System.out.print("Enter your Password : ");
        String pass = scan.nextLine();
        if(pass.equals("Password") ||pass.equals("password") || pass.equals("123456") || pass.equals("654321") )
        {
            System.out.print("The Password you Entered "+pass+" is weak!!!");
        }
        else if(pass.length()<8 || pass.length()>16)
        {
            System.out.print("The Password you Entered "+pass+" should be minimum 8 characters and maximum 16 characters");
        }
        else if(pass.length()>=8 && pass.length()<=16)
        {
            System.out.print("Strong Password!!!");
        }

    }
}
