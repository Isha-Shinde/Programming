/*
   Develop a client-server appliaction that performs different string operations.

   The client should send a command containing an operation and a string.

   Supported comands :

   LENGTH <string>
   UPPER <string>
   POWER <string>
   REVERSE <string>
   PALINDROME <string>
   VOWELS <string>

   Example
   client :
   REVERSE Marvellous

   Server :
   suollevraM

   Client :
   VOWELS Marvellous

   Server :
   Number of vowels : 4

   Requirements
   - The server should perform all string processing. The client should only accept input and display the response.
 
*/

// client
import java.io.*;
import java.net.*;
import java.util.*;

class program1Client
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("-------------------------------------");
            System.out.println("----- Marvellous Client Started -----");
            System.out.println("-------------------------------------");

            Socket socket = new Socket(
                                        "127.0.0.1",
                                        9000
                                        );

            System.out.println("Connection with Server is suucesful");
        
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());

            while(true)
            {
                System.out.println("-------------------------------------");
                System.out.println("Mathematical commands");
                System.out.println("-------------------------------------");

                System.out.println("Enter command : ");
                
                String command = sobj.nextLine();

                dos.writeUTF(command);

                String response = dis.readUTF();

                System.out.println(response);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }
}
