/*
    Write a program which accept matrix from user and return largest number from both the diagonals.

   Input: 3  2  5  9
          4  3  2  2
          8  4  1  9
          3  9  7  5

   Output: 9

*/

import java.util.*;

class Program3
{
    public static int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int iMax = Arr[0][0];

        for(int i = 0; i < iRow; i++)
        {
            // Left to Right diagonal
            if(Arr[i][i] > iMax)
            {
                iMax = Arr[i][i];
            }

            // Right to Left diagonal
            if(Arr[i][iCol - i - 1] > iMax)
            {
                iMax = Arr[i][iCol - i - 1];
            }
        }

        return iMax;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;
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

        iRet = MaxDiagonal(Arr, iRow, iCol);

        System.out.println("Largest number from both diagonals : " + iRet);
    }
}