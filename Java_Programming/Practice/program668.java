import java.io.*;

class program668
{
    public static void main(String A[])
    {
        FileReader frobj = null;
        int iRet = 0;

        try
        {
            frobj = new FileReader("Demo.txt");
            
            while((iRet = frobj.read()) != -1) // Reads one character at a time from the file and stores its value in iRet until EOF
            {
                System.out.println((char)iRet);
            }
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