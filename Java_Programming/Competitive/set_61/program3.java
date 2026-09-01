/*
   Write a program to remove duplicate characters from a string.

   Description: Remove repeated characters while keeping first occurance.

   Input Format : one string

   Output Format : string without duplicate characters

   Example: Input: banana
            Output: ban
*/

import java.util.*;

class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str = "";
        String Result = "";

        System.out.println("Enter string : ");
        Str = sobj.nextLine();

        for(int i = 0; i < Str.length(); i++)
        {
            boolean bFlag = false;

            for(int j = 0; j < Result.length(); j++)
            {
                if(Str.charAt(i) == Result.charAt(j))
                {
                    bFlag = true;
                    break;
                }
            }

            if(bFlag == false)
            {
                Result = Result + Str.charAt(i);
            }
        }

        System.out.println("String without duplicate characters : " + Result);
    }
}
