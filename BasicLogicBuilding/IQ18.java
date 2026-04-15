/* 📌 Interview Question

Write a Java program using methods to find:

The largest of three numbers
The smallest of three numbers

Call both methods from the main method. */
import java.lang.System;
import java.util.Scanner;
class IQ18
{
    public static void main(String args[])
    {
        void biggestnum(int a,int b,int c)
        {
            if(a>=b && a>=c)
            {
                System.out.print("The Greatest Number amoung the given number is "+a);
            }
            else if(b>=a && b>=c)
            {
                System.out.print("The Greatest Number amount the given number is "+b);
            }
            else 
            {
                System.out.print("The Greatest Number amount the given number is "+c);
            }
        }
        void smallestnum(int a,int b,int c)
        {
            if(a<=b && a<=c)
            {
                System.out.print("The Smallest Number amoung the given number is "+a);
            }
            else if(b<=a && b<=c)
            {
                System.out.print("The Smallest Number amount the given number is "+b);
            }
            else 
            {
                System.out.print("The Smallest Number amount the given number is "+c);
            }
        }
        public static void main(String args[])
        {
            Practice p = new Practice();
            p.biggestnum(13,56,76);
            p.smallestnum(8,23,43);
        }
    }
}
