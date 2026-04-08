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
