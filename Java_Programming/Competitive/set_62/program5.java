/*
    Write a program which accept matrix and swap the contents of consecutive rows.

   Input: 3  2  5  9
          4  3  2  2
          8  4  1  9
          3  9  7  5

   Output: 4  3  2  2
           3  2  5  9
           3  9  7  5
           8  5  1  9

*/

import java.util.*;

class Program5
{
    public static void SwapRows(int Arr[][], int iRow, int iCol)
    {
        int temp = 0;

        for(int i = 0; i < iRow - 1; i = i + 2)
        {
            for(int j = 0; j < iCol; j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i + 1][j];
                Arr[i + 1][j] = temp;
            }
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;
        int i = 0, j = 0;

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

        SwapRows(Arr, iRow, iCol);

        System.out.println("Matrix after swapping consecutive rows :");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}