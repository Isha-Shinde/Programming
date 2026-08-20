/*
    Write a program to check whether a given number is an Armstrong Number or not.

    Description: 
                A number is Armstrong if:
                (sum of each digit raised to power of total digits) = number

    Input: One integer num

    Output:
            Armstrong Number or Not Armstrong Number
   
    Example:
    Input: 153
    Explanation: 1^3 + 5^3 + 3^3 = 153
    Output: Armstrong Number
*/

import java.util.*;
class Program1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iCount = 0;
        int iTemp = 0;

        System.out.println("Enter Number : ");
        iNo  = sobj.nextInt();
         
        iTemp = iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
           iDigit = iNo % 10;
           iSum = iSum + (int)Math.pow(iDigit,iCount);
           iNo = iNo /10;
        }

        if(iSum == iTemp)
        {
            System.out.println("It is armstrong number");
        }
        else
        {
            System.out.println("It is not armstrong number");
        }
    }
}