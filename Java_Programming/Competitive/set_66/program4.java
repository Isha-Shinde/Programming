/*
   Write a Java application that accepts a filename and displays detailed information about that file.

   Expected Output :

   File Name       : Demo.txt
   Absolute Path   : /Users/Marvellous/Demo.txt
   File Size       : 2048 bytes
   Readable        : true
   Writable        : true
   Hidden          : false
   Last Modified   : ....

   Requirements :
   Use the File class.
   If the file does not exist, display an appropriate message.
*/

import java.io.*;
import java.util.*;

class Program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = "";

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() == false)
        {
            System.out.println("File does not exist");
            return;
        }

        System.out.println("File Name       : " + fobj.getName());
        System.out.println("Absolute Path   : " + fobj.getAbsolutePath());
        System.out.println("File Size       : " + fobj.length() + " bytes");
        System.out.println("Readable        : " + fobj.canRead());
        System.out.println("Writable        : " + fobj.canWrite());
        System.out.println("Hidden          : " + fobj.isHidden());
        System.out.println("Last Modified   : " + fobj.lastModified());
    }
}