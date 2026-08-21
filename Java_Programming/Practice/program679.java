import java.io.*;
import java.util.*;

class program678
{
    public static void main(String A[]) throws Exception
    {       
        String Fname = null;
        File fobj = null;
        FileInputStream fiobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        Fname = sobj.nextLine();

        fobj = new File(Fname);
        
        // Creates FileInputStream object to read byte data from file
        fiobj = new FileInputStream(fobj);
        
        // Creates a byte array buffer of size 50
        byte Arr[] = new byte[50];
        
        if(fobj.exists())
        {
            // Reads byte data from file and stores it in Arr
            fiobj.read(Arr);
            
            // Converts the byte array into a String
            String str = new String(Arr);
            
            // Displays the file data on the screen
            System.out.println(str);
        }
        else
        {
            System.out.println("There is no such file");
        }

    }
}