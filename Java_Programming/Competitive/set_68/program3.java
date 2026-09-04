/*
   An e-commerce warehouse maintains : 

   Implement operations :
                        ADD 101 50
                        ADD 102 30
                        SELL 101 5
                        RESTOCK 102 20
                        SEARCH 101

   Expected result : Product 101 available quantity : 45

   If a product doesn't exist, display an appropriate message.
*/

import java.util.*;
class Program3
{
    public static void main(String A[]) 
    {

        HashMap <Integer,Integer> hobj = new HashMap<>();

        hobj.put(101, 50);
        hobj.put(102, 30);

        if(hobj.containsKey(101))
        {
            hobj.put(101,(hobj.get(101)- 5 ));
        }

        if(hobj.containsKey(102))
        {
            hobj.put(102,(hobj.get(102) + 20));
        }

        int productid = 101;

        if(hobj.containsKey(productid))
        {
            System.out.println("Product "+productid+" available quantity : "+hobj.get(productid));
        }
        else
        {
            System.out.println("Product not found");
        }

    }
}