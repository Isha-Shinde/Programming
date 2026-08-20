/*
    Write a program to check whether a given number is Perfect Number or not.

    Description:
    A number is Perfect if the sum of all proper divisors (excluding the number) is equal to the number.

    Input: One integer num

    Output: Perfect Number or Not Perfect Number

    Example: Input: 28 Explanation: divisors = 1,2,4,7,14 -> sum=28

    Output: Perfect Number
*/

import java.util.*;
class Program3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iTemp = 0;
        int i =0;
        int iSum = 0;

        System.out.println("Enter Number : ");
        iNo  = sobj.nextInt();
         
        iTemp = iNo;

        for(i = 1;i <= iNo/2;i++ )
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
        }

        if(iSum == iTemp)
        {
            System.out.println("It is perfect number");
        }
        else
        {
            System.out.println("It is not perfect number");
        }
    }
}