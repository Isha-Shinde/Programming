/*
   write a java program that accepts a filename and textual data from user 
   and stores that data inside the specified file.

   Example :
           Enter file name:
           Demo.txt

           Enter Data :
           Marvellous Infosystems pune

           Data written successfully

    Requirements : 
    Use : FileOutputStream
    Do not use hiigher-level utility functions for writing the complete file.

*/

import java.io.*;
import java.util.*;

class Program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = "";
        String Data = "";

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        System.out.println("Enter Data : ");
        Data = sobj.nextLine();

        try
        {
            FileOutputStream fos = new FileOutputStream(FileName);

            byte Arr[] = Data.getBytes();

            fos.write(Arr);

            fos.close();

            System.out.println("Data written successfully");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}

