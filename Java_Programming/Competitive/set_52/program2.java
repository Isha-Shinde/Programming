/*
    A bank ATM must follow strict safety rules to avoud fraud and ensure customers maintain a minium balance.
    A customer inserts the card,checks their balance,and requests a withdrawwal.
    The ATM must either approve the request and update the balance or reject it and show the correct reason.

    Rules:
    Withdrawal amount must be a multiple of RS.100
    Maximum withdrawal per transaction is RS.25,000
    After withdrawal,balance must remain at least RS.1000

    Input : 
    line 1 : Current balance(integer)
    line 2 : requested withdrawal amount(integer)

    Validation : if balance < 0 or withdrawAmount <= 0 -> input invalid

    Expected output : if successfull : Transaction Successful
                                       Remaining Balande : RS<newBalance>
                      if Failed      : Transaction Failed : <Reason> 
*/

import java.util.*;
class Program2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int CurrentBal = 0;
        int WithdrawAmt = 0;

        System.out.println("Curent balance is :");
        CurrentBal = sobj.nextInt();

        System.out.println("Withdrawal Amount is :");
        WithdrawAmt = sobj.nextInt();

        if(CurrentBal < 0 || WithdrawAmt <= 0)
        {
            System.out.println("Input Invalid");
        }
        else if((WithdrawAmt % 100 == 0) && (WithdrawAmt <= 25000) && ((CurrentBal - WithdrawAmt) > 1000))
        {
            CurrentBal = CurrentBal - WithdrawAmt;

            System.out.println("Transaction Successful");
            System.out.println("Remaining balance is : RS."+CurrentBal);
        }
        else if(WithdrawAmt % 100 != 0)
        {
            System.out.println("Transaction failed because Withdrawal Amount is not multiple of RS.100");
        }   
        else if(WithdrawAmt > 25000)
        {
            System.out.println("Transaction failed because Maximum withdrawal per transaction is RS.25,000");
        }
        else if(CurrentBal - WithdrawAmt <= 1000)
        {
            System.out.println("Transaction failed because After withdrawal,balance must remain at least RS.1000");
        }
    }
}