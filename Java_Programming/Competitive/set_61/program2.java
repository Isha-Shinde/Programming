/*
   Write a program to find the longest word in a sentence.

   Description : Indentify the word having maximum length.

   Iutput Format : One Sentence

   Output Format : Longest word

   Example : Input : Marvellous Infosystems Pune
             Output : Infosystems

*/

import java.util.*;

class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str = "";
        String Words[];
        String Longest = "";

        System.out.println("Enter sentence : ");
        Str = sobj.nextLine();

        Words = Str.split(" ");

        for(int i = 0; i < Words.length; i++)
        {
            if(Words[i].length() > Longest.length())
            {
                Longest = Words[i];
            }
        }

        System.out.println("Longest word : " + Longest);
    }
}