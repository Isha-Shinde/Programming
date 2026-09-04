/*
   A Browser wants to store only the last 5 visited websites.

   visits :
           
           github.com
           openai.com
           oracle.com
           stackoverflow.com
           youtube.com

    After all visits, history should contain :
    github.com
    openai.com
    oracle.com
    stackoverflow.com
    youtube.com
*/

import java.util.*;

class program1
{
    public static void main(String A[])
    {
        ArrayDeque<String> dq = new ArrayDeque<>();

        dq.addLast("google.com");
        dq.addLast("github.com");
        dq.addLast("openai.com");
        dq.addLast("oracle.com");
        dq.addLast("stackoverflow.com");

        if(dq.size() == 5)
        {
            dq.removeFirst();
        }

        dq.addLast("youtube.com");

        System.out.println("After all visits, history should contain : ");
        for(String website : dq)
        {
            System.out.println(website);

        }
    }
}