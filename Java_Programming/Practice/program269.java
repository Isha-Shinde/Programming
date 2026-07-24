import java .util.*;

class program269
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String data = null;
        StringX strobj = new StringX();

        System.out.println("Enter String :");
        data = sobj.nextLine();

        strobj.Display(data);
    }
}

class StringX
{
    public void Display(String str)
    {
        System.out.println("received string is :"+str);
    }
}