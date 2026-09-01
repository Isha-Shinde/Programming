/*
   A hospital bill includes consultation + medicine + room charges per day. 
   If insured, insurance covers up to 50,000 or 70% of bill (whichever is lower). ICU ward costs extra.

    Input:  days, wardType(Normal/ICU), medicine Bill, consultationFee, insured(Yes/No)

    Validations:
                 all non-negative, wardType valid

    Expected Output:
                    totalBill, insurance Cover, finalPay

*/

import java.util.*;
class Program1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int Days = 0;
        String WardType = null;
        double MedicineBill = 0.0;
        double ConsultationFee = 0.0;
        String Insured = null;

        double RoomCharges = 0.0;
        double TotalBill = 0.0;
        double InsuranceCover = 0.0;
        double FinalPay = 0.0;

        System.out.println("Enter number of days : ");
        Days = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Enter Ward Type (Normal/ICU) : ");
        WardType = sobj.nextLine();

        System.out.println("Enter Medicine Bill : ");
        MedicineBill = sobj.nextDouble();

        System.out.println("Enter Consultation Fee : ");
        ConsultationFee = sobj.nextDouble();
        sobj.nextLine();

        System.out.println("Insured (Yes/No) : ");
        Insured = sobj.nextLine();

        // Validation
        if(Days < 0 || MedicineBill < 0 || ConsultationFee < 0)
        {
            System.out.println("Values cannot be negative");
            return;
        }

        if(!WardType.equals("Normal") && !WardType.equals("ICU"))
        {
            System.out.println("Invalid Ward Type");
            return;
        }

        if(!Insured.equals("Yes") && !Insured.equals("No"))
        {
            System.out.println("Insurance must be Yes or No");
            return;
        }

        // Room charges
        if(WardType.equals("Normal"))
        {
            RoomCharges = Days * 1000;
        }
        else
        {
            RoomCharges = Days * 2000;
        }

        // Total bill
        TotalBill = ConsultationFee + MedicineBill + RoomCharges;

        // Insurance
        if(Insured.equals("Yes"))
        {
            double SeventyPercent = TotalBill * 0.70;

            if(SeventyPercent < 50000)
            {
                InsuranceCover = SeventyPercent;
            }
            else
            {
                InsuranceCover = 50000;
            }
        }

        // Final amount
        FinalPay = TotalBill - InsuranceCover;

        System.out.println("Total Bill : Rs." + TotalBill);
        System.out.println("Insurance Cover : Rs." + InsuranceCover);
        System.out.println("Final Pay : Rs." + FinalPay);
    }
}