/*
    Base fare depends on distance slabs. Add charges for class (Sleeper/3AC/2AC). 
    If booking within 24 hours, add Tatkal 30%. Senior citizen gets 40% discount.
    
    Input : 
          distance, class Type, booking Hours Before, age

    Expected output :   finalFare + reason breakdown

*/

import java.util.*;
class Program2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int Distance = 0;
        String ClassType = null;
        int BookingHr = 0;
        int Age = 0;

        double Fare = 0.0;
        double ClassCharge = 0.0;
        double BaseFare = 0.0;
        double TatkalCharge = 0.0;
        double SeniorDiscount = 0.0;
        double FinalFare = 0.0;

        System.out.println("Enter Distance : ");
        Distance = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Enter ClassType (Sleeper/3AC/2AC) : ");
        ClassType = sobj.nextLine();
        
        System.out.println("Enter Booking Hour : ");
        BookingHr = sobj.nextInt();

        System.out.println("Enter Age : ");
        Age = sobj.nextInt();

        if(Distance <= 0 || BookingHr < 0 || Age < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Distance <= 100)
        {
            Fare = 100;
        }
        else if(Distance <= 500)
        {
            Fare = 300;
        }
        else
        {
            Fare = 500;
        }

        if(ClassType.equals("Sleeper"))
        {
            ClassCharge = 0;
        }
        else if(ClassType.equals("3AC"))
        {
            ClassCharge = 400;
        }
        else if(ClassType.equals("2AC"))
        {
            ClassCharge = 700;
        }
        else
        {
            System.out.println("Invalid class");
            return;
        }

        BaseFare = Fare + ClassCharge;

        if(BookingHr <= 24)
        {
            TatkalCharge = BaseFare * 0.30;
        }

        if(Age >= 60)
        {
            SeniorDiscount = BaseFare * 0.40;
        }

        FinalFare = BaseFare + TatkalCharge - SeniorDiscount;

        System.out.println("Base Fare : Rs." + BaseFare);
        System.out.println("Class Charge : Rs." + ClassCharge);
        System.out.println("Tatkal Charge : Rs." + TatkalCharge);
        System.out.println("Senior Citizen Discount : Rs." + SeniorDiscount);
        System.out.println("Final Fare : Rs." + FinalFare);
        
    }
}