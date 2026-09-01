/*
    A hotel charges 3000 per day. For long stays, hotel provides discount to retain customers.
    
    Rules: 3000/day
           If stay 7 days 5% discount on total bill
    
    Input: Number of days stayed

    Validations:
                Days must be >= 0

    Expected Output:
                    Total Stay Duration: <days> days
                    Final Bill Amount: Rs.<amount>
*/

import java.util.*;
class Program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Days = 0;
        double TotalBill = 0.0;
        double Discount = 0.0;
        double FinalBill = 0.0;

        System.out.println("Enter number of days : ");
        Days = sobj.nextInt();

        if(Days < 0)
        {
            System.out.println("Days cannot be negative");
            return;
        }

        TotalBill = Days * 3000;

        if(Days >= 7)
        {
            Discount = TotalBill * 0.05;
        }

        FinalBill = TotalBill - Discount;

        System.out.println("Total Stay Duration : " + Days + " days");
        System.out.println("Final Bill Amount : Rs." + FinalBill);
    }

}