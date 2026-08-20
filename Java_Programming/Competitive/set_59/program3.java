/*
    Write a program to check whether a given number is Spy Number or not.
    
    Description:
    A number is Spy if: (sum of digits) = (product of digits)
    
    Input:
    One integer num
    
    Output: Spy Number or Not Spy Number
    Example:
    Input: 1124 Sum=1+1+2+4=8 Product = 1*1*2*4=8
    Output: Spy Number
*/

import java.util.*;
class Program3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iSum = 0;
        int iMult = 1;
        int iDigit = 0;

        System.out.println("Enter Number : ");
        iNo  = sobj.nextInt();
         

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iMult = iMult * iDigit;
            iNo = iNo / 10;
        }

        if(iSum == iMult)
        {
            System.out.println("It is spy number");
        }
        else
        {
            System.out.println("It is not a spy number");
        }
    }
}