import java.lang.System;
import java.util.Scanner;
class IQ10
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Students in your hostel : ");
        int student_count = scan.nextInt();
        int sc[] = new int[student_count];
        int warning =0;
        int notallow =0;
        int allow=0;
        for(int i=0;i<student_count;i++)
        {
            System.out.println("Student : "+(i+1));
            System.out.print("Enter the time now (24 hrs format) : ");
            sc[i] = scan.nextInt();
        }
        for(int j=0;j<student_count;j++)
        {
            if(sc[j]>=7 && sc[j]<20)
            {
                allow+=1;
            }
            else if(sc[j]>=20 && sc[j]<22)
            {
                warning+=1;
            }
            else if(sc[j]>=22 && sc[j]<7)
            {
                notallow+=1;
            }
        }
        System.out.println("Hostel Monitor Report");
        System.out.println("Allowed Students : "+allow);
        System.out.println("Not Allowed Students : "+notallow);
        System.out.println("Students with warning : "+warning);
    }
}
