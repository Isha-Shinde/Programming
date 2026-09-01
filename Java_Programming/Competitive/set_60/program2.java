/*
   Write a program to check wheather two strings are Anagrams.

   Description: Two strings are anagrams if they contain the same characters with the same frequency,regardless of order.

   Input: First string str1
          Second string str2

   Output: Anagram String or Not Anagram

   Example: Input: listen silent
            Output: Anagram
*/

import java.util.*;
class Program2s
{
    public static boolean CheckAnagram(String str1, String str2)
    {
        int i = 0;

        if(str1.length() != str2.length())
        {
            return false;
        }
        
        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        Arrays.sort(Arr);
        Arrays.sort(Brr);
    
        str1 = new String(Arr);
        str2 = new String(Brr);
        
        return (str1.equals(str2));
    }

    public static void main(String A[])
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter second string : ");
        String str2 = sobj.nextLine();
        
        boolean bRet = false;

        bRet = CheckAnagram(str1, str2);

        if(bRet == true)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }
    }
}