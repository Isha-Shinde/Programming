/*
    Write a Java program that accepts a directory path and a filename from the user.
    Search for the specified file inside the directory.
    
    Example 
           Enter directory: ServerData
           
           Enter file to search: Demo.txt
    
           File found
                    Name: Demo.txt
                    Size: 2450 bytes
                    Path: /ServerData/Demo.txt
           If unavailable:
                    Demo.txt not found
*/

import java.io.*;
import java.util.*;

class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Directory = "";
        String FileName = "";

        System.out.println("Enter directory : ");
        Directory = sobj.nextLine();

        System.out.println("Enter file to search : ");
        FileName = sobj.nextLine();

        File fobj = new File(Directory);

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

        boolean bFlag = false;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].isFile() && Arr[i].getName().equals(FileName))
            {
                System.out.println("File found");
                System.out.println("Name : " + Arr[i].getName());
                System.out.println("Size : " + Arr[i].length() + " bytes");
                System.out.println("Path : " + Arr[i].getAbsolutePath());

                bFlag = true;
                break;
            }
        }

        if(bFlag == false)
        {
            System.out.println(FileName + " not found");
        }
    }
}
