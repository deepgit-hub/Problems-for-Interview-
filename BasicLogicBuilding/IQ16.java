/* 📌 Interview Question

Write a Java program using methods to perform multiple tasks.

The program should:

Create different methods to:
Calculate sum of two numbers
Print a star pattern
Display college name
Display department
Display career goal

Call all methods from the main method.
import java.lang.System;
import java.util.Scanner;
*/
class IQ16
{
    void sum()
    {
        int a =10;
        int b=30;
        System.out.print("The Sum of "+a+" and  "+b+" is "+(a+b));

    }
    void printstar
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void college()
    {
        System.out.print("DBCY");
    }
    void department()
    {
        System.out.print("C S");
    }
    void goal()
    {
        System.out.print("Incident response team head ");
    }
    public static void main(String args[])
    {
        IQ16 p = new IQ16();
        p.sum();
        System.out.println();
        p.printstar();
        System.out.println();
        p.college();
        System.out.println();
        p.department();
        System.out.println();
        p.goal();
    }
}
