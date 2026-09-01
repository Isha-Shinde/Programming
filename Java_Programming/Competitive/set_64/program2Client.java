/*
   Develop a client-server application where the server perform different number-related operations
   requested by the client.

   The client should send commands in the following format :
   
   EVEN <number>
   ODD <number>
   PRIME <number>
   PERFECT <number>
   FACTORIAL <number>
   REVERSE <number>

   Example
   client :
   PRIME 11

   Server :
   11 is a prime number.

   Client :
   FACTORIAL 5

   Server :
   FACTORIAL is : 120

   Requirements
   - write seprate methods for different mathematical operations.
   - Server should identify the requested operation.
   - Invalid commands should generate an appropriate message.
   - Server should support multiple clients.
 
*/
// client
import java.io.*;
import java.net.*;
import java.util.*;

class program2Client
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