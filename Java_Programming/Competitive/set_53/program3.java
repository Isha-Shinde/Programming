/*
    A warehouse has a product in stock.Every time a customer places an order,the system must check if enough stock exists.

    If possible,fullfill it and update remaining stock. if stocks becomes very low,show alert.

    Rules:
          If requested quantity > available stock -> order fails
          Else deduct quantity
          If remaining stock < 5 -> print low stock alert

    Input : Current stock(integer)
            Requested quantity(integer)

    Validation : Stock cannot be negative
                 Requested quantity must be > 0

    Expected output : If successful :
                     order processed successfully
                     Remaining stock : <value>
                     If remaining < 5 also print : Low Stock Alert!
                     If failed : Order Failed : Insufficient Stock
                
*/

import java.util.*;
class Program3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int Stock = 0;
        int Quantity = 0;
        int RemainingStock = 0;

        System.out.println("Enter Current stock :");
        Stock = sobj.nextInt();

        System.out.println("Quantity  :");
        Quantity = sobj.nextInt();

        if(Stock < 0)
        {
            System.out.println("Stock cannot be negative");
            return;
        }

        if(Quantity <= 0)
        {
            System.out.println("Requested quantity must be > 0");
            return;
        }

        if(Quantity > Stock)
        {
            System.out.println("Order Failed : Insufficient Stock");
        }
        else
        {
            Stock = Stock - Quantity;
            System.out.println("Order Processed Successfully");
            System.out.println("Remaining Stock : "+Stock);

            if(Stock < 5)
            {
               System.out.println("Low Stock Alert!");
            }
        }
    }
}