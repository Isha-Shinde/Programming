/*
    A courier counter calculates delivery charge by weight. Charges increase when parcel is heavier.
    
    Charges :
              Up to 1 kg -> Rs.50 
              1-5 kg ->  Rs.50 + 20/kg above 1 kg 
              Above 5 kg -> Rs.150 + 30/kg above 5 kg

    Input : Parcel weight in kg (integer)

    Validation : Weight must be > 0

    Expected output : Parcel Weight: <weight> kg 
                      Courier Charge: Rs.<amount>
*/

import java.util.*;
class Program3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int ParcelWeight = 0;
        int amount = 0;

        System.out.println("Enter Parcel weight :");
        ParcelWeight = sobj.nextInt();

        if(ParcelWeight <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(ParcelWeight <= 1)
        {
            amount = 50;
        }
        else if(ParcelWeight > 1 && ParcelWeight <= 5)
        {
            amount = 50 + (ParcelWeight - 1) * 20;
        }
        else
        {
            amount = 150 + (ParcelWeight - 5) * 30;
        }

        System.out.println("Parcel Weight : "+ParcelWeight+".Kg");
        System.out.println("Courier Charge : "+amount+".Rs");

    }
}