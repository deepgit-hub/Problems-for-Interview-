 /* 📌 Interview Question

Design a program to classify a triangle based on its side lengths.

The system should:

Accept three integer inputs representing the sides of a triangle

Check:
If all three sides are equal → mark as Equilateral
If any two sides are equal → mark as Isosceles
If all three sides are different → mark as Scalene

Finally, display the type of triangle. */
import java.lang.System;
import java.util.Scanner;
class IQ25
{
    void triangletype(int a,int b,int c)
    {
        if(a==b && b==c && c==b)
        {
            System.out.print("Equilateral");
        }
        else if(a==b || b==c || c==a)
        {
            System.out.print("Isosceles");
        }
        else{
            System.out.print("Scalene");
        }

    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        IQ25 p = new IQ25();
        System.out.print("Enter First angle : ");
        int  a=scan.nextInt();
        System.out.print("Enter Second angle : ");
        int b=scan.nextInt();
        System.out.print("Enter Third angle : ");
        int c=scan.nextInt();
        p.triangletype(a,b,c);

    }
}
