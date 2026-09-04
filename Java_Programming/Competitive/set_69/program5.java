/*
   An e-commerce application records product IDs:

   101 102 101 103 101 102 104 105 102 102 103

   Find the top 2 most frequently purchased products.

   Expected:
          102 -> 4
          101 -> 3
*/
import java.util.*;
class Program5
{
    public static void main(String A[]) 
     {
        Integer Arr[] = {101, 102, 101, 103, 101, 102, 104, 105, 102, 102, 103};

        HashMap <Integer,Integer> frequency = new HashMap<Integer,Integer>();

        for(int id : Arr)
        {
            frequency.put(id,(frequency.getOrDefault(id,0) + 1));
        }

        int Max1= 0;
        int mostFrequenpurchased1 = 0;
        
        int Max2= 0;
        int mostFrequenpurchased2 = 0;

        for(Map.Entry<Integer,Integer> eobj : frequency.entrySet())
        {
            if(eobj.getValue() > Max1)
            {
               Max1 = eobj.getValue();
               mostFrequenpurchased1 = eobj.getKey();
            }
            else if(eobj.getValue() > Max2)
            {
               Max2 = eobj.getValue();
               mostFrequenpurchased2 = eobj.getKey();
            }
        }
        System.out.println(mostFrequenpurchased1+" -> "+Max1);
        System.out.println(mostFrequenpurchased2+" -> "+Max2);
     }
}