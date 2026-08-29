/*
   Write a program to count frequency of each character.

   Description: Display each character along with its count.

   Input: One integer num

   Output: character -> count

   Example: Input: hello
            h -> 1
            e -> 1
            l -> 2
            o -> 1
*/  

import java.util.*;
class Program5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        HashMap <Character, Integer> hobj = new HashMap<Character, Integer>();

       System.out.println("Enter String : ");
       String str = sobj.nextLine();

       char Arr[] = str.toCharArray();
        int iCount = 0;

       for(char ch : Arr)
       {
            if(hobj.containsKey(ch))
            {
                iCount = hobj.get(ch);
                hobj.put(ch,iCount+1);
            }
            else
            {
                hobj.put(ch, 1);
            }
       }

       for(char cValue : hobj.keySet())
       {
            System.out.println(cValue+" -> "+hobj.get(cValue));
       }
    }
}