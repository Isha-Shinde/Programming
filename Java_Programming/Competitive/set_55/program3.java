/*
    User enters usage: calls(min), data(GB), SMS(count). App suggests the cheapest plan among 4 plans.    

    Input : 
          mins, gb, sms

    Expected output :  recommendedPlan, total Cost

    Twist: if usage exceeds plan limits, add per-unit extra

*/


import java.util.*;
class Program3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int mins = 0;
        int gb = 0;
        int sms = 0;

        double Basic = 0.0;
        double Standard = 0.0;
        double Premium = 0.0;
        double Pro = 0.0;

        double Cheapest = 0.0;
        String RecommendedPlan = null;


        System.out.println("Enter Calls(mins) :");
        mins = sobj.nextInt();

        System.out.println("Enter Data(gb) :");
        gb = sobj.nextInt();

        System.out.println("Enter SMS(count) :");
        sms = sobj.nextInt();

        Basic = 199;
        if(mins > 100)
        {
            Basic = Basic + (mins - 100)* 1;
        }

        if(gb > 2)
        {
            Basic = Basic + (gb - 2) * 50;
        }

        if(sms > 100)
        {
            Basic = Basic + (sms - 100) * 1;
        }

        Standard = 399;

        if(mins > 300)
        {
            Standard = Standard + (mins - 300) * 0.8;
        }

        if(gb > 5)
        {
            Standard = Standard + (gb - 5) * 40;
        }

        if(sms > 300)
        {
            Standard = Standard + (sms - 300) * 0.8;
        }

        Premium = 699;

        if(mins > 600)
        {
            Premium = Premium + (mins - 600) * 0.5;
        }

        if(gb > 10)
        {
            Premium = Premium + (gb - 10) * 30;
        }

        if(sms > 500)
        {
            Premium = Premium + (sms - 500) * 0.5;
        }

        Pro = 999;

        if(mins > 1000)
        {
            Pro = Pro + (mins - 1000) * 0.3;
        }

        if(gb > 20)
        {
            Pro = Pro + (gb - 20) * 20;
        }

        if(sms > 1000)
        {
            Pro = Pro + (sms - 1000) * 0.3;
        }

        Cheapest = Basic;
        RecommendedPlan = "Basic";

        if(Standard < Cheapest)
        {
            Cheapest = Standard;
            RecommendedPlan = "Standard";
        }

        if(Premium < Cheapest)
        {
            Cheapest = Premium;
            RecommendedPlan = "Premium";
        }

        if(Pro < Cheapest)
        {
            Cheapest = Pro;
            RecommendedPlan = "Pro";
        }


        System.out.println("Recommended Plan : " + RecommendedPlan);
        System.out.println("Total Cost : Rs." + Cheapest);

    }
}