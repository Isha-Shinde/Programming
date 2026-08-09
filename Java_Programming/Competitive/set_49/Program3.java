/*
    write java program to accept file name from user and 
    open that file in write mode and write some data at the end of file.
*/

import java.io.*;
import java.util.*;
class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        FileOutputStream fobj = null;

        String FileName;
        String Data;

        System.out.println("Enter the file name : ");
        FileName = sobj.nextLine();

        System.out.println("\nEnter the data : ");
        Data = sobj.nextLine();

        try
        {
            fobj = new FileOutputStream(FileName, true);

            fobj.write(Data.getBytes());

            fobj.close();

            System.out.println("Data appended successfully.");;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist.");
        }
        catch(IOException e)
        {
            System.out.println("Error while writing the file");
        }

        sobj.close();
    }
}

