import java.io.*;

class program667
{
    public static void main(String A[])
    {
        FileReader frobj = null;
        
        try
        {
            frobj = new FileReader("Demo.txt");
            
            System.out.println((char)frobj.read()); // Reads one character from the file and displays it
            
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