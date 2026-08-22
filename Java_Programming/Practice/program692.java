import java.io.*;
import java.util.*;

class program692
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
                fiobj = new FileInputStream(fArr[i]);

                // Write file name and size 
                
                // Gets file name and file size
                String Data = fArr[i].getName() + " " + fArr[i].length() + "\n";

                // Converts header into byte array and writes it into packed file
                foobj.write(Data.getBytes());
                
                // Reads each byte from the current file until EOF
                while((iRet = fiobj.read()) != -1)
                {   
                    // Writes the read byte into the packed file
                    foobj.write(iRet);
                }

                foobj.write('\n'); // create new line for next file

                 // Closes the current input file
                  fiobj.close();
                
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }

    }
}