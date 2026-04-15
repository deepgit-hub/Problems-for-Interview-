import java.lang.System;
import java.util.Scanner;
class IQ17
{
    void purchase1(String item,int money)
    {
        System.out.println("Purchase item "+item+" and its price was "+money);
    }
    void purchase2(String item,int money)
    {
        System.out.println("Purchase item "+item+" and its price was "+money);
    }
    void purchase3(String item,int money)
    {
        System.out.println("Purchase item "+item+" and its price was "+money);
    }
    void purchase4(String item,int money)
    {
        System.out.println("Purchase item "+item+" and its price was "+money);
    }
    public static void main(String args[])
    {
        IQ17 p = new IQ17();
        p.purchase1("shampoo",200);
        p.purchase2("body wash",700);
        p.purchase3("face wash",100);
        p.purchase4("serum",50);

    }
}
