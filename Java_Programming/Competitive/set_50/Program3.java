/*
    write java program to accept directory name from user and create that directory.
*/

import java.io.*;
import java.util.*;

class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists())
        {
            System.out.println("Directory already exists.");
        }
        else
        {
            if(fobj.mkdir())
            {
                System.out.println("Directory created successfully.");
            }
            else
            {
                System.out.println("Unable to create directory.");
            }
        }

        sobj.close();
    }
}