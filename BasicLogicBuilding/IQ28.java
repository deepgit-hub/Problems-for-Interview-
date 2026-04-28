/* 📌 Interview Question

Design a program to demonstrate constructor overloading using a car information system.

The system should:

Create a class with instance variables:
    - price (int)
    - brand (String)

Use constructor overloading to:
    - Initialize only price using one constructor
    - Initialize both price and brand using another constructor

Create a method to:
    - Display the car details (price and brand)

Finally:
    - Create multiple objects using different constructors
    - Call the display method to show the details of each car
*/
import java.lang.System;
import java.util.Scanner;
class IQ28
{
    int price;
    String brand;
    IQ28(int price)
    {
        this.price=price;
    }
    IQ28(int price,String brand)
    {
        this.price=price;
        this.brand=brand;
    }
    void display()
    {
        System.out.println("Car Price : "+this.price);
        System.out.println("Car Brand : "+this.brand);
    }
    public static void main(String args[])
    {
        IQ28 a = new IQ28(1500000);
        IQ28 b = new IQ28(1200000,"BMW");
        a.display();
        b.display();
    }
}
