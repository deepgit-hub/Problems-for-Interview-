/* 📌 Interview Question

Design a library fine management system for students returning books late.

The system should:

Take number of students
Record number of delayed days for each student
Calculate fine based on delay:
Delay ≥ 5 days → ₹5 per day
Delay > 5 and ≤ 10 → ₹10 per day
Delay > 10 → ₹20 per day + warning

Finally, display:

Total fine collected
Highest fine among students
Number of students who received warnings */

import java.lang.System;
import java.util.Scanner;
class IQ01
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Students came to return their books : ");
        int student_count = scan.nextInt();
        int delay[] = new int[student_count];
        int fine[] = new int[student_count];
        int warning =0;
        int total_fine =0;
        for(int i=0;i<student_count;i++)
        {
            System.out.println("Student "+(i+1));
            System.out.print("Enter number of days to took to return the book : ");
            delay[i]= scan.nextInt();
        }
        for(int j=0;j<student_count;j++)
        {
            if(delay[j]<=5 )
            {
                fine[j] +=delay[j] * 5;
            }
            else if(delay[j]>5 && delay[j]<=10)
            {
                fine[j] +=delay[j] * 10;
            }
            else if(delay[j]>10)
            {
                fine[j] +=delay[j] * 20;
                warning+=1;
            }
        }
        int highest_fine = fine[0];
        for(int k=0;k<student_count;k++)
        {
            if(highest_fine<fine[k])
            {
                highest_fine = fine[k];
            }
            total_fine+=fine[k];
        }
        System.out.println("----FINAL REPORT----");
        System.out.println("Total Fine collected             : "+total_fine);
        System.out.println("Highest fine amount collected is : "+highest_fine);
        System.out.println("Students with warning : "+warning);
    }
}
