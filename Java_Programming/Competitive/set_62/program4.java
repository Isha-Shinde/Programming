/*
    Write a program which accept matrix from user and display addition of elements from each column.

   Input: 3  2  5  9
          4  3  2  2
          8  4  1  9
          3  9  7  5

   Output: 18 18 15 25

*/

import java.util.*;

class Program4
{
    public static void AddColumn(int Arr[][], int iRow, int iCol)
    {
        int iSum = 0;

        for(int j = 0; j < iCol; j++)
        {
            iSum = 0;

            for(int i = 0; i < iRow; i++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.print(iSum + " ");
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

        System.out.println("Addition of each column :");

        AddColumn(Arr, iRow, iCol);
    }
}