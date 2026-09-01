/*
   write a java program that accepts the names of a source file and destination file and
   copies all data from the source into destination.

   Example : Enter source file :
                     Demo.txt

             Enter destination file :
                     Demo.txt
                     file copied successfully

    Requirements : 
    Use :  FileInputStream
           FileOutputStream
    Read data from the source and write it into the destination.
    Do not use built-in file copy methods.
    The program should be capable of copying text as well as binary files.
*/

import java.io.*;
import java.util.*;

class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Source = "";
        String Destination = "";

        System.out.println("Enter source file : ");
        Source = sobj.nextLine();

        System.out.println("Enter destination file : ");
        Destination = sobj.nextLine();

        try
        {
            FileInputStream fis = new FileInputStream(Source);
            FileOutputStream fos = new FileOutputStream(Destination);

            int Data = 0;

            while((Data = fis.read()) != -1)
            {
                fos.write(Data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Source file does not exist");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}
