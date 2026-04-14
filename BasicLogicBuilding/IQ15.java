import java.lang.System;
import java.util.Scanner;
class IQ15
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int subject[] = new int[5];
        System.out.print("Enter Your name : ");
        String name = scan.nextLine();
        int total=0;
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter Subject "+(i+1)+" mark (between 100)");
            subject[i] = scan.nextInt();
            total+=subject[i];
        }
        double avg = total/5.0;
        String grade;
        if(total>450 && total<=500)
        {
            grade="A";
        }
        else if(total>400 && total<=450)
        {
            grade = "B";
        }
        else if(total>300 && total<=400)
        {
            grade ="C";
        }
        else{
            grade ="D";
        }
        System.out.println("Student Name : "+name);
        System.out.println("Total Mark   : "+total);
        System.out.println("Average      : "+avg);
        System.out.println("Grade        : "+grade);

    }
}
