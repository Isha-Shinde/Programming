// Input   : my name is amit
// Output  : My Name Is Amit

// Input  : my NAME is AmIt
// Output  : My Name Is Amit

import java.util.*;

class program743
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();
        System.out.println(str);

        char Arr[] = str.toCharArray();      // Convert String into character array
        
        if(Arr[0] >= 'a' && Arr[0] <= 'z')    // Check whether first character is a lowercase letter
        {
          Arr[0] = (char)(Arr[0] - 32);       // Convert first character to uppercase
        }

        for(int i = 0; i < Arr.length;i++)
        {
            if(Arr[i] == ' ')
            {
                if(Arr[i+1] >= 'a' && Arr[i+1] <= 'z')   // Check whether next character is a lowercase letter
                {
                  Arr[i+1] = (char)(Arr[i+1] - 32);      // Convert next lowercase character into uppercase
                }
                
            }
        }
        String output = new String(Arr);                // Convert modified character array back into String
        System.out.println("Updated string is : "+output);

    }
}