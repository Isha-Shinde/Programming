import java.io.*;

class program666
{
    public static void main(String A[])
    {
        FileReader frobj = null;
        
        try
        {
            frobj = new FileReader("Demo.txt");
            
            System.out.println(frobj.read()); // Reads one character from the file and returns its ASCII/Unicode value
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