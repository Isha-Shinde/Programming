/*
    Write a program which accept matrix from user and  one number from user and return frequency of that number.

   Input: 3  2  5  9
          4  3  2  2
          8  4  1  9
          3  9  7  5

    Number : 9

   Output: 3

*/

import java.util.*;

class Program2
{
    public static int AddDiagonal(int Arr[][], int iRow, int iCol, int iNo)
    {
        int iCount = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
        }

        return iCount;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 , iCol = 0;
        int i = 0, j = 0, iRet = 0;

        System.out.println("Enter number of rows :");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns :");
        iCol = sobj.nextInt();
        
        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter matrix elements :");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Enter number :");
        int iNo = sobj.nextInt();

        iRet = AddDiagonal(Arr, iRow, iCol, iNo);

        System.out.println("Frequency is : " + iRet);
    }
}