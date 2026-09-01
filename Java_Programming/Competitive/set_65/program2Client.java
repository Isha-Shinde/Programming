/*
   Extend the existing client-server application by implementing commands that provide information about
   the server.

   Implement : DATE         
               TIME         
               SERVERNAME         
               HELP         
               QUIT

   Example    client :
               DATE

   Server :
   27-08-2026

   Client :
   HELP

   Server : Available Commands :
                        DATE 
                        TIME
                        SERVERNAME
                        HELP
                        QUIT

   Requirements
   - HELP should display all commands supported by the server.
   - QUIT should terminate the connection with the current client without terminating the server.
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
