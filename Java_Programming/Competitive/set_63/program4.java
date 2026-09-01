/*
    Write a program which accept matrix from user and check whether the matrix is identity matrix or not.

    Identity matrix is a square matrix with 1's aong the diagonal from upper left to lower right and 0's in all other positions.
    If it satisfies the structure as explained before then the matrix is called as identity matrix.

   Input: 1  0  0  0
          0  1  0  0
          0  0  1  0 
          0  0  0  1

   Output: true

*/

import java.util.*;

class Program4
{
     public static boolean ChkIdentity(int Arr[][], int iRow, int iCol)
    {
        if(iRow != iCol)
        {
            return false;
        }

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    if(Arr[i][j] != 1)
                    {
                        return false;
                    }
                }
                else
                {
                    if(Arr[i][j] != 0)
                    {
                        return false;
                    }
                }
            }
        }

        return true;
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

        boolean bRet = ChkIdentity(Arr, iRow, iCol);

        System.out.println("Identity Matrix : " + bRet);
    }
}