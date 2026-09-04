/*
   A messaging application wants to identify the first character in a message thatoccurs only once.

   Input : programming

   Output : First non-repeating character : p

   The solution should preserve the original character order.
*/

import java.util.*;
class Program2
{
    public static void main(String A[]) 
    {
        String str = "programming";

        LinkedHashMap <Character,Integer> frequency = new LinkedHashMap<>();

        for(char ch : str.toCharArray())
        {
            frequency.put(ch,(frequency.getOrDefault(ch,0) + 1));
        }

        for(Map.Entry<Character,Integer> eobj : frequency.entrySet())
        {
            if(eobj.getValue() == 1)
            {
                System.out.println("First non-repeating character :" +eobj.getKey());
                break;
            }
        }
    }
}