import java.lang.System;
import java.util.Scanner;
class IQ19
{
    void multiplication_table(int n,int limit)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
    public static void main(String args[])
    {
        Scanner scan =  new Scanner(System.in);
        Practice p = new Practice();
        System.out.print("Enter the Table number : ");
        int num = scan.nextInt();
        System.out.print("Enter the Limit : ");
        int l = scan.nextInt();
        p.multiplication_table(num,l);
    }
}
