/*
    write a java program to accept file name from user and open that file.
*/

import java.io.*;
import java.util.*;
class Program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName;
        FileInputStream fobj = null;

        System.out.println("Enter the file name : ");
        FileName = sobj.nextLine();

        try
        {
            fobj = new FileInputStream(FileName);

            System.out.println("File opened successfully.");

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
