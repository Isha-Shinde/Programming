/*
   Write a program to check whether a given number is Palindrome or not.

   Description: A number is Palindrome if it remains the same when reversed.

   Input: One integer num

   Output: Palindrome Number or Not. Palindrome Number

   Example: Input: 121
            Reverse: 121
            Output: Palindrome Number
*/

import java.util.*;
class Program5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iTemp = 0;
        int iDigit = 0;
        int iRev = 0;

        System.out.println("Enter Number : ");
        iNo  = sobj.nextInt();
         
        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }

        if(iTemp == iRev)
        {
            System.out.println("It is palindrome number");
        }
        else
        {
            System.out.println("It is not palindrome number");
        }
    }
}