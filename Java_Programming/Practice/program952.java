// first non-repeating character

// expected output : java program951.java programming

import java.util.LinkedHashMap;
import java.util.TreeMap;

class program952
{
    public static void main(String A[])
    {
        if(A.length != 1)
        {
            System.out.println("Invalid Number of arguments");
            return;
        }

        String str = A[0];

        LinkedHashMap <Character,Integer> frequency = new LinkedHashMap <Character,Integer>();

        for(char ch : str.toCharArray())
        {
            frequency.put(ch,frequency.getOrDefault(ch, 0) + 1);

        }

        System.out.println(frequency);
        
    }
}