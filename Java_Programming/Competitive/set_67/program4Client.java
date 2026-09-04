/*
    Develop a client-server application where the client can check whether a particular file exists on the server machine.

   The client should send: EXISTS <filename>

   Example
   Client:
   EXISTS Demo.txt
   Server:
   Demo.txt exists on server

   If unavailable:
   Client:
   EXISTS Test.txt
   Server:
   Test.txt does not exist

   Requirements :
   The file checking operation must be performed by the server,not the client.
*/

import java.io.*;
import java.net.*;
import java.util.*;

class Program9Client
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("-------------------------------------");
            System.out.println("----- Marvellous Client Started -----");
            System.out.println("-------------------------------------");

            Socket socket = new Socket("127.0.0.1", 9000);

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());

            while(true)
            {
                System.out.println("Enter command : ");

                String command = sobj.nextLine();

                dos.writeUTF(command);

                String response = dis.readUTF();

                System.out.println(response);

                if(command.equalsIgnoreCase("QUIT"))
                {
                    break;
                }
            }

            socket.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}