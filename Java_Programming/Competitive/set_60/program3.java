/*
   Write a program to check wheather a string is panagram.

   Description: A string is panagram if all alphabets from 'a' to 'z' at least once.

   Input: one sentence str

   Output: Panagram String or Not Panagram

   Example: Input: ccc
            Output: Panagram
*/

import java.util.*;
class Program3
{
    public static boolean CheckPangram(String str)
    {
        boolean Arr[] = new boolean[26];

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                Arr[ch - 'a'] = true;
            }
        }

        for(int i = 0; i < 26; i++)
        {
            if(Arr[i] == false)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter string : ");
        str = sobj.nextLine();

       boolean bRet = CheckPangram(str);

        if(bRet == true)
        {
            System.out.println("Pangram String");
        }
        else
        {
            System.out.println("Not Pangram String");
        }

    }
}