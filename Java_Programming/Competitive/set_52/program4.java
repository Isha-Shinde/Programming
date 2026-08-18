/*
    An electricity company bills customers monthly based on how many units they consumed.
    The billing is progressive,meaning units are charged in slabs.
    The company wants a program to calculate bill accurately for any consumption.

    Slabs:
        First 100 units -> RS.5 per unit
        Next 100 units(101,200) -> RS.7 per unit
        Above 200 units -> RS.10 per unit

    Input : one integer : units consumed

    Validation : Units cannot be negative

    Expected output : Total Units Consumed : <units>
                      Total Electricity Bill : RS<amount>
*/

import java.util.*;
class Program2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int units = 0;
        int bill = 0;

        System.out.println("Enter the units : ");
        units = sobj.nextInt();

        if(units < 0)
        {
            System.out.println("Units cannot be negative");
            return;
        }

        if(units <= 100)
        {
            bill = units * 5;
        }
        else if(units <= 200)
        {
            bill = (units * 5) + ((units - 100 )* 7);
        }
        else
        {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        System.out.println("Total units consumed : "+units);
        System.out.println("Total electricity Bill : "+bill);
    }
}