import java.io.*;
import java.util.*;

class program691
{
    public static void main(String A[]) throws Exception
    {       
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;

        int iRet = 0;

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        System.out.println("Enter Folder name : ");
        FolderName = sobj.nextLine();

        System.out.println("Enter the name of packed file : ");
        PackFileName = sobj.nextLine();
        
        File fobjfolder = new File(FolderName);

        if((fobjfolder.exists()) && (fobjfolder.isDirectory()))
        {
            System.out.println("Folder exists");

            File fobjpack = new File(PackFileName);
            fobjpack.createNewFile();   // Pack file gets created

            foobj = new FileOutputStream(fobjpack);

            File fArr[] = fobjfolder.listFiles();
         
            System.out.println("Number of files in folder : "+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                // Creates FileInputStream for each file in the folder OR  Opens each file one by one for reading
                fiobj = new FileInputStream(fArr[i]);

                // Loop to read from fiobj & write to foobj
                while((iRet = fiobj.read()) != -1)// Reads each byte from the current file until EOF
                {   
                    foobj.write(iRet);// Writes the read byte into the packed file
                }
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }

    }
}