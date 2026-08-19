/*
   1. A ride-hailing app calculates trip fare based on distance and whether the trip happened during peak hours.

    Peak hours increase demand, so surcharge applies.

    Rules: Base fare 50
            First 10 km -> Rs.12 per km
            Beyond 10 km -> Rs.15 per km
            Peak hours -> 20% extra on total fare

    Input: Distance in km (integer)
           Peak hour (Yes/No)

    Validations:
                Distance cannot be negative

    Expected Output:
                    Distance: <km> km
                    Peak Hour: <Yes/No>
                    Total Fare: Rs<amount>

*/

import java.util.*;
class Program1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int Distance = 0;
        String PeakHr = null;
        double Fare = 0.0;
        double TotalFare = 0.0;

        System.out.println("Enter Distance : ");
        Distance = sobj.nextInt();
        sobj.nextLine();

        System.out.println("peak hour : ");
        PeakHr = sobj.nextLine();

        if(Distance < 0)
        {
            System.out.println("Distance canno be negative");
            return;
        }

        Fare = 50;

        if(Distance <= 10)
        {
            Fare = 50 + Distance * 12;
        }
        else
        {
            Fare = 50 + (10 * 12) + ((Distance - 10) * 15);
        }

        if(PeakHr.equals("Yes"))
        {
            TotalFare = Fare * 0.20;
            Fare = Fare + TotalFare;
        }

        System.out.println("Distance : "+Distance+".KM");
        System.out.println("Peak Hour : "+PeakHr);
        System.out.println("Total Fare : Rs."+Fare);
    }

}