/*
    Write a Java program to accept directory name from user
    and write data of all files into one newly created file
    named as "Marvellous.txt".
*/

import java.io.*;
import java.util.*;

class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        System.out.print("Enter directory name : ");
        String DirName = sobj.nextLine();

        File Directory = new File(DirName);

        if(Directory.exists() && Directory.isDirectory())
        {
            try
            {
                foobj = new FileOutputStream("Marvellous.txt");

                File Files[] = Directory.listFiles();

                byte Buffer[] = new byte[1024];
                int iRet = 0;

                for(int i = 0; i < Files.length; i++)
                {
                    if(Files[i].isFile())
                    {
                        fiobj = new FileInputStream(Files[i]);

                        while((iRet = fiobj.read(Buffer)) != -1)
                        {
                            foobj.write(Buffer, 0, iRet);
                        }

                        fiobj.close();
                    }
                }

                foobj.close();

                System.out.println("Data of all files copied successfully into Marvellous.txt");
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