/* 📌 Interview Question

Design a movie ticket pricing system based on the following conditions:

Ticket price depends on age:
Below 12 → ₹100
Between 12 and 60 → ₹150
Above 60 → ₹80
If it is a holiday, add ₹20 extra
If the show time is 10 AM, apply a 10% discount

Display the final ticket price.
*/
import java.util.Scanner;
import java.lang.System;
class IQ04
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=scan.nextInt();
        System.out.print("Enter 0 if Today is holiday and 1 if today is working day ");
        int day=scan.nextInt();
        System.out.print("Enter the time of the Show : ");
        int time=scan.nextInt();
        int price=0;
        if(age<12)
        {
            price=100;
        }
        else if(age>=12 && age<=60)
        {
            price=150;
        }
        else if(age>60)
        {
            price=80;
        }
        if(day==0)
        {
            price+=20;
        }
        if(time==10)
        {
            price-=price/10;
        }
        System.out.print("The Total amount of the ticket will be : "+price);


    }
}
