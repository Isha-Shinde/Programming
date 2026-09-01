/*
    Water Bill with Progressive Slabs + Late Fee

    Slabs + fixed meter charge. If paid after due date, add 2% penalty per week late (max 10%).

    Input : units, weeksLate

    Expected output : billAmount
*/

import java.util.*;
class Program4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int units = 0;
        int  weekslate = 0;

        int UnitBill = 0;
        int Bill = 0;
        int penalty = 0;
        int finalBill = 0;

        System.out.println("Enter units:");
        units = sobj.nextInt();

        System.out.println("Enter weekslate : ");
        weekslate = sobj.nextInt();

        if(units <= 100)
        {
            UnitBill = units * 5;
        }
        else if(units <= 200)
        {
            UnitBill = ((100 * 5) + ((units - 100) * 7));
        }
        else
        {
            UnitBill = ((100 * 5) + (100 * 7) + ((units - 200) * 10));
        }

        Bill = UnitBill + 50;

        if(weekslate > 0)
        {
            penalty = weekslate * 2;
        }

        if(penalty > 10)
        {
            penalty = 10;
        }

        penalty = Bill * penalty/100;
        finalBill = Bill + penalty;

        System.out.println("Billamount : Rs."+finalBill);
    }
}