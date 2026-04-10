import java.lang.System;
import java.util.Scanner;
class IQ12
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your mark in Subject 1 : ");
        int m1 = scan.nextInt();
        System.out.print("Enter your mark in Subject 2 : ");
        int m2 = scan.nextInt();
        System.out.print("Enter your mark in Subject 3 : ");
        int m3 = scan.nextInt();
        double avg = (m1+m2+m3) /3.0;
        System.out.print("Enter '0' if you Summited your assiginmrent or '1' if not  : ");
        int ass=scan.nextInt();
        if(ass==1)
        {
            avg-=5;
        }
        if(avg>=90)
        {
            System.out.print("Your Average is "+avg" and you Got A Grade!!!");
        }
        else if(avg>=75 && avg<90)
        {
            System.out.print("Your Average is "+avg" and you Got B Grade!!!");
        }
        else if(avg>=60 && avg<75)
        {
            System.out.print("Your Average is "+avg" and you Got C Grade!!!");

        }
        else if(avg<60)
        {
            System.out.print("Needs Improvement!!!");
        }

    }
}
