/*
   Write a program to check whether a given number is Trimorphic Number or not.
   
   Description:
   A number is Trimorphic if its cube ends with the number itself. I
   
   Input:
   One integer num
   
   Output:
   Trimorphic Number or Not Trimorphic Number
   
   Example:
   Input: 4
   Explanation: 43-64→ends with 4
   Output: Trimorphic Number
*/


import java.util.*;
class Program6
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iCount = 0;
        int iTemp = 0;
        int iCube =  0;

        System.out.println("Enter Number : ");
        iNo  = sobj.nextInt();
         
        iTemp = iNo;

       iCube = iNo * iNo * iNo;

        while(iNo != 0)
        {
            if(iNo % 10 !=iCube % 10)
            {
                break;
            }
            iNo = iNo / 10;
           iCube =iCube / 10;
        }

        if(iNo == 0)
        {
            System.out.println("It is Trimorphic number");
        }
        else
        {
            System.out.println("It is not Trimorphic number");
        }
    }
}