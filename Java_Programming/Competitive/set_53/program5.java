/*
    A tax portal calculates income tax based on annual income using progressive slabs.
    Only the amount in a slab is taxed at that slab's rate.

    Slabs:
         Up to Rs.2,50,000 -> 0%
         Rs.2,50,001 to Rs.5,00,000 -> 5%
         Rs.5,00,001 to Rs.10,00,000 -> 20%
         Above Rs.10,00,000 -> 30%

    Input : Annual income(integer)

    Validation : Income cannot be negative

    Expected output : Annual Income : Rs.<income>
                      Total Tax Payable : Rs.<tax>
*/

import java.util.*;
class Program5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int AnnualIncome = 0;
        double Tax = 0.0;


        System.out.println("Curent balance is :");
        AnnualIncome = sobj.nextInt();

        if(AnnualIncome < 0)
        {
            System.out.println("Income Cannot be negative");
            return;
        }

        if(AnnualIncome <= 250000)
        {
            Tax = 0.0;
        }
        else if(AnnualIncome <= 500000)
        {
            Tax = ((AnnualIncome - 250000) * 0.05);
        }
        else if(AnnualIncome <= 1000000)
        {
            Tax = ((250000 * 0.05) + ((AnnualIncome - 500000) * 0.20));
        }    
        else
        {
            Tax = ((250000 * 0.05) + (500000 * 0.20) + ((AnnualIncome - 1000000) * 0.30));
        }

        System.out.println("Annual Income : Rs."+AnnualIncome);
        System.out.println("Total Tax Payable: Rs."+Tax);
    }
}