import java.io.*;

class program670
{
    public static void main(String A[])
    {
        FileReader frobj = null;
        int iRet = 0;
        char Buffer[] = new char[20];

        try
        {
            // Opens Demo.txt for reading
            frobj = new FileReader("Demo.txt");
            
            // Reads 10 characters from the file and stores them
            // in Buffer starting from index 3
            frobj.read(Buffer,3,10);
            
            // Displays the contents of Buffer
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