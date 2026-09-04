/*
   Find two Transaction Matching a Target

   A customer made tarnsactions : 1200 500 700 300 1500

   Find wheather two transactions have a combined value of : 2000

   output : 500 + 1500 = 2000
*/

import java.util.*;
class Program1
{
    public static void main(String A[]) 
    {

      int Transactions[] = {1200, 500, 700, 300, 1500};
      int target = 2000;

      HashSet <Integer> set = new HashSet<>();

      int required = 0;
      for(int id : Transactions)
      {
         required = target - id;

         if(set.contains(required))
         {
            System.out.println(required +" + "+ id +" = "+ target);
            break;
         }
         else
         {
            set.add(id);
         }
         
      }
    }
}