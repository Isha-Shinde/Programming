/*
    Write a Java program to accept directory name from user
    and display all file names and size of each file.
*/

import java.io.*;
import java.util.*;

class Program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File Files[] = fobj.listFiles();

            for(int i = 0; i < Files.length; i++)
            {
                if(Files[i].isFile())
                {
                    System.out.println(Files[i].getName() + "\t\t" + Files[i].length());
                }
            }
        }
        else
        {
            System.out.println("Directory does not exist.");
        }

        sobj.close();
    }
}