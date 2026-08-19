/*
    A phone OS shows different battery warnings. The user wants a program that prints the correct battery status.

    Rules:
           Battery <= 5% -> Critical 
           Battery <= 15% -> Low 
           Otherwise -> Normal

    Input : Battery percentage (integer)

    Validation : 0 to 100 only

    Expected output : Battery Percentage: <value>%
                      Status: <Critical/Low/Normal>
*/

import java.util.*;
class Program5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int BatteryPer = 0;


        System.out.println("Enter Battery Percentage :");
        BatteryPer = sobj.nextInt();

        if(BatteryPer < 0 || BatteryPer > 100)
        {
            System.out.println("Invalid input");
            return;
        }

        if(BatteryPer <= 5)
        {
            System.out.println("Battery Percentage: " + BatteryPer + "%");
            System.out.println("Status : Critical");
        }
        else if(BatteryPer <= 15)
        {
            System.out.println("Battery Percentage: " + BatteryPer + "%");
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Battery Percentage: " + BatteryPer + "%");
            System.out.println("Status : Normal");
        }
    }
}