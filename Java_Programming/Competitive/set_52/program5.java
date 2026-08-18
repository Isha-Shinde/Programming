/*
    An e-commerse platform wants to compute final payable amount at checkout.

    Discounts are based on purchaced amount, and premium members receive an extra discount after the main discount.

    Discount Rules :
                   Amount > 5000 -> 20% discount
                   Amount > 2000 -> 10% discount
                   Otherwise -> no discount
                   Premium members -> extra 5% discount on the discounted amount

    Input : Purchase amount(integer)
            Membership type : Premium/Regular

    Validation : Amount must be > 0
                 Membership must be valid

    Expected output : Original Amount : RS<amount>
                      Total Discount : RS<discount>
                      Final Payable Amount : Rs<finalAmount>
*/

import java.util.*;
class Program5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int PurchaseAmt = 0;
        String MembershipType = null;
        double Discount = 0.0;
        double DiscountedAmt = 0.0;
        double ExtraDiscount = 0.0;
        double TotalDicount = 0.0;
        double FinalAmt = 0.0;


        System.out.println("Purchase Amount is :");
        PurchaseAmt = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Type of Membership is : ");
        MembershipType = sobj.nextLine();

        if(PurchaseAmt <= 0)
        {
            System.out.println("Invalid Amount");
            return;
        }

        if((!MembershipType.equals("Premium")) && (!MembershipType.equals("Regular")))
        {
            System.out.println("Membership type should be Premium or Regular");
            return;
        }

        if(PurchaseAmt > 5000)
        {
            Discount = PurchaseAmt * 0.20;
        }
        else if(PurchaseAmt > 2000)
        {
            Discount = PurchaseAmt * 0.10;
        }
        else
        {
            Discount = 0;
        }

        DiscountedAmt = PurchaseAmt - Discount;

        if(MembershipType.equals("Premium"))
        {
            ExtraDiscount = DiscountedAmt * 0.05;
        }

        TotalDicount = Discount + ExtraDiscount;
        FinalAmt = PurchaseAmt - TotalDicount;

        System.out.println("Total Amount : "+ " Rs."+PurchaseAmt);
        System.out.println("Total Discount : "+ " Rs."+TotalDicount);
        System.out.println("Total Payable Amount : "+ " Rs."+FinalAmt);        
        
    }
}