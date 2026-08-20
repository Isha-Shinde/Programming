/*
   Write a program to check whether a given number is Disarium Number or not.
   
   Description:
   A number is Disarium if Sum of digits raised to their position (starting from 1) equals the number.
   
   Input:
   One integer num
   
   Output:
   Disarium Number or Not Disarium Number
   
   Example:
   Input: 135
   Explanation: 1+3+531+9+ 125 135
   Output Disarium Number
*/

import java.util.*;
class Program5
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
           iCount--;
           iNo = iNo /10;
        }

        if(iSum == iTemp)
        {
            System.out.println("It is Sunny number");
        }
        else
        {
            System.out.println("It is not Sunny number");
        }
    }
}