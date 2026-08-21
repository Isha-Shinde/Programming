import java.io.*;

class program669
{
    public static void main(String A[])
    {
        FileReader frobj = null;
        int iRet = 0;
        // Character array used as a buffer to store file data
        char Buffer[] = new char[10];

        try
        {
            // Opens Demo.txt file in read mode
            frobj = new FileReader("Demo.txt");
            
            // Reads up to 10 characters from the file into Buffer
            frobj.read(Buffer);

            // Displays the data stored in Buffer
            System.out.println(Buffer);
            
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        finally
        {
            
        }
    }
}