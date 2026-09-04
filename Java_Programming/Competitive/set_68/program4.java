/*
   A banking application receives transaction IDs : 

   TX101
   TX102
   TX103
   TX101
   TX104
   TX102

   identify duplicate transaction IDs..

   Expected output : Duplicate transactions : 
                     TX101
                     TX102
*/

import java.util.*;
class Program4
{
    public static void main(String A[]) 
    {

        String Transactions[] = {"TX101","TX102","TX103","TX101","TX104","TX102"};

        HashSet <String> unique = new HashSet<>();
        HashSet <String> duplicate = new HashSet<>();

        for(String str : Transactions)
        {
            if(!unique.add(str))
            {
                duplicate.add(str);
            }
        }

        System.out.println("Duplicate Transactions : ");
        for(String str : duplicate)
        {
            System.out.println(str);
        }

    }
}