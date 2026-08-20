/*
    Write a program to check whether a given number is Automorphic Number or not.
    
    Description:
    A number is Automorphic if its square ends with the same digits as the number.
    
    Input:
    One integer num
    
    Output:
    Automorphic Number or Not Automorphic Number
    
    Example:
    Input: 25
    Explanation: 25^2 = 625 -> ends with 25
    Output: Automorphic Number
*/

import java.util.*;
class Program2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iTemp = 0;
        int iDigit = 0;
        int iSquare = 0;

        System.out.println("Enter Number : ");
        iNo  = sobj.nextInt();

        iTemp = iNo;

        iSquare = iNo * iNo;

        while(iNo != 0)
        {
            if(iNo % 10 != iSquare % 10)
            {
                break;
            }
            iNo = iNo / 10;
            iSquare = iSquare / 10;
        }

        if(iNo == 0)
        {
            System.out.println("It is automorphic number");
        }
        else
        {
            System.out.println("It is not automorphic number");
        }
    }
}