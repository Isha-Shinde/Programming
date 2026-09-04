/*
   Write a Java application that accepts the name of a text file and performs analysis on its contents.

   Calculate:
            Total characters
            Total words
            Total lines
            Uppercase characters
            Lowercase characters
            Digits
            Spaces

    Example
    File: Demo.txt

    Characters  : 250
    Words       : 45
    Lines       : 10
    Uppercase   : 15
    Lowercase   : 180 
    Digits      : 10
    Spaces      : 35
*/

import java.io.*;
import java.util.*;

class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = "";

        int Characters = 0;
        int Words = 0;
        int Lines = 0;
        int Uppercase = 0;
        int Lowercase = 0;
        int Digits = 0;
        int Spaces = 0;

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        try
        {
            FileInputStream fis = new FileInputStream(FileName);

            int ch = 0;
            boolean bWord = false;

            while((ch = fis.read()) != -1)
            {
                Characters++;

                if(ch == '\n')
                {
                    Lines++;
                }

                if(ch == ' ')
                {
                    Spaces++;
                }

                if(ch >= 'A' && ch <= 'Z')
                {
                    Uppercase++;
                }

                if(ch >= 'a' && ch <= 'z')
                {
                    Lowercase++;
                }

                if(ch >= '0' && ch <= '9')
                {
                    Digits++;
                }

                if(ch != ' ' && ch != '\n' && ch != '\t')
                {
                    if(bWord == false)
                    {
                        Words++;
                        bWord = true;
                    }
                }
                else
                {
                    bWord = false;
                }
            }

            fis.close();

            System.out.println("Characters : " + Characters);
            System.out.println("Words      : " + Words);
            System.out.println("Lines      : " + Lines);
            System.out.println("Uppercase  : " + Uppercase);
            System.out.println("Lowercase  : " + Lowercase);
            System.out.println("Digits     : " + Digits);
            System.out.println("Spaces     : " + Spaces);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}