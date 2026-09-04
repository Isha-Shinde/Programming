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

class Program10Server
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("-------------------------------------");
            System.out.println("----- Marvellous Server Started -----");
            System.out.println("-------------------------------------");

            while(true)
            {
                System.out.println("Server is waiting for client request");

                Socket clientsocket = serversocket.accept();

                System.out.println("Client connected successfully");

                Thread t = new Thread(() -> HandleClientRequest(clientsocket));

                t.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }

    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous Server");

            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command received from client : " + command);

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from server");
                    break;
                }

                if(parts.length != 2)
                {
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                String FileName = parts[1];

                if(operation.equals("INFO"))
                {
                    File fobj = new File(FileName);

                    if(fobj.exists())
                    {
                        String info = "";

                        info = info + "File Name     : " + fobj.getName() + "\n";
                        info = info + "Size          : " + fobj.length() + " bytes\n";
                        info = info + "Readable      : " + fobj.canRead() + "\n";
                        info = info + "Writable      : " + fobj.canWrite() + "\n";
                        info = info + "Absolute Path : " + fobj.getAbsolutePath();

                        dos.writeUTF(info);
                    }
                    else
                    {
                        dos.writeUTF(FileName + " does not exist on server");
                    }
                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }
            }

            socket.close();

            System.out.println("Client disconnected");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}