/*
   Write a program to reverse each word of a sentence.

   Description : Reverse individual words but keep word order same.

   Input Format : One sentence

   Output Format : Sentence with reversed words

   Example : 
   Input : java is powerful
   Output : avaj si lufrewop
*/

import java.util.*;

class Program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str = "";
        String Words[];
        String Rev = "";

        System.out.println("Enter sentence : ");
        Str = sobj.nextLine();

        Words = Str.split(" ");

        for(int i = 0; i < Words.length; i++)
        {
            Rev = "";

            for(int j = Words[i].length() - 1; j >= 0; j--)
            {
                Rev = Rev + Words[i].charAt(j);
            }

            System.out.print(Rev + " ");
        }
    }
}