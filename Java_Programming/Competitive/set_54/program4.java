/*
    A customer enters a store with a fixed budget. They pick items one by one in a given order.

    The cashier wants to know how many items can be purchased before money becomes insufficient.

    Input : Budget amount 
            Number of items N 
            N item prices    

    Validation : Budget >= 0 
                 N >= 0
                 Each price > 0

    Expected output : 
                      Items Purchased: <count> 
                      Remaining Balance: Rs.<amount>
*/

import java.util.*;
import javax.swing.ButtonGroup;
class Program4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int Budget = 0;
        int NoOfItems = 0;
        int Price = 0;
        int Count = 0;

        System.out.println("Enter Budget Amoun :");
        Budget = sobj.nextInt();

        System.out.println("Enter Number of Items : ");
        NoOfItems = sobj.nextInt();
        
        if(Budget  < 0 )
        {
            System.out.println("Invalid Input");
            return;
        }

        if(NoOfItems < 0 )
        {
            System.out.println("Invalid Input");
            return;
        }
        
        for(int i = 0; i < NoOfItems; i++)
        {
            System.out.println("Enter Price of Item : ");
            Price = sobj.nextInt();

            if(Price <= 0)
            {
                System.out.println("Invalid input");
                return;
            }

            if(Price <= Budget)
            {
                Budget = Budget - Price;
                Count++;
            }
            else
            {
                break;
            }
        } 
        System.out.println("Items Purchased: " + Count);
        System.out.println("Remaining Balance: Rs." + Budget);
   }
}