/*
    write a java program to accept directory name from user and display all names of files from that directory.
*/

import java.io.*;
import java.util.*;

class Program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            String Files[] = fobj.list();

            System.out.println("Files in the directory are :");

            for(int i = 0; i < Files.length; i++)
            {
                System.out.println(Files[i]);
            }
        }
        else
        {
            System.out.println("Directory does not exist.");
        }

        sobj.close();
    }
}