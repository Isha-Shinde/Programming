import java.io.*;

class program655
{
    public static void main(String A[]) throws IOException
    {
        File fobj = new File("Demo.txt"); // File is a inbuilt class in java. here it is used to create the file object

        fobj.createNewFile();  // Creates the actual file
    }
}