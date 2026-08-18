/*
    A traffic police app records wheather a rider violated rules.Each violation has a fixed fine.
    If multiple violations happen,fines should be added.

    Fines:
        No helmet -> Rs.500
        No licence -> Rs.1000
        Overspeeding -> Rs.1500

    Input :  Helmet worn(Yes/No)
             License available(Yes/No)
             Overspeeding(Yes/No)     

    Validation : Inputs must be Yes/No only

    Expected output : Total Fine Amount : Rs<amount>
*/

import java.util.*;
class Program4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String HelmetWorn = null;
        String LicenseAvail = null;
        String Overspeeding = null;
        int FineAmt = 0;

        System.out.println("is Helmateworn? :");
        HelmetWorn = sobj.nextLine();

        System.out.println("Is License Available ? : ");
        LicenseAvail = sobj.nextLine();
        
        System.out.println("Is Overspeeding ? : ");
        Overspeeding = sobj.nextLine();

        if(
            (!HelmetWorn.equals("Yes") && !HelmetWorn.equals("No")) ||
            (!LicenseAvail.equals("Yes") && !LicenseAvail.equals("No")) ||
            (!Overspeeding.equals("Yes") && !Overspeeding.equals("No"))
          )
        {
            System.out.println("Yes/No must be valid");
            return;
        }

        if(HelmetWorn.equals("No"))
        {
            FineAmt = FineAmt + 500;
        }

        if(LicenseAvail.equals("No"))
        {
            FineAmt = FineAmt + 1000;
        }

        if(Overspeeding.equals("Yes"))
        {
            FineAmt = FineAmt + 1500;
        }

        System.out.println("Total Fine Amount : RS."+FineAmt); 
   }
}