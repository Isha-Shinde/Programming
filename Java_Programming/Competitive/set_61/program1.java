/*
   Write a program which accept matrix from user and return addition of digonal elements.

   Input: 3  2  5  9
          4  3  2  2
          8  4  1  5
          3  9  7  5

   Output: 12

*/

import java.util.*;
class Program1
{
    public static int AddDiagonal(int Arr[][], int Row, int iCol)
    {
        int iSum = 0;

        for(int i = 0; i < Row; i++)
        {
            iSum = iSum + Arr[i][i];
        }

        return iSum;
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

        System.out.println("Enter matrix elements:");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        iRet = AddDiagonal(Arr, iRow, iCol);

        System.out.println("Addition of diagonal elements : " + iRet);
    }
}