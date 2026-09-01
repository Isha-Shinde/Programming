/*
   write a java program that accepts a filename  from the user  and 
   display the complete contents of that file.

   Example : Assume Demo.txt contains :
                                      Marvellous Infosystems
                                      Logic Building Batch
                                      Pune
            Output : Enter file name :
                     Demo.txt
            
            File Contents :
                           Marvellous Infosystems
                           Logic Building Batch
                           Pune

    Requirements : 
    Use : FileInputStream
    Display an appropriate error message if the specified file does not exist.
*/

import java.io.*;
import java.util.*;

class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = "";

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        try
        {
            FileInputStream fis = new FileInputStream(FileName);

            System.out.println("File Contents :");

            int ch = 0;

            while((ch = fis.read()) != -1)
            {
                System.out.print((char)ch);
            }

            fis.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}