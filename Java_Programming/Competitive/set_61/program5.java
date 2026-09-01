/*
   Write a program to check wheather one string is rotation of another.

   Description: String B is rotation of String A if it can be obtained by shifting characters.

   Input Format : string1
                  string2

   Output Format : Rotation
                      OR
                   Not Rotation

   Example: 
   Input: abcd
          cdab

   Output : Rotation
                  
*/  

import java.util.*;

class Program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str1 = "";
        String Str2 = "";

        System.out.println("Enter first string : ");
        Str1 = sobj.nextLine();

        System.out.println("Enter second string : ");
        Str2 = sobj.nextLine();

        if(Str1.length() != Str2.length())
        {
            System.out.println("Not Rotation");
            return;
        }

        String Temp = Str1 + Str1;

        if(Temp.contains(Str2))
        {
            System.out.println("Rotation");
        }
        else
        {
            System.out.println("Not Rotation");
        }
    }
}
