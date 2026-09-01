/*
   Write a program to print duplicate character from a string.

   Description: Find and display characters that appear more than once.

   Input: One String str

   Output: Duplicate characters are print in one line.

   Example: Input: programming
            Output: rgm
*/

import java.util.*;
class Program4
{
    public static void main(String A[]) 
    {
        String str = "Programming";
        HashMap <Character,Integer> hobj = new HashMap <Character,Integer>();
        
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(hobj.containsKey(ch))
            {
                hobj.put(ch, hobj.get(ch) + 1);
            }
            else
            {
                hobj.put(ch, 1);
            }
        }
        System.out.print("Duplicate characters are : ");

        for(Character ch : hobj.keySet())
        {
            if(hobj.get(ch) > 1)
            {
                System.out.print(ch);
            }
        };

    }
}