import java.lang.System;
import java.util.Scanner;
class Account
{
    String name;
    int acc_no;
    double balance =0;
    void getdetails(Scanner scan)
    {
        scan.nextLine();
        System.out.print("Enter Your name : ");
        name=scan.nextLine();
        System.out.print("Enter your account number : ");
        acc_no = scan.nextInt();
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
        System.out.print("Balance after depost "+amount+" is "+balance);
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
        System.out.print("You Account Balance is : "+balance);
    }
}

class CurrentAccount extends Account
{
    void deposit(Scanner scan)
    {
        System.out.print("Enter the amount to deposit : ");
        int amount = scan.nextInt();
        balance+=amount;
        System.out.print("Balance after depost "+amount+" is "+balance);
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
        System.out.print("You Account Balance is : "+balance);
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
            boolean run = true;
            s.getdetails(scan);
            while(run)
            {
            
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Details");
            System.out.print("Enter your choice (1-4)");
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    s.deposit(scan);
                    break;
                case 2:
                    s.withdraw(scan);
                    break;
                case 3:
                    s.checkbalance();
                    break;
                case 4:
                    s.displaydetails();            
                    break;
                default:
                    System.out.print("Invalid choice entered!!!");    

            }}
        }
        else if(acc_type==2)
        {
            boolean run = true;
               c.getdetails(scan);
            while(run)
            {
         
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Details");
            System.out.print("Enter your choice (1-4)");
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    c.deposit(scan);
                    break;
                case 2:
                    c.withdraw(scan);
                    break;
                case 3:
                    c.checkbalance();
                    break;
                case 4:
                    c.displaydetails();            
                    break;
                default:
                    System.out.print("Invalid choice entered!!!");  
            }}
        }    
    }
}
