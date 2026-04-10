import java.lang.System;
import java.util.Scanner;
class IQ11
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Students : ");
        int student_count = scan.nextInt();
        int sc[] = new int[student_count];
        int strict_warning =0;
        int awared =0;
        int noteligible=0;
        int eligible =0;
        int invalid =0;
        for(int i=0;i<student_count;i++)
        {
            System.out.println("Student "+(i+1));
            System.out.print("Enter Your attendence percentage : ");
            sc[i] = scan.nextInt();
        }
        for(int j=0;j<student_count;j++)
        {
            if(sc[j]<=40)
            {
                strict_warning+=1;
            }
            else if(sc[j]>40 && sc[j]<75)
            {
                noteligible+=1;
            }
            else if(sc[j]>=75 && sc[j]<95)
            {
                eligible+=1;
            }
            else if(sc[j]>=95 && sc[j]<=100)
            {
                awared+=1;
            }
            else
            {
                invalid +=1;
            }
        }
        System.out.println("Students with Strict Warning : "+strict_warning);
        System.out.println("Students who are not eligible : "+noteligible);
        System.out.println("Students who are eligible : "+eligible);
        System.out.println("Students who are Awarded : "+awared);
        System.out.println("Students gave invalid input : "+invalid);

    }
}
