/*
    A Shopping mall parking gate records entry and exit duration in hours.

    The parking system calculates charges based on the total hours a vehicle stayed.
    Long-duration parking attracts additional penalty.

    Rules:
         First 2 hours -> Rs.20(flat)
         After 2 hours -> Rs.10 per extra hour
         if total hours > 10 -> add Rs.50 penalty
         
    Input : Total parking hours(integer)

    Validation : Hours cannot be negative

    Expected output : Total Parking Duration : <hours> hours
                      Total Parking Fee : Rs<amount>
*/

import java.util.*;
class Program1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int ParkingHours = 0;
        int Amount = 0;

        System.out.println("Enter Total Parking Hours : ");
        ParkingHours = sobj.nextInt();

        if(ParkingHours < 0)
        {
            System.out.println("Hours cannot be negative");
            return;
        }

        if(ParkingHours <= 2)
        {
            Amount = 20;
        }
        else if(ParkingHours <= 10)
        {
            Amount = (20 + (ParkingHours - 2) * 10);
        }
        else
        {
            Amount = (20 + ((ParkingHours - 2) * 10 ) + 50);
        }

        System.out.println("Total Parking Duration : "+ParkingHours);
        System.out.println("Total Parking Fee : "+Amount);

    }

}