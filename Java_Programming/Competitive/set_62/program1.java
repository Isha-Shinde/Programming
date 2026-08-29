/*
   Write a program which accept matrix from user and display transpose of the matrix.
   The transpose of a givenn matrix is formed by interchanging the rows and columns of a matrix.

   Input: 3  2  5  9
          4  3  2  2
          8  4  1  5
          3  9  7  5

   Output: 3  4  8  3
           2  3  4  9
           5  2  1  7
           9  2  5  5

*/

import java.util.*;
class Program1
{
    public static void transpose(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iCol; i++)
        {
            for(int j = 0; j < iRow; j++)
            {
                System.out.print(Arr[j][i] + " ");
            }

            System.out.println();
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

        System.out.println("Enter matrix elements:");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Transpose of matrix :");

        transpose(Arr, iRow, iCol);
    }
}