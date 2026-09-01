/*
   Write a Java application that accepts the path of a directory and displays all files and directories present inside it.
   
   Example
   Enter directory:
   Marvellous

   Contents: Demo.txt
             Student.txt
             Java.pdf
             Images
             Backup

   Requirements : 
   Check whether the supplied path:
                              Exists
                              Is actually a directory
   Display all its contents
*/

import java.io.*;
import java.util.*;

class Program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Path = "";

        System.out.println("Enter directory : ");
        Path = sobj.nextLine();

        File fobj = new File(Path);

        if(fobj.exists() == false)
        {
            System.out.println("Directory does not exist");
            return;
        }

        if(fobj.isDirectory() == false)
        {
            System.out.println("Given path is not a directory");
            return;
        }

        System.out.println("Contents :");

        File Arr[] = fobj.listFiles();

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i].getName());
        }
    }
}

