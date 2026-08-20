/*
   Write a program to check whether a given number is a Strong Number or not.

    Description:
                A number is called Strong Number if the sum of factorials of each digit 
                is equal to the number itself.

    Input: One integer num
  
    Output: Print: Strong Number or Not Strong Number

    Example: Input: 145
            Explanation: 11 +41 + 511+ 24 + 120 = 145

    Output: Strong Number

*/

import java.util.*;
class Program1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int Num = 0;
        int iTemp = 0;
        int iDigit = 0;
        long iFact = 0;
        long iSum = 0;

        System.out.println("Enter Number : ");
        Num = sobj.nextInt();
 
        iTemp = Num;

        while(Num != 0)
        {
            iDigit = Num % 10;
             
            while(iDigit != 0)
            {
                iFact = iFact * iDigit;
                iDigit--;
            }
            iSum =  iSum + iFact;
            Num = Num / 10;

            iFact = 1;
        }

        if(iSum == iTemp)
        {
            System.out.println("It is strong number");
        }
        else
        {
            System.out.println("It is not a strong number");
        }
    }

}