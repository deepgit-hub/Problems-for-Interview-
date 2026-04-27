/* 📌 Interview Question

Design a program to store and display basic details of a person using a constructor.

The system should:

Create a class with instance variables:
    - name (String)
    - age (int)

Use a constructor to:
    - Initialize the name and age of the person

When an object is created:
    - Automatically display the person's name and age using the constructor

Finally, demonstrate the program by creating an object with sample values.

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
