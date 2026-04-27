import java.lang.System;
import java.util.Scanner;
class IQ27
{
    int reg_no;
    String department;
    IQ01(int reg_no,String department)
    {
        this.reg_no=reg_no;
        this.department=department;
    }
    void display()
    {
        System.out.print("You register number is "+this.reg_no+" and your department is "+this.department);
    }
    public static void main(String args[])
    {
        IQ27 a = new IQ27(107,"Computer Science");
        a.display();
    }
}
