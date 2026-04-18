import java.lang.System;
import java.util.Scanner;
class Account
{
    String name;
    int acc_no;
    double balance =0;
    void getdetails(Scanner scan)
    {
        System.out.print("Enter Your name : ");
        name=scan.nextLine();
        System.out.print("Enter your account number : ");
        int acc_no = scan.nextInt();
    }
    void displaydetails()
    {
        System.out.println("Account Holder name : "+name);
        System.out.println("Account Number : "+acc_no);
    }
}
class SavingsAccount extends Account
{
    void deposit(Scanner scan)
    {
        double intrest;
        System.out.print("Enter the amount to deposit : ");
        int amount = scan.nextInt();
        balance+=amount;
        intrest = balance*(2/100);
        balance = balance+intrest;
        System.out.print("Balance after depost "+account+" is "+balance);
    }
    void withdraw(Scanner scan)
    {
        System.out.print("Enter the amount to withdraw : ");
        int amount =scan.nextInt();
        if(amount<=balance)
        {
            balance-=amount;
            System.out.print("Balance after withdraw "+amount+" is  "+balance);
        }
        else{
            System.out.print("Insufficient balance!!!");
        }
    }
    void checkbalance()
    {
        System.out.print("You Account Balance is : "+checkbalance);
    }
}

class CurrentAccount extends Account
{
    void deposit(Scanner scan)
    {
        System.out.print("Enter the amount to deposit : ");
        int amount = scan.nextInt();
        balance+=amount;
        System.out.print("Balance after depost "+account+" is "+balance);
    }
    void withdraw(Scanner scan)
    {
        System.out.print("Enter the amount to withdraw : ");
        int amount =scan.nextInt();
        if(amount<=balance)
        {
            balance-=amount;
            System.out.print("Balance after withdraw "+amount+" is  "+balance);
        }
        else{
            System.out.print("Insufficient balance!!!");
        }
    }
    void checkbalance()
    {
        System.out.print("You Account Balance is : "+checkbalance);
    }
}

class IQ01
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();
        System.out.println("1.Savings Account");
        System.out.println("2.Current Account");
        System.out.print("Enter your account type : ");
        int acc_type = scan.nextInt();
        if(acc_type==1)
        {
            s.getdetails(scan);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("1. ");
            System.out.println("1. Deposit");
        }
    }
}
