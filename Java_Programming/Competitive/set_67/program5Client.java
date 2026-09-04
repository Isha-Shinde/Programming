/*
  Develop a client-server application where the client can request information about a file stored on the server.

  Command: INFO <filename>

  Example
  Client:
  INFO Demo.txt

  Server:
  File Name    : Demo.txt
  Size         : 2450 bytes
  Readable     : true
  Writable     : true
  Absolute Path: /ServerData/Demo.txt
  Handle nonexistent files appropriately.
*/
import java.io.*;
import java.net.*;
import java.util.*;

class Program10Client
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