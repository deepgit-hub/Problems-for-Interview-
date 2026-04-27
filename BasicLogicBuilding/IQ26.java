import java.lang.System;
import java.util.Scanner;
class IQ26
{
    int age;
    String name;
    IQ26(int age,String name)
    {
        this.age=age;
        this.name=name;
        System.out.print("Your Name is : "+this.name+" and your age is "+this.age);
    }
    public static void main(String args[])
    {
        IQ26 a = new IQ26(17,"Chandrasekeross");
    }
}
