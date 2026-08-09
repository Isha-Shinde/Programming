/*
    write java program to accept file name from user and
    check wheather that file is regular file or not.

*/

import java.io.*;
import java.util.*;

class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the file name : ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            if(fobj.isFile())
            {
                System.out.println("It is a regular file.");
            }
            else
            {
                System.out.println("It is not a regular file.");
            }
        }
        else
        {
            System.out.println("File does not exist.");
        }

        sobj.close();
    }
}
