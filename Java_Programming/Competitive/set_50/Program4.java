/*
    write a java program to accept file name from user calculate checksum of that file 
    and display on screen.
*/

import java.io.*;
import java.util.*;

class Program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the file name : ");
        String FileName = sobj.nextLine();

        int iRet = 0;
        int CheckSum = 0;

        try
        {
            FileInputStream fobj = new FileInputStream(FileName);

            while((iRet = fobj.read()) != -1)
            {
                CheckSum = CheckSum + iRet;
            }

            fobj.close();

            System.out.println("Checksum of file is : " + CheckSum);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist.");
        }
        catch(IOException e)
        {
            System.out.println("Error while reading file.");
        }

        sobj.close();
    }
}