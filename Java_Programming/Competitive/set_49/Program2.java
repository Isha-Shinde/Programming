/*
    write java program to accept file name from user and open that file and display the contents on screen.

*/

import java.io.*;
import java.util.*;
class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName;
        FileInputStream fobj = null;
        int iData;

        System.out.println("Enter the file name : ");
        FileName = sobj.nextLine();

        try
        {
            fobj = new FileInputStream(FileName);

            System.out.println("Contents of the file are :");

            while((iData = fobj.read()) != -1)
            {
                System.out.print((char)iData);
            }

            fobj.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist.");
        }
        catch(IOException e)
        {
            System.out.println("Error while closing the file");
        }

        sobj.close();
    }
}

