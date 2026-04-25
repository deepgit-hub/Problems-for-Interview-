📌 Interview Question

Write a Java program using classes and objects to store details of multiple phones and find the most expensive one.

The program should:

Store:
Brand name
Price
Storage
Take input for 3 phones
Display all phone details
Compare and print the phone with highest price
import java.lang.System;
import java.util.Scanner;
class IQ01
{
    String name;
    int price;
    int storage;
    void getdetails(Scanner scan)
    {
        System.out.print("Enter Brand Name : ");
        name = scan.nextLine();
        System.out.print("Enter Price : ");
        price = scan.nextInt();
        System.out.print("Enter Storage : ");
        storage = scan.nextInt();
        scan.nextLine();
    }
    void display()
    {
        System.out.println("Details...");
        System.out.println("Brand   : "+name);
        System.out.println("Price   : "+price);
        System.out.println("Storage : "+storage);
        System.out.println();
    }
   static void compare(IQ01 a,IQ01 b,IQ01 c)
    {
        if(a.price>=b.price && a.price>=c.price)
        {
            System.out.print("First phone price is High "+a.price);
        }
        else if(b.price>a.price && b.price>c.price)
        {
            System.out.print("Second phone price is High "+b.price);
        }
        else 
        {
            System.out.print("Third phone price is High "+c.price);
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        IQ01 a = new IQ01();
        IQ01 b = new IQ01();
        IQ01 c = new IQ01();
        
        a.getdetails(scan);
        b.getdetails(scan);
        c.getdetails(scan);
        a.display();
        b.display();
        c.display();
        compare(a,b,c);

    }
}
