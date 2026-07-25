import java .util.*;

class program278
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String data = null;
        StringX strobj = new StringX();
        String sRet = null;

        System.out.println("Enter String :");
        data = sobj.nextLine();
        
        sRet = strobj.Update(data);
        System.out.println("Updated string is :"+sRet);
    }
}

class StringX
{
    public String Update(String str)
    {
       char Arr[] = str.toCharArray();
       int i = 0;

       for(i = 0; i < Arr.length; i++)
       {
          if(Arr[i] == 'A' || Arr[i] == 'a')
          {
            Arr[i] = '_';
          }
       }
       String ret = new String(Arr);           //option 1 (to return string)

       return ret;
    }
}