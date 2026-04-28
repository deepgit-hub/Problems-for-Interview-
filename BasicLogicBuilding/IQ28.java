import java.lang.System;
import java.util.Scanner;
class IQ28
{
    int price;
    String brand;
    IQ01(int price)
    {
        this.price=price;
    }
    IQ01(int price,String brand)
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
        IQ01 a = new IQ01(1500000);
        IQ01 b = new IQ01(1200000,"BMW");
        a.display();
        b.display();
    }
}
