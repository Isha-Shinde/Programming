import java.util.*;
class program887
{
    public static void main(String A[])
    {
       Integer Arr[] = {10,13,34,21,15,7,24,}; //(Wrapper class)

       
       for(int no : Arr)
       {
          System.out.print(no+"\t");
       }

       System.out.println();

       Arrays.sort(Arr,Collections.reverseOrder()); //(sorted with decresing order due to collection)

       
       for(int no : Arr)
       {
          System.out.print(no+"\t");
       }

       System.out.println();
    }
}