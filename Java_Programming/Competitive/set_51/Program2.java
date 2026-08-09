/*
    Write a Java program to accept directory name from user
    and write names of all files from that directory into
    one newly created file named "Marvellous.txt".
*/

import java.io.*;
import java.util.*;

class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        FileOutputStream foobj = null;

        System.out.print("Enter directory name : ");
        String DirName = sobj.nextLine();

        File Directory = new File(DirName);

        if(Directory.exists() && Directory.isDirectory())
        {
            try
            {
                foobj = new FileOutputStream("Marvellous.txt");

                File Files[] = Directory.listFiles();

                for(int i = 0; i < Files.length; i++)
                {
                    if(Files[i].isFile())
                    {
                        String str = Files[i].getName() + "\n";
                        foobj.write(str.getBytes());
                    }
                }

                foobj.close();

                System.out.println("All file names are written into Marvellous.txt");
            }
            catch(IOException e)
            {
                System.out.println("Error : " + e);
            }
        }
        else
        {
            System.out.println("Directory does not exist.");
        }

        sobj.close();
    }
}