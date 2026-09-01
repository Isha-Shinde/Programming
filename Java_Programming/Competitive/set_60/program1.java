/*
   Write a program to check wheather a given string is a palindrome.

   Description: A string is called a palindrome if it reads the same forward and backword.

   Input: One String str

   Output: Palindrome String or Not Palindrome String

   Example: Input: madam
            Output: Palindrome String
*/

import java.util.*;
class Program1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";
        int iStart = 0;
        int iEnd = 0;
        boolean bFlag = true;

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        iEnd = str.length() - 1;

        while(iStart < iEnd)
        {
            if(str.charAt(iStart) != str.charAt(iEnd))
            {
                bFlag = false;
                break;
            }

            iStart++;
            iEnd--;
        }

        if(bFlag == true)
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome String");
        }
    }
}