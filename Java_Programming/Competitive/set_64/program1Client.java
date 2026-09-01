/*
   Deploy a multithreaded client-server application in java that performs mathematical
   Operations remotely.

   The client should accept a command from the user and send that comand to the server.
   The server should parse the received command, perform the requested mathematical operration, and return the result to client.

   The server should support the following commands :

   ADD <no1> <no2>
   SUB <no1> <no2>
   MULT <no1> <no2>
   DIV <no1> <no2>
   MOD <no1> <no2>
   MAX <no1> <no2>
   MIN <no1> <no2>
   QUIT

   Example
   client :
   Enter command : MULT 10 20

   Server :
   Result is : 200

   Client :
   Enter Command : MAX 50 80

   Server :
   Maximum number is : 80

   Requirements
   - Server should run continously
   - Multiple clients should be handled using threads.
   - Invalid commands should be handled properly.
   - Divison by zero should be handled.
   - QUIT should disconnect only the current client.
 
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