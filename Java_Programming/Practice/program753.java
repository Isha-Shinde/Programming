import java.util.*;

class program753
{
    public static void main(String A[])
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        char Arr[] = str.toCharArray();

        int Frequency[] = new int[26];  // Create array to store frequency of a-z

        // a    b   c   d 
        // 97   98  99  100
        // 0    1   2   3

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency[(int)Arr[i] - 97]++; // Convert character into index and increase its frequency
            }
        } 

        System.out.println("Frequency of each letter is : ");

        for(i = 0 ;i < Frequency.length; i++)
        {
            System.out.println(((char)(i + 97))+" : "+Frequency[i]); // Display frequency of each letter from a to z with character
        }
    }
}