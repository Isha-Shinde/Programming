/*
    A bank wants to quickly decide wheather a customer is eligible for a personal loan.

    The system checks the applicants details and either approves the loan or rejects with the exact reason.
   
    Eligibility Conitions :
                           Age 21 to 60 inclusive
                           Monthly income >= Rs.25000
                           Credit score >= 700
                           Must NOT have an existing unpaid loan

    Input : 
        Age
        Monthly income
        Credit score
        Existing unpaid load(Yes/No)

    Validation : Age/income/score must be non-negative
                 Yes/No must be valid

    Expected output : Loan Approved
                      Or
                      Loan Rejected : <specific Reason>
*/

import java.util.*;
class Program2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int Age = 0;
        int MonthlyIncome = 0;
        int CreditScore = 0;
        String ExistingUL = null;

        System.out.println("Enter your age :");
        Age = sobj.nextInt();

        System.out.println("Enter your Monthly Income :");
        MonthlyIncome = sobj.nextInt();
        
        System.out.println("Enter your Credit Score :");
        CreditScore = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Existing unpaid loan? (Yes/No) : ");
        ExistingUL = sobj.nextLine();

        if(Age < 0 || MonthlyIncome < 0 || CreditScore < 0)
        {
            System.out.println("Age/income/score must be non-negative");
            return;
        }

        if(!ExistingUL.equals("Yes") && !ExistingUL.equals("No"))
        {
            System.out.println("Yes/No must be valid");
            return;
        }

        
        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected : Age is Invalid for Loan");
        }
        else if(MonthlyIncome < 25000)
        {
            System.out.println("Loan Rejected : Monthly income must be at least Rs.25000");
        }
        else if(CreditScore < 700)
        {
            System.out.println("Loan Rejected : Credit score must be at least 700.");
        }
        else if(ExistingUL.equals("Yes"))
        {
            System.out.println("Loan Rejected : Your existing loan is overdue.");
        }
        else
        {
            System.out.println("Loan Approved");
        }
    }
}