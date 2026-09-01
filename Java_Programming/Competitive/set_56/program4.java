/*
    A telecom company bills calls based on duration slabs. 
    The system needs to calculate final charge for a given call duration.
   
    Rules : First 5 minutes free
            Next 10 minutes (6-15) -> Rs.1 per minute
            Beyond 15 -> Rs. 2 per minute 

    Input:
           Call duration in minutes (integer)

    Validation : Minutes must be >= 0

    Expected output : 
                     Call Duration: <minutes> minutes
                     Total Call Charge: Rs.<amount>
*/

import java.util.*;
class Program4
{
    public static void main(String A[]) 
    {
          Scanner sobj = new Scanner(System.in);

        int Minutes = 0;
        int Charge = 0;

        System.out.println("Enter call duration : ");
        Minutes = sobj.nextInt();

        // Input validation
        if(Minutes < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        // First 5 minutes are free
        if(Minutes <= 5)
        {
            Charge = 0;
        }
        // Minutes 6 to 15
        else if(Minutes <= 15)
        {
            Charge = (Minutes - 5) * 1;
        }
        // Beyond 15 minutes
        else
        {
            Charge = (10 * 1) + ((Minutes - 15) * 2);
        }

        System.out.println("Call Duration: " + Minutes + " minutes");
        System.out.println("Total Call Charge: Rs." + Charge);
   }
}