import java.lang.System;
import java.util.Scanner;
class IQ08
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Students Count : ");
        int student_count = scan.nextInt();
        int eligible = 0;
        int not_eligible = 0;
        for(int i=0;i<student_count;i++)
        {
            System.out.println("Student "+(i+1));
            System.out.print("Enter your attendence percentage : ");
            int attendence = scan.nextInt();
            if(attendence<75)
            {
                not_eligible+=1;
                continue;
            }
            else
            {
                eligible+=1;
            }
        }
        System.out.println("Number of Students Eligible for exm : "+eligible);
        System.out.print("Number of Students not Eligible for exm : "+not_eligible);

    }
}
