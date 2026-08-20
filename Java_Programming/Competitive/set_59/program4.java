/*
    Write a program to check whether a given number is Sunny Number or not.
    
    Description:
    A number is Sunny if num 1 is a perfect square.
    
    Input:
    One integer num
    
    Output:
    Sunny Number or Not Sunny Number
    
    Example:
    Input: 8
    Explanation: 8+1=9,9 is perfect square
    Output: Sunny Number
*/


import java.util.*;
class Program4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRoot = 0;
        int iSquare = 0;

        System.out.println("Enter Number : ");
        iNo  = sobj.nextInt();
         
        iSquare = iNo + 1;
        iRoot = (int)Math.sqrt(iSquare);

        if(iRoot * iRoot == iSquare)
        {
            System.out.println("It is Sunny Number");
        }
        else
        {
            System.out.println("It is not a Sunny Number");
        }

    }
}