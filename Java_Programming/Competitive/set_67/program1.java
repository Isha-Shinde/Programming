/*
   Extend the previous assignment to distinguish between files and directories.

   Expected Output: 
                  [FILE] Demo.txt
                  [FILE] Student.txt
                  [FILE] Java.pdf
                  [DIR] Images
                  [DIR] Backup
                  For files, also display their sizes.

   Example
          [FILE]   Demo.txt      450 bytes
          [FILE]   Java.pdf      24500 bytes
          [DIR]    Images

   This assignment should help students understand how an FTP server generates a directory listing.
*/

import java.io.*;
import java.util.*;

class Program1
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

        File Arr[] = fobj.listFiles();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].isFile())
            {
                System.out.println("[FILE] " + Arr[i].getName() +
                                   "    " + Arr[i].length() + " bytes");
            }
            else if(Arr[i].isDirectory())
            {
                System.out.println("[DIR]  " + Arr[i].getName());
            }
        }
    }
}

