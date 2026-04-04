/* Design a simple login authentication system that verifies:

Username
Password
OTP (One-Time Password)

Display appropriate messages for:

Incorrect username
Incorrect password
Incorrect OTP
Successful login */
import java.lang.System;
import java.util.Scanner;
class IQ01
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String user_name = "Deepak";
        String password = "2911";
        int otp = 249934;
        System.out.print("Enter Your user name : ");
        String u_name = scan.nextLine();
        if(user_name.equals(u_name))
        {
            System.out.print("Enter your password : ");
            String p = scan.nextLine();
            if(password.equals(p))
            {
                System.out.print("Enter  otp : ");
                int o = scan.nextInt();
                if(otp==o)
                {
                    System.out.print("Login successful");
                }
                else
                {
                    System.out.print("Incorrect otp entered");
                }
            }
            else
            {
            System.out.print("Incorrect Password entered");
            }
        }
        else 
        {
            System.out.print("Incorrect User name entered");
        }
    }
}
