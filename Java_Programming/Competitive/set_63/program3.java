/*
    Write a program which accept matrix and reverse the contents of each column.

   Input: 3  2  5  9
          4  3  2  2
          8  4  1  9
          3  9  7  5

   Output: 3  9  7  5
           8  4  1  9
           4  3  2  2
           3  2  5  9

*/

import java.util.*;

class Program3
{
    public static void ReverseCol(int Arr[][], int iRow, int iCol)
    {
        int temp = 0;

        for(int j = 0; j < iCol; j++)
        {
            int start = 0;
            int end = iRow - 1;

            while(start < end)
            {
                temp = Arr[start][j];
                Arr[start][j] = Arr[end][j];
                Arr[end][j] = temp;

                start++;
                end--;
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

        ReverseCol(Arr, iRow, iCol);

        System.out.println("Matrix after reversing each column :");

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