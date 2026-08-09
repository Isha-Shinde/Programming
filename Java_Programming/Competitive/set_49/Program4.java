/*
    write a java program to accept file name from user and 
    create new file of that name if it is not existing.
*/

import java.io.*;
import java.util.*;
class Program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName;
        File fobj = null;

        System.out.println("Enter the file name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        try
        {
            if(fobj.exists())
            {
                System.out.println("file already exists");
            }
            else
            {
                if(fobj.createNewFile())
                {
                    System.out.println("New file created successfully");
                }
                else
                {
                    System.out.println("Unable to create file");
                }
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception : "+e);
        }
        sobj.close();
    }
}
