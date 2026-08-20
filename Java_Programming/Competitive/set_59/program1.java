/*
   Write a program to check whether a given number is Neon Number or not.
   
   Description:
   A number is Neon if the sum of digits of its square equals the number.
   
   Input:
   One integer num
   
   Output:
   Neon Number or Not Neon Number
   
   Example:
   Input: 9
   Explanation: 92=81, sum digits = 8+1=9
   Output: Neon Number

*/


import java.util.*;
class Program1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iTemp = 0;
        int iDigit = 0;
        int iSquare = 0;
        int iSum = 0 ;

        System.out.println("Enter Number : ");
        iNo  = sobj.nextInt();

        iSquare = iNo * iNo;

        iTemp = iNo;
        
        while(iSquare != 0)
        {
           iDigit = iSquare % 10;
           iSum = iSum + iDigit;
           iSquare = iSquare /10;
        }

        if(iSum == iTemp)
        {
            System.out.println("It is Neon number");
        }
        else
        {
            System.out.println("It is not a Neon number");
        }
        
    }
}