/*
    Write a program to check whether a given number is a Harshad Number or not.

    Description: A number is Harshad if it is divisible by the sum of its digits.

    Input: One integer num

    Output: Harshad Number or Not Harshad Number

    Example:
    Input: 18
    Explanation: sum digits = 1 + 8 = 9, 18 % 9 = 0
    Output: Harshad Number
*/

import java.util.*;
class Program4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iTemp = 0;
        int iDigit = 0;
        int iSum = 0;

        System.out.println("Enter Number : ");
        iNo  = sobj.nextInt();
         
        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        if(iTemp % iSum == 0)
        {
            System.out.println("It is perfect number");
        }
        else
        {
            System.out.println("It is not perfect number");
        }
    }
}