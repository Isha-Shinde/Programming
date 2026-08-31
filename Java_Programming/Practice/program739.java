import java.util.*;

class program739
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");


        String Tokens[] = str.split(" ");

        System.out.println("NUmber of words : "+Tokens.length);

        String temp = null;
        temp = Tokens[0];   // Assume first word as largest

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() > temp.length()) // Check whether current word is longer than the word stored in temp
            {
               temp = Tokens[i];  // Store current word as largest word
            }
         }
         System.out.println("Largest word is : "+temp+" Having length : "+temp.length());


    }
}