import java.io.*;
import java.util.*;

class program686
{
    public static void main(String A[]) throws Exception
    {       
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;

        System.out.println("Enter Folder name : ");
        FolderName = sobj.nextLine();

        File fobj = new File(FolderName);
        
        // Checks whether the folder exists and is a directory
        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Folder exists");
        }
        else
        {
            System.out.println("There is no such folder");
        }

    }
}