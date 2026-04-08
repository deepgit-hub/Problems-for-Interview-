/* 📌 Interview Question

Design an exam eligibility system with penalties and exceptions.

The system should:

Take:
Attendance percentage
Number of late entries
Rules:
If late entries > 3 → Not allowed
If late entries between 1–3 → Fine ₹100 per late
If attendance < 75%:
Ask for medical certificate
If no certificate → Not allowed

Finally:

If allowed → show:
Allowed (with or without fine)
If not allowed → show denial message */
import java.lang.System;
import java.util.Scanner;
class IQ09
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your attendence percentage : ");
        int attendence = scan.nextInt();
        System.out.print("Enter how many days you came late : ");
        int late = scan.nextInt();
        int fine = 0;
        boolean allow = true;
        if(late>3)
        {
            allow=false;
        }
        else 
        {
            fine = late*100;
        }
        if(attendence<75)
        {
        System.out.print("Enter '0' if you have medical cert or '1' if you don't have : ");
        int medical = scan.nextInt();
        if(medical==1)
        {
            allow=false;
        }
        }
        if(allow)
        {
            if(fine==0)
            {
                System.out.print("You are allowed to write the exam!!!");
            }
            else if(fine>0)
            {
                System.out.print("You can write exam after paying fine amount rupees "+fine);
            }
        }
        else
        {
            System.out.print("You can't write examination!!!");
        }
    }
}
