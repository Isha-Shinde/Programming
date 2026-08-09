/*
    Write a Java program to accept directory name from user
    and write data of all files along with their names into
    one newly created file named as "Marvellous.txt".
*/

import java.io.*;
import java.util.*;

class Program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String DirName = sobj.nextLine();

        File Directory = new File(DirName);

        if(Directory.exists() && Directory.isDirectory())
        {
            try
            {
                FileOutputStream fout = new FileOutputStream("Marvellous.txt");

                File Files[] = Directory.listFiles();

                byte Buffer[] = new byte[1024];
                int iRet = 0;

                for(int i = 0; i < Files.length; i++)
                {
                    if(Files[i].isFile())
                    {
                        // Write file name
                        String Header = "\nFile Name : " + Files[i].getName() + "\n";
                        Header += "-------------------------\n";

                        fout.write(Header.getBytes());

                        // Read data from current file
                        FileInputStream fin = new FileInputStream(Files[i]);

                        while((iRet = fin.read(Buffer)) != -1)
                        {
                            fout.write(Buffer, 0, iRet);
                        }

                        fout.write("\n\n".getBytes());

                        fin.close();
                    }
                }

                fout.close();

                System.out.println("Data of all files with file names copied successfully into Marvellous.txt");
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