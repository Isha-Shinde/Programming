/*
   Write a program to count vowels and consonants in a string.

   Description: Count total vowels(a,e,i,o,u) and consonants seprately.

   Input Format : one string

   Output Foramt : Vowels : <count>
                   Consonats : <count>

   Example: Input: education

            Output: Vowels : 5
                    Consonants : 4
*/

import java.util.*;

class Program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str = "";
        int Vowels = 0;
        int Consonants = 0;

        System.out.println("Enter string : ");
        Str = sobj.nextLine();

        for(int i = 0; i < Str.length(); i++)
        {
            char ch = Str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || 
               ch == 'o' || ch == 'u')
            {
                Vowels++;
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                Consonants++;
            }
        }

        System.out.println("Vowels : " + Vowels);
        System.out.println("Consonants : " + Consonants);
    }
}