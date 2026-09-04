/*
   Given : java python java c java python cpp

   Generate : java -> 3
              python -> 2
              c -> 1
              cpp -> 1

    Then finding the most frequently occuring word.

    Expected :  Most frequent word : java
                frequency 3
*/

import java.util.*;
class Program4
{
    public static void main(String A[]) 
    {
        String Arr[] = {"java" ,"python", "java", "c", "java", "python", "cpp"};

        HashMap <String,Integer> frequency = new HashMap<>();

        for(String str : Arr)
        {
            frequency.put(str,(frequency.getOrDefault(str,0) + 1));
        }

        int Max = 0;
        String mostFrequentWord = "";
        for(Map.Entry<String,Integer> eobj : frequency.entrySet())
        {
            if(eobj.getValue() > Max)
            {
               Max = eobj.getValue();
               mostFrequentWord = eobj.getKey();
            }
        }
        System.out.println("Most frequent word : " + mostFrequentWord);
        System.out.println("Frequency : " + Max);
    }
}